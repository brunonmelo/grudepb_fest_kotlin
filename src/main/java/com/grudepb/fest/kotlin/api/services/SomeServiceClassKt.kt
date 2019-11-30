package com.grudepb.fest.kotlin.api.services

import com.grudepb.fest.kotlin.api.infrastructure.utils.firstCapitalize
import com.grudepb.fest.kotlin.api.infrastructure.utils.isMonday
import com.grudepb.fest.kotlin.api.infrastructure.utils.isThursday
import com.grudepb.fest.kotlin.api.infrastructure.utils.normalize
import java.util.*

class SomeServiceClassKt {

    fun doSomething(date: Calendar) {
        if (isThursday(date)) {
            // Faz alguma coisa
        }
    }

    fun checkIfIsMonday(): String {
        val date = Calendar.getInstance()

        return if (isMonday(date)) {
            "Sim, hoje é segunda"
        } else {
            "Não, hoje é o ${date.get(Calendar.DAY_OF_WEEK)} dia da semana"
        }
    }

    fun normalizeText(textoParaSerNormalizado: String) = textoParaSerNormalizado.normalize()

    fun getNomeCompleto(nome: String, sobrenome: String): String {
        return "${nome.firstCapitalize()} ${sobrenome.firstCapitalize()}"
    }

}