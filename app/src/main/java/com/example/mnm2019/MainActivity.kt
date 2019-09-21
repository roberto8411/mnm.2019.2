package com.example.mnm2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var texto:TextView = findViewById(R.id.textView2)
        var texto2:TextView = findViewById(R.id.textView3)
        var botao:Button = findViewById(R.id.button2)
        var imput:EditText = findViewById(R.id.editText2)
        texto.text = "meu textinho"

        var segredo:TextView = findViewById(R.id.textView3)
        var erros:TextView = findViewById(R.id.textView3)
        var letra:EditText = findViewById(R.id.editText2)
        var botaotentar:Button = findViewById(R.id.button2)
        var reiniciar:Button = findViewById(R.id.button2)

        var palavras = listOf<String>("sabao","caraca","careca")
        var qerros = "0"
        var acertos = mutableListOf<String>()
        var palavra = ""

        reiniciar.setOnClickListener {
            palavra = palavras.random()
            segredo.text ="---  ".repeat(palavra.count())
        }
        botao.setOnClickListener{
            var digito = letra.text.toString()
            var contemletra = palavra.indexOf(digito)

            if (contemletra > -1) {
                acertos.add(digito)

            }
            else{
                erros.text = "erros $qerros"
            }

        }

//        var numero = 7.0
//        var divicao = numero/2
//        texto.text = divicao.toString()
//
//        var meu = "chalalala"
//        texto.text = meu.get(8).toString()
//
//
//        var a = "0"
//        texto2.text = "digita o numero da a ai " + a
//
//        botao.setOnClickListener{
//            if ( imput.text.toString() == a.toString()) {
//                texto.text = "aeeee krl"
//            }
//            else{
//                texto.text = "fail"
//            }
//
//
//        }

    }
}
