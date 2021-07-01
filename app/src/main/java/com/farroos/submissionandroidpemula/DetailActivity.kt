package com.farroos.submissionandroidpemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Detail Food"
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        setContentView(R.layout.activity_detail)

        // menangkap hasil putExtra yang dibuat di ListFoodAdapter menggunakan key putExtra
        var title =intent.getStringExtra("TITLE")
        var detail =intent.getStringExtra("DETAIL")
        var image =intent.getIntExtra("IMAGE",1)

        // set dengan id yang ada
        tv_item_name.text = title
        tv_detail.text = detail
        img_food.setImageResource(image)
    }

//    override fun onNavigateUp(): Boolean {
//        finish()
//        return super.onNavigateUp()
//    }


}