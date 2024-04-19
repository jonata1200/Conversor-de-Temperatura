package com.example.conversordetemperatura

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversordetemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btConverter.setOnClickListener{

            val celsius = binding.editCelsius.text.toString()
            val txtResultado = binding.textResultado

            if (celsius.isEmpty()){

                txtResultado.setText("Preencha o campo com algum valor!!!")
                txtResultado.setTextColor(getColor(R.color.red))

            }else{

                val fahrenheit = String.format("%.2f",celsius.toDouble() * 1.8 + 32)

                txtResultado.setText(fahrenheit + " ºF")
                txtResultado.setTextColor(getColor(R.color.blue))

            }

        }

    }
}