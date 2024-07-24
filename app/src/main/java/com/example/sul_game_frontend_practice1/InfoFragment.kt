package com.example.sul_game_frontend_practice1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.sul_game_frontend_practice1.data.User

import com.example.sul_game_frontend_practice1.databinding.FragmentInfoBinding
import com.example.sul_game_frontend_practice1.editprofile.EditProfileActivity
import com.example.sul_game_frontend_practice1.editprofile.EditProfileImageActivity
import java.time.LocalDate

class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentInfoBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonClicked()
        initInfo()
    }

    private fun initInfo() {
        val dummyUser = User("구해조", "세종대학교", R.drawable.img_student,"user@gmail.com", LocalDate.of(2000, 1, 1))

        binding.tvInfoUniv.text = dummyUser.organization
        binding.tvInfoName.text = dummyUser.name
        Glide.with(this)
            .load(dummyUser.profileImage)
            .into(binding.civInfo)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun buttonClicked(){
        binding.btn3Info.setOnClickListener{
            val intent = Intent(activity, EditProfileActivity::class.java)
            startActivity(intent)
        }

        binding.btn4Info.setOnClickListener{
            val intent = Intent(activity, EditProfileImageActivity::class.java)
            startActivity(intent)
        }
    }

}