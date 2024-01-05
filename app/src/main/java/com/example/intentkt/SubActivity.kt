package com.example.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentkt.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private var mBinding : ActivitySubBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sub)
        mBinding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("msg")){
            binding.tvGetMsg.text = intent.getStringExtra("msg")
        }
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }

}