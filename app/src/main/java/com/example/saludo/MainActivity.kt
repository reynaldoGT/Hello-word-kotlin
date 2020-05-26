package com.example.saludo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.saludo.R.id.txtsaludo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSaludar = findViewById<Button>(R.id.btnsaludar)

        var name = findViewById<EditText>(R.id.txtsaludo)
        var cboDeve = findViewById<CheckBox>(R.id.cbdev)



        btnSaludar.setOnClickListener(View.OnClickListener {
            if(validate()){
                if(cboDeve.isChecked){
                    Toast.makeText(this,"Bienvenido : ${name.text} se que eres un desaroolador :D ", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,"Bienvenido : ${name.text} ", Toast.LENGTH_LONG).show()
                }


            }else{
                Toast.makeText(this,"Escribe algo coño si no que hago", Toast.LENGTH_LONG).show()
            }
        })
    }
    fun validate():Boolean{
        var edit_text_Nombre = findViewById<EditText>(R.id.txtsaludo)
        val nombreUsuario = edit_text_Nombre.text

        if (nombreUsuario.isNullOrEmpty()){
            return false
        }else{
            return true
        }

    }

}






