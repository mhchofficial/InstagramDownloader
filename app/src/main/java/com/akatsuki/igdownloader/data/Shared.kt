package com.akatsuki.igdownloader.data

import android.content.Context

class Shared (private val context: Context) {


    public fun save_session(session: String) {
        val preferences = context.getSharedPreferences("Autologin", Context.MODE_PRIVATE)
        preferences.edit().putBoolean("AutoState", true).apply()
        preferences.edit().putString("AutoSession", session).apply()

    }


    public fun logout() {
        val preferences = context.getSharedPreferences("Autologin", Context.MODE_PRIVATE)
        preferences.edit().putBoolean("AutoState", false).apply()
        preferences.edit().putString("AutoSession", null).apply()
    }

    public fun send_session(): String {
        val pre = context.getSharedPreferences("Autologin", Context.MODE_PRIVATE)
        val session = pre.getString("AutoSession", "")
        return session.toString()
    }
}