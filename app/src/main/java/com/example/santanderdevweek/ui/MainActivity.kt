package com.example.santanderdevweek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.santanderdevweek.R
import com.example.santanderdevweek.data.Conta

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    }

    private fun buscarContaCliente() {
        mainViewModel.buscarContaCliente().observe(this, Observer { result ->
            bindOnView(result);
            buscarContaCliente()
        })
    }

    private fun bindOnView(conta : Conta){
        findViewById<TextView>(R.id.tv_agencia).text = conta.agencia
        findViewById<TextView>(R.id.tv_conta_corrente).text = conta.nummero
        findViewById<TextView>(R.id.tv_saldo).text = conta.saldo
        findViewById<TextView>(R.id.tv_limite).text = conta.limite
        findViewById<TextView>(R.id.tv_usuario).text = conta.cliente.nome
        findViewById<TextView>(R.id.tv_cartao_final_value).text = conta.cartao.numeroCartao
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            val inflate = menuInflater
            inflate.inflate(R.menu.main_menu, menu)
            return true
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
          /*  R.id.item_1 ->  {
                Log.d("CLICK", "Click item 1")
                true
            }*/
             R.id.item_1 ->  {  //esse era o item 2.
                Log.d("CLICK", "Click item 2")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}




//        // declaracao de  variaveis:  // val = nunca muda o  valor, é imutável // var = recebe valores
//
//        var contador: int = 10
//        contador = 11
//
//        val contador2: int = 11
//        contador2 = 2
//
//        //Segurança nula
//        Val languageName : String ? = null
//
//        //condicionais
//        var idade = 20
//
//        if (idade > 18) {
//            println("Voce é maior de idade")
//        } else {
//            println("Você é menor de idade")
//        }
//
//
//        val minhaIdade: String = if (idade > 18) {
//            ("Voce é maior de idade")
//        } else {
//            ("Você é maior de idade")
//        }
//
//
//        //when
//        val minhaIdade = when {
//            idade > 18 -> "Você  é maior de idade"
//            else -> "Você é menor de idade"
//        }

        //Funçoes

//        fun myage() : String {
//            return "minha idade é 18"
//        }
//
//        fun myage2() : String = "minha idade é 18"

            // classe kotlin medicamento
     //   val medicamento = Medicamento("teste 1", "2x ao dia")


