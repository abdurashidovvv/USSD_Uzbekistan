package com.abdurashidov.ussd_uzbekistan

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.abdurashidov.ussd_uzbekistan.databinding.FragmentCompanyBinding

class CompanyFragment : Fragment() {

    private lateinit var binding: FragmentCompanyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentCompanyBinding.inflate(layoutInflater)

        binding.apply {

            val index=arguments?.getInt("key", 1)

            val navOption= NavOptions.Builder()
            navOption.setEnterAnim(R.anim.ochilish_1)
            navOption.setPopEnterAnim(R.anim.ochilishi_2)
            navOption.setExitAnim(R.anim.yopilishi_2)
            navOption.setPopExitAnim(R.anim.yopilishi_1)

            when(index){
                1->{
                    companies.setBackgroundColor(Color.parseColor("#FFC91E"))
                    tooblar.setBackgroundColor(Color.parseColor("#FFC91E"))
                    tooblar.text="BEELINE"
                    internetLiner.setBackgroundColor(Color.parseColor("#FFC91E"))
                    tarifLiner.setBackgroundColor(Color.parseColor("#FFC91E"))
                    daqiqaLiner.setBackgroundColor(Color.parseColor("#FFC91E"))
                    aksiyaLiner.setBackgroundColor(Color.parseColor("#FFC91E"))
                    smsLiner.setBackgroundColor(Color.parseColor("#FFC91E"))
                    ussdLiner.setBackgroundColor(Color.parseColor("#FFC91E"))
                }
                2->{
                    companies.setBackgroundColor(Color.parseColor("#511C70"))
                    tooblar.setBackgroundColor(Color.parseColor("#511C70"))
                    tooblar.text="UCELL"
                    internetLiner.setBackgroundColor(Color.parseColor("#511C70"))
                    tarifLiner.setBackgroundColor(Color.parseColor("#511C70"))
                    daqiqaLiner.setBackgroundColor(Color.parseColor("#511C70"))
                    aksiyaLiner.setBackgroundColor(Color.parseColor("#511C70"))
                    smsLiner.setBackgroundColor(Color.parseColor("#511C70"))
                    ussdLiner.setBackgroundColor(Color.parseColor("#511C70"))
                }
                3->{
                    companies.setBackgroundColor(Color.parseColor("#E43641"))
                    tooblar.setBackgroundColor(Color.parseColor("#E43641"))
                    tooblar.text="MOBIUZ"
                    internetLiner.setBackgroundColor(Color.parseColor("#E43641"))
                    tarifLiner.setBackgroundColor(Color.parseColor("#E43641"))
                    daqiqaLiner.setBackgroundColor(Color.parseColor("#E43641"))
                    aksiyaLiner.setBackgroundColor(Color.parseColor("#E43641"))
                    smsLiner.setBackgroundColor(Color.parseColor("#E43641"))
                    ussdLiner.setBackgroundColor(Color.parseColor("#E43641"))
                }
                4->{
                    companies.setBackgroundColor(Color.parseColor("#01ABFB"))
                    tooblar.setBackgroundColor(Color.parseColor("#01ABFB"))
                    tooblar.text="UZMOBILE"
                    internetLiner.setBackgroundColor(Color.parseColor("#01ABFB"))
                    tarifLiner.setBackgroundColor(Color.parseColor("#01ABFB"))
                    daqiqaLiner.setBackgroundColor(Color.parseColor("#01ABFB"))
                    aksiyaLiner.setBackgroundColor(Color.parseColor("#01ABFB"))
                    smsLiner.setBackgroundColor(Color.parseColor("#01ABFB"))
                    ussdLiner.setBackgroundColor(Color.parseColor("#01ABFB"))
                }
            }

            internet.setOnClickListener {
                findNavController().navigate(R.id.serviceListFragment, bundleOf("key" to index, "service_type" to 1), navOption.build())
            }
            tariflar.setOnClickListener {
                findNavController().navigate(R.id.serviceListFragment, bundleOf("key" to index, "service_type" to 2), navOption.build())
            }
            daqiqalar.setOnClickListener {
                findNavController().navigate(R.id.serviceListFragment, bundleOf("key" to index, "service_type" to 3), navOption.build())
            }
            aksiya.setOnClickListener {
                findNavController().navigate(R.id.serviceListFragment, bundleOf("key" to index, "service_type" to 4), navOption.build())
            }
            sms.setOnClickListener {
                findNavController().navigate(R.id.serviceListFragment, bundleOf("key" to index, "service_type" to 5), navOption.build())
            }
            ussd.setOnClickListener {
                findNavController().navigate(R.id.serviceListFragment, bundleOf("key" to index, "service_type" to 6), navOption.build())
            }

        }

        return binding.root
    }


}