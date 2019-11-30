package com.grudepb.fest.kotlin.api.infrastructure.utils

import java.util.*

fun isMonday(date: Calendar): Boolean {
    return date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY
}

fun isThursday(date: Calendar) = date.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY

fun Calendar.isTuesday() = this.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY
