package com.grudepb.fest.kotlin.api.infrastructure.utils

import java.text.Normalizer

fun String.normalize(): String {
    return Normalizer.normalize(this, Normalizer.Form.NFD)
            .replace("[^\\p{ASCII}]", "").toUpperCase()
}

fun String.toPlainString(): String {
    return this.replace("[.,R$\\s]".toRegex(), "")
}

fun String.firstCapitalize(): String {
    return this.toLowerCase().substring(0, 1).toUpperCase() + this.substring(1)
}
