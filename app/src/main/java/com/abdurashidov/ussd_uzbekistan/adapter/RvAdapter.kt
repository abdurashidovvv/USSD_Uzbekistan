package com.abdurashidov.ussd_uzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.abdurashidov.ussd_uzbekistan.R
import com.abdurashidov.ussd_uzbekistan.databinding.RvItemBinding
import com.abdurashidov.ussd_uzbekistan.models.MyInfo

class RvAdapter(val list:ArrayList<MyInfo>, val rvClick: RvClick): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val rvItem: RvItemBinding): RecyclerView.ViewHolder(rvItem.root){
        fun onBind(myInfo: MyInfo){

            val animation = AnimationUtils.loadAnimation(rvItem.root.context, R.anim.my_rv_anim)
            rvItem.root.startAnimation(animation)

            rvItem.name.text=myInfo.name
            rvItem.shortInfo.text=myInfo.shortInfo
            rvItem.narx.text=myInfo.narx

            rvItem.root.setOnClickListener {
                rvClick.onClick(myInfo)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface RvClick{
        fun onClick(myInfo: MyInfo)
    }

}