package com.example.sul_game_frontend_practice1.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sul_game_frontend_practice1.R
import com.example.sul_game_frontend_practice1.databinding.ActivityCreateDetailBinding



class CreateDetail : AppCompatActivity() {
    private lateinit var binding: ActivityCreateDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCreateDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val createDetailList = ArrayList<CreateDetailComment>()
        createDetailList.add(
            CreateDetailComment("다예"
                ,"아아아아 힘들어"
                ,R.drawable.btn_star_on
            )
        )
        createDetailList.add(

            CreateDetailComment("뽀로로"
                ,"노는게 너무 좋아"
                ,R.drawable.btn_star_on

            )
        )
    }
}