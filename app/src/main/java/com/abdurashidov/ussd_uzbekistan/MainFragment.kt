package com.abdurashidov.ussd_uzbekistan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.abdurashidov.ussd_uzbekistan.databinding.FragmentMainBinding
import com.abdurashidov.ussd_uzbekistan.models.Beeline


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentMainBinding.inflate(layoutInflater)

        binding.apply {

            beeline.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim))
            ucell.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_2))
            mobiuz.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_3))
            uzmobile.startAnimation(AnimationUtils.loadAnimation(context, R.anim.card_anim_4))

            val navOption=NavOptions.Builder()
            navOption.setEnterAnim(R.anim.ochilish_1)
            navOption.setPopEnterAnim(R.anim.ochilishi_2)
            navOption.setExitAnim(R.anim.yopilishi_2)
            navOption.setPopExitAnim(R.anim.yopilishi_1)

            beeline.setOnClickListener {
                findNavController().navigate(R.id.companyFragment, bundleOf("key" to 1), navOption.build())
            }
            ucell.setOnClickListener {
                findNavController().navigate(R.id.companyFragment, bundleOf("key" to 2), navOption.build())
            }
            mobiuz.setOnClickListener {
                findNavController().navigate(R.id.companyFragment, bundleOf("key" to 3), navOption.build())
            }
            uzmobile.setOnClickListener {
                findNavController().navigate(R.id.companyFragment, bundleOf("key" to 4), navOption.build())
            }


        }


        return  binding.root
    }


}