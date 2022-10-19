package com.akatsuki.igdownloader.ui.screens

import android.annotation.SuppressLint
import android.util.Log
import android.webkit.CookieManager
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.akatsuki.igdownloader.data.Shared
import com.akatsuki.igdownloader.ui.navigation.AppScreens
import com.akatsuki.igdownloader.ui.theme.centercolor
import com.akatsuki.igdownloader.utils.Base.ING
import com.akatsuki.igdownloader.utils.checkUrl
import com.google.accompanist.web.AccompanistWebChromeClient
import com.google.accompanist.web.AccompanistWebViewClient
import com.google.accompanist.web.WebView
import com.google.accompanist.web.rememberWebViewState


@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebViewIgScreen(navHostController: NavHostController){
    val state = rememberWebViewState(url = ING)
    val target = state.content.getCurrentUrl().toString()
    //val cookies: String = android.webkit.CookieManager.getInstance().getCookie(view.url)

    Box(modifier = Modifier.fillMaxSize()){
        WebView(state = state, modifier = Modifier.fillMaxSize(), client = AccompanistWebViewClient(), chromeClient = AccompanistWebChromeClient(),
            onCreated = {
                it.settings.apply {
                    javaScriptEnabled  = true
                    allowContentAccess = true
                }
            }
            )

        if (!state.isLoading){
            if (checkUrl(target)){
                val session = CookieManager.getInstance().getCookie(target)
                Shared(LocalContext.current).save_session(session)
                Log.e("target", target)
                Log.e("seession", session.toString())
                navHostController.navigate(AppScreens.MainScreen.name){
                    popUpTo(AppScreens.WebViewIgScreen.name){
                        inclusive = true
                    }
                }


            }else{
                Log.e("not true", "fuck")

            }


        }


    }

}