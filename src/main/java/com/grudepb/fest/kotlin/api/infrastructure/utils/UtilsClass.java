package com.grudepb.fest.kotlin.api.infrastructure.utils;

import java.util.Calendar;

public class UtilsClass {

    public static boolean isDateATuesday(Calendar date) {
        return date.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY;
    }
}
