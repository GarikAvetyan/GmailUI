package com.fbf.gmailcopy.ui.compose.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fbf.gmailcopy.R
import com.fbf.gmailcopy.databinding.ActivityComposeBinding
import com.fbf.gmailcopy.databinding.ActivityMainBinding

class ComposeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityComposeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComposeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}