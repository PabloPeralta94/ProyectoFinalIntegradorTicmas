package com.curso.android.app.practica.comparacionapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.comparacionapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.button.setOnClickListener{
            val text1 = binding.editTextText4.text.toString()
            val text2 = binding.editTextText5.text.toString()

            viewModel.compareStrings(text1, text2)
        }

        viewModel.resultText.observe(this) { result ->
            binding.textView4.text = result
        }
    }
}