package com.example.classescodelab_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Functions: */
        declareVariables()

//        /* Instância da Classe: */
        val smartTvDevice = SmartDevice("Gilmarcos Santos", "XXX.XXX.XXX-XX")

        /* Só é possível acessar o Objeto Nome e não o Objeto CPF. */
        println(smartTvDevice.nome)


        /* Objeto da Classe: */
        smartTvDevice.turnOn()
        /* Objeto da Classe: */
        smartTvDevice.turnOff()

        println("Device name is: ${smartTvDevice.name001}")

        val outraMarca = SmartDevice("sdsds")
        outraMarca.name002 = "Iphone 11"
        println(outraMarca.name002)
        myTextView.text = outraMarca.name002

        val dadosAndroid = SmartDevice("Gilmarcos Santos", "XXX")
        dadosAndroid.nome = "Gilmarcos Santos"
        dadosAndroid.cpfTitular = "XXXXXXX"


    }

    private fun declareVariables() {
        myTextView = findViewById<TextView>(R.id.txtView_mainActvt_id)
    }
}

/* Classe: */
/*
*  • O Atributo do Apelido deverá ser invocada quando a Classe for Instanciada;
*  • O Atributo CPF não poderá ser acessado quando a Classe for Instanciada.
*  • O acesso os Atributos da Classe serão obrigatórios quando a Classe
* for intanciada.
* */
class SmartDevice(var nome: String, cpf: String) {

    /* Propriedades da Classe: */
    /*
    * O acesso às propriedades da Classe são opcionais.
    */
    var modeloAndroid = "android tv"
    val cpfTitular: String? = null

    init {
        println("Init {...} " + name001.capitalize())

    }

    /* Propriedades da Classe: */
    val category = "Entertainment"

    /* Propriedades da Classe: */
    var deviceStatus = "Online"

    /* Método da Classe: */
    fun turnOn() {
        println("Smart device is turned on.")
    }

    /* Método da Classe: */
    fun turnOff() {
        println("Smart device is turned off.")
    }

}