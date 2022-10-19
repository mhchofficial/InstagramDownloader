package com.akatsuki.igdownloader.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akatsuki.igdownloader.R
import com.akatsuki.igdownloader.data.Shared
import com.akatsuki.igdownloader.ui.common.EditText
import com.akatsuki.igdownloader.ui.theme.drawcolor
import com.akatsuki.igdownloader.ui.theme.drawt


@Composable
fun MainScreen(){
    val url = remember {
        mutableStateOf("")
    }
    val download = remember {
        mutableStateOf(false)
    }

    val isLogin = remember {
        mutableStateOf(true)
    }



    val session = Shared(context = LocalContext.current).send_session()
    if (!session.isNullOrBlank()){
        isLogin.value = true
    }




    if(isLogin.value){
         Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally){
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Instagram Downloader", fontSize = 23.sp, fontFamily = FontFamily.SansSerif, color = drawt)
            Divider(Modifier.height(35.dp), color = Color.White, thickness = 1.dp)
            EditText(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 30.dp, end = 30.dp), value = url.value, onValueChange = {url.value = it}, label = "Link....", draw = R.drawable.link, keyboardType = KeyboardType.Text)
            Spacer(modifier = Modifier.height(15.dp))
            Button(onClick = { download.value = true }, modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                ,
                shape = RoundedCornerShape(11.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = drawcolor,
                    contentColor = drawcolor
                )) {
                Text(text = "Download", color = Color.Black, fontSize = 16.sp, fontFamily = FontFamily.SansSerif)

                Spacer(modifier = Modifier.height(45.dp))

                LazyColumn(Modifier.fillMaxSize()){
                    items(3){

                    }
                }




            }

        }

    }

    else{
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally){
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "You Need Login First", fontSize = 23.sp, fontFamily = FontFamily.SansSerif, color = drawt)
            Divider(Modifier.height(35.dp), color = Color.White)

            Button(onClick = {

            }, modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                ,
                shape = RoundedCornerShape(11.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = drawcolor,
                    contentColor = drawcolor
                )) {
                Text(text = "Login-webView", color = Color.Black, fontSize = 16.sp, fontFamily = FontFamily.SansSerif)




            }

        }

    }
}