package com.farroos.submissionandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.farroos.submissionandroidpemula.adapter.ListFoodAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var rcvFoods: RecyclerView
    // data yang akan dipanggil di list
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = "My Recyclerview"
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)

        rcvFoods = findViewById(R.id.rcv_food)
        rcvFoods.setHasFixedSize(true)

        list.addAll(FoodsData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rcvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rcvFoods.adapter = listFoodAdapter
    }

    // untuk menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode) {
            R.id.action_profile -> {
                val intent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}