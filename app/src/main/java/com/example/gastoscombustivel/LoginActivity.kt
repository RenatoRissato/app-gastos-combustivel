package com.example.gastoscombustivel

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gastoscombustivel.databinding.ActivityLoginBinding
import android.content.Intent


class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener(this)

        }

        override fun onClick(v: View){
            if(v.id == R.id.btnEntrar){
                botaoEntrar()
            }
    }

    private fun botaoEntrar(){
        val senha = binding.editSenha.text.toString()
        if( senha == "Einstein"){
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }else{
            Toast.makeText(this,"Senha inválida", Toast.LENGTH_SHORT).show()
        }
    }
}