package com.kishore.samplesworksspace.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager2.widget.ViewPager2
import com.kishore.samplesworksspace.R
import com.kishore.samplesworksspace.ViewPagerAdapter

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel
   lateinit var viewpager :ViewPager2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        viewpager =root.findViewById(R.id.viewpager2)
        //viewpager.orientation=ViewPager2.ORIENTATION_VERTICAL
        var addbtn:Button=root.findViewById(R.id.add_btn)
        var count =4
        addbtn.setOnClickListener {
            count++
            viewpager.adapter= ViewPagerAdapter(count)
            viewpager.setCurrentItem(count-2)
        }
       viewpager.adapter= ViewPagerAdapter(count)
        viewpager.setCurrentItem(count-2)

        return root
    }
}