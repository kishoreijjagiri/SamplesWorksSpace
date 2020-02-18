package com.kishore.samplesworksspace

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(var count:Int) :RecyclerView.Adapter<PagerVH>()
{

    //array of colors to change the background color of screen
    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
       return PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))
    }

    override fun getItemCount(): Int {
        return count
    }

    override fun onBindViewHolder(holder: PagerVH, position: Int) {

        holder.tvTitle.text = position.toString()
        holder.container.setBackgroundResource(colors[position])

        /*if(position == 0){
            holder.tvTitle.text = "ViewPager2"
            holder.tvAbout.text = "In this application we will learn about ViewPager2"
            holder.container.setBackgroundResource(colors[position])
        }
        if(position == 1) {
            holder.tvTitle.text = "ViewPager2"
            holder.tvAbout.text = "In this application we will learn about ViewPager2"
            holder.container.setBackgroundResource(colors[position])
        }
        if(position == 2) {
            holder.tvTitle.text = "ViewPager2"
            holder.tvAbout.text = "In this application we will learn about ViewPager2"
            holder.container.setBackgroundResource(colors[position])
        }
        if(position == 3) {
            holder.tvTitle.text = "ViewPager2"
            holder.tvAbout.text = "In this application we will learn about ViewPager2"
            holder.container.setBackgroundResource(colors[position])
        }*/

    }


}
 class PagerVH(itemview:View):RecyclerView.ViewHolder(itemview)
 {
  var  tvTitle =itemview.findViewById(R.id.tvTitle) as AppCompatTextView
     var  tvAbout =itemview.findViewById(R.id.tvAbout) as TextView
     var  container =itemview.findViewById(R.id.container) as ConstraintLayout

 }
