package com.studiolkj.mynamecard.common

import android.content.Context
import android.content.SharedPreferences

class MyNameCardValue(context: Context) {

    companion object {
        val FILENAME = "prefs"
        val KEY_NAMECARD_VALUE0 = "namecardValue0"
        val KEY_NAMECARD_VALUE1 = "namecardValue1"
        val KEY_NAMECARD_VALUE2 = "namecardValue2"
    }

    private val prefs: SharedPreferences = context.getSharedPreferences(FILENAME, 0)

    var nameCardValue0: String
        get()  = prefs.getString(KEY_NAMECARD_VALUE0, "")?:""
        set(value) = prefs.edit().putString(KEY_NAMECARD_VALUE0, value).apply()

    var nameCardValue1: String
        get()  = prefs.getString(KEY_NAMECARD_VALUE1, "")?:""
        set(value) = prefs.edit().putString(KEY_NAMECARD_VALUE1, value).apply()

    var nameCardValue2: String
        get()  = prefs.getString(KEY_NAMECARD_VALUE2, "")?:""
        set(value) = prefs.edit().putString(KEY_NAMECARD_VALUE2, value).apply()
}