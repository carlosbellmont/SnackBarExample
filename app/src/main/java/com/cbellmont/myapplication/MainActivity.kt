package com.cbellmont.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cbellmont.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.b1.setOnClickListener {
            Snackbar.make(binding.root, "Snack 1", Snackbar.LENGTH_SHORT).show()
        }
        binding.b2.setOnClickListener {
            Snackbar.make(binding.root, "Snack 2", Snackbar.LENGTH_LONG).show()
        }

        binding.b3.setOnClickListener {
            val snack = Snackbar.make(binding.root, "Snack 3", Snackbar.LENGTH_INDEFINITE)
            snack.setAction("Close") {
                snack.dismiss()
            }
            snack.show()
        }

    }
}