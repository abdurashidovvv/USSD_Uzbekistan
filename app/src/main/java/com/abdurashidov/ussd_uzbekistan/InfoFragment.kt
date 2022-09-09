package com.abdurashidov.ussd_uzbekistan
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.abdurashidov.ussd_uzbekistan.databinding.FragmentInfoBinding
import com.abdurashidov.ussd_uzbekistan.models.MyInfo

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding=FragmentInfoBinding.inflate(layoutInflater)

        val myInfo=arguments?.getSerializable("info") as MyInfo
        val company=arguments?.getInt("key", 1)


        binding.name.text=myInfo.name
        binding.shortMessage.text=myInfo.shortInfo.toString()
        binding.longMessage.text=myInfo.longInfo.toString()
        if (myInfo.code!=""){
            binding.code.isVisible=true
            binding.code.text=myInfo.code
        }

        binding.code.setOnClickListener {
            val number="911701078"
            val intent=Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel: "+number))
            startActivity(intent)
        }

        when(company){
            1->{binding.container.setBackgroundColor(Color.parseColor("#FFC91E"))}
            2->{binding.container.setBackgroundColor(Color.parseColor("#511C70"))}
            3->{binding.container.setBackgroundColor(Color.parseColor("#E43641"))}
            4->{binding.container.setBackgroundColor(Color.parseColor("#01ABFB"))}
        }

        return binding.root
    }

}