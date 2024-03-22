package com.example.tugas3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val IntentHome = Intent( this, home::class.java)
            startActivity(IntentHome)
        }

        binding.forgot.setOnClickListener {
            val Intentforgot = Intent( this, forgot::class.java)
            startActivity(Intentforgot)
        }

        binding.register.setOnClickListener {
            val Intentregister = Intent( this, register::class.java)
            startActivity(Intentregister)
        }
    }
}