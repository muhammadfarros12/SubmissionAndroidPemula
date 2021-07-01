package com.farroos.submissionandroidpemula.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.farroos.submissionandroidpemula.DetailActivity
import com.farroos.submissionandroidpemula.Food
import com.farroos.submissionandroidpemula.R

class ListFoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_food)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_food, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.img)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name

        // agar item yang kita buat bisa kita klik
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("TITLE", listFood[position].name)
            intent.putExtra("DETAIL", listFood[position].detail)
            intent.putExtra("IMAGE", listFood[position].img)

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }
}