package com.abdurashidov.ussd_uzbekistan

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.abdurashidov.ussd_uzbekistan.adapter.RvAdapter
import com.abdurashidov.ussd_uzbekistan.databinding.FragmentServiceListBinding
import com.abdurashidov.ussd_uzbekistan.models.Beeline
import com.abdurashidov.ussd_uzbekistan.models.MyInfo
import kotlin.properties.Delegates


class ServiceListFragment : Fragment(), RvAdapter.RvClick{

    private lateinit var binding: FragmentServiceListBinding
    private lateinit var list: ArrayList<MyInfo>
    private val TAG = "ServiceListFragment"

//    private val company=arguments?.getInt("key", 1)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentServiceListBinding.inflate(layoutInflater)

        list=ArrayList()

        val company=arguments?.getInt("key", 1)
        val service_type=arguments?.getInt("service_type", 1)


        when(company){
            1->{
                binding.listFragment.setBackgroundColor(Color.parseColor("#FFC91E"))
                for (myInfo in Beeline.beelineList) {
                    Log.d(TAG, "onCreateView: Yeah")
                    if(myInfo.serviceType==service_type){
                        list.add(myInfo)
                    }
                }
                binding.rv.adapter=RvAdapter(list, this)
            }
            2->{
                binding.listFragment.setBackgroundColor(Color.parseColor("#511C70"))
                Beeline.ucellList.forEach {
                    if (it.serviceType==service_type){
                        list.add(it)
                    }
                }
                binding.rv.adapter=RvAdapter(list, this)
            }
            3->{
                binding.listFragment.setBackgroundColor(Color.parseColor("#E43641"))
                Beeline.mobiuzList.forEach {
                    if (it.serviceType==service_type){
                        list.add(it)
                    }
                }
                binding.rv.adapter=RvAdapter(list, this)
            }
            4->{
                binding.listFragment.setBackgroundColor(Color.parseColor("#01ABFB"))
                Beeline.uzmobileList.forEach {
                    if (it.serviceType==service_type){
                        list.add(it)
                    }
                }
                binding.rv.adapter=RvAdapter(list, this)
            }
        }


        return binding.root
    }

    override fun onClick(myInfo: MyInfo) {
        val navOption= NavOptions.Builder()
        navOption.setEnterAnim(R.anim.ochilish_1)
        navOption.setPopEnterAnim(R.anim.ochilishi_2)
        navOption.setExitAnim(R.anim.yopilishi_2)
        navOption.setPopExitAnim(R.anim.yopilishi_1)
        findNavController().navigate(R.id.infoFragment, bundleOf("info" to myInfo), navOption.build())
    }

}