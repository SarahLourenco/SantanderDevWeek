package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta
import com.example.santanderdevweek.data.Cartao


class FakeData{
    fun getLocalData() : Conta {
        val cliente = Cliente("Sarah")
        val cartao = Cartao("71042520391")

        return Conta(
            "741042-0",
            "0520",
            "R$ 8.000,00",
            "R$ 12.000,00",
                cliente,
                cartao
            );
    }
}