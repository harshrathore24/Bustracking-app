package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.codingstuff.loginandsignup.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var user: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = FirebaseAuth.getInstance()
//        if (user.currentUser != null) {
//            user.currentUser?.Let {
//                binding.tvUserEmail.text = it.email
//            }
//        }
        binding.logout.setOnClickListener {
            user.signOut()
            startActivity(
                Intent(this, SignInActivity::class.java)
            )
            finish()
        }
    }

//    private fun LayoutInflater(): LayoutInflater {
//
//    }

//    fun SignInActivity(view: View) {
//        val intent = Intent(this, SignInActivity::class.java)
//        startActivity(intent)
//    }
}