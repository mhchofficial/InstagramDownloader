package com.akatsuki.igdownloader.ui.navigation

import java.lang.IllegalArgumentException


enum class AppScreens{
    MainScreen,
    WebViewIgScreen;
    companion object{
        fun fromRoute(route: String?): AppScreens
        = when (route?.substringBefore("/")){
            MainScreen.name -> MainScreen
            WebViewIgScreen.name -> WebViewIgScreen
            null -> MainScreen
            else -> throw IllegalArgumentException("we have error $route")
        }
    }

}