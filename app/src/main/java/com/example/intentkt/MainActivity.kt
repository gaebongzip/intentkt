package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener {
            var intent = Intent(this, SubActivity::class.java)
            intent.putExtra("msg", binding.tvSendMsg.text.toString())
            startActivity(intent)
            finish()
        }
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}