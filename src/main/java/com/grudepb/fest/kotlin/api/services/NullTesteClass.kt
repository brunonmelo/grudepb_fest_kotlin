package com.grudepb.fest.kotlin.api.services

import com.grudepb.fest.kotlin.api.infrastructure.utils.firstCapitalize

class NullTesteClass  {

    var str : String = "Kotlin is awesome"
    var strNullable : String? = "Kotlin is awesome"
    var variavavelNaoInicializada: String // Toda variável precisa ser inicializada

    fun doSomething() {
        str = null // Erro de compilação... str é do tipo non-nullable
        strNullable = null // ai ta okay, strNullable pode ser nulo

        strNullable.firstCapitalize() // Erro de compilação, strNullable pode ser nulo
        strNullable?.firstCapitalize() // agora sim ta okay
    }

}