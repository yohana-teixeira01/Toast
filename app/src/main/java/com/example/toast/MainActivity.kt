package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{
            val nome = binding.editNome.text.toString().trim()
            val snome = binding.editSobrenome.text.toString().trim()

            if(nome.isEmpty() || snome.isEmpty()){
                binding.textResultado.text = "Nome não inserido."
                Toast.makeText(applicationContext, "Nome não inserido.", Toast.LENGTH_LONG).show()
            }else{
                binding.textResultado.text = "Olá $nome $snome"
                Toast.makeText(applicationContext, "Olá $nome $snome", Toast.LENGTH_SHORT).show()
            }
        }
    }
}