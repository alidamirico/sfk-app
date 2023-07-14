package com.mysfk.android

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.work.Data

class ReviewAdaptor():RecyclerView.Adapter<ReviewAdaptor.ViewHolder>() {


    private var titles = arrayOf("بخاری","دریچه","فن و پد","آبیاری","فن چرخشی","مه پاش","پرده")
    private var details = arrayOf("جزیئات تست","جزیئات تست","جزیئات تست","جزیئات تست","جزیئات تست","جزیئات تست","جزیئات تست")
    private var images = intArrayOf(R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewAdaptor.ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.card_review,parent,false)
        return ViewHolder(v)

    }


    private lateinit var itemClickListener: View.OnClickListener
    public fun setItemClickListener(listener: View.OnClickListener) {
        itemClickListener = listener
    }

    override fun onBindViewHolder(holder: ReviewAdaptor.ViewHolder, position: Int) {
        holder.tittleItem.text = titles[position]
        holder.ditealItem.text = details[position]
        holder.imageItem.setImageResource(images[position])

    }

    override fun getItemCount(): Int {
        return titles.size
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imageItem : ImageView
        var tittleItem : TextView
        var ditealItem :TextView
        init {
            imageItem = itemView.findViewById(R.id.imageReview)
            tittleItem = itemView.findViewById(R.id.titleReview)
            ditealItem = itemView.findViewById(R.id.detReview)
            itemView.setOnClickListener{
                itemView.tag = this
                itemView.setOnClickListener(itemClickListener)
            }

        }


        }
}
