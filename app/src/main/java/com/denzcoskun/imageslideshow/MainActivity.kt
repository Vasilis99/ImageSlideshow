package com.denzcoskun.imageslideshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ActionTypes
import com.denzcoskun.imageslider.constants.AnimationTypes
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemChangeListener
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.interfaces.TouchListener
import com.denzcoskun.imageslider.models.SlideModel

/**
 * Created by Deniz Coşkun on 6/23/2020.
 * denzcoskun@hotmail.com
 * İstanbul
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider) // init imageSlider

        val imageList = ArrayList<SlideModel>()
        // Create image list
        imageList.add(SlideModel("https://th.bing.com/th/id/R.4ff424801900b785973a54256af830e1?rik=EzEGu0FHm1suvg&pid=ImgRaw&r=0", "Car 1"))
        imageList.add(SlideModel("https://car-images.bauersecure.com/pagefiles/26719/amclaren-2016.jpg", "Car 2"))
        imageList.add(SlideModel("https://cdn.pixabay.com/photo/2023/08/26/12/28/tiger-8214815_1280.png", "Tiger"))

        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP)

        imageSlider.setSlideAnimation(AnimationTypes.ZOOM_OUT)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                // You can listen here.
                println("normal")
            }

            override fun doubleClick(position: Int) {
                // Do not use onItemSelected if you are using a double click listener at the same time.
                // Its just added for specific cases.
                // Listen for clicks under 250 milliseconds.
                println("its double")
            }
        })

        imageSlider.setItemChangeListener(object : ItemChangeListener {
            override fun onItemChanged(position: Int) {
                //println("Pos: " + position)
            }
        })

        imageSlider.setTouchListener(object : TouchListener {
            override fun onTouched(touched: ActionTypes, position: Int) {
                if (touched == ActionTypes.DOWN){
                    imageSlider.stopSliding()
                } else if (touched == ActionTypes.UP) {
                    imageSlider.startSliding(1000)
                }
            }
        })
    }
}
