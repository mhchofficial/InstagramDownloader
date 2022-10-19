package com.akatsuki.igdownloader.ui.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.akatsuki.igdownloader.ui.screens.MainScreen
import com.akatsuki.igdownloader.ui.screens.WebViewIgScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.MainScreen.name){


        composable(AppScreens.MainScreen.name){
            MainScreen()
        }



        composable(AppScreens.WebViewIgScreen.name){
            WebViewIgScreen(navController)
        }

    }
}