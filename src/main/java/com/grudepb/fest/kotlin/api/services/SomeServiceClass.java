package com.grudepb.fest.kotlin.api.services;

import com.grudepb.fest.kotlin.api.infrastructure.utils.UtilsClass;

import java.util.Calendar;

public class SomeServiceClass {

    public void doSomething(Calendar date) {
        if (UtilsClass.isDateATuesday(date)) {
            // Faz alguma coisa
        }
    }
}
