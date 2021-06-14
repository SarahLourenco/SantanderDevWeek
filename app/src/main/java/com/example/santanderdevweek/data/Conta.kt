package com.example.santanderdevweek.data

data class Conta(
    val nummero: String,
    val agencia: String,
    val saldo: String,
    val limite: String,
    val cliente: Cliente,
    val cartao: Cartao

)