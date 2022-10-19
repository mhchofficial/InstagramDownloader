package com.akatsuki.igdownloader.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akatsuki.igdownloader.ui.theme.drawc


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun EditText(modifier: Modifier, value: String, onValueChange: (String) -> Unit, label: String, draw: Int, keyboardType: KeyboardType, singleLine: Boolean = true){
    val keyboardController = LocalSoftwareKeyboardController.current
    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        label = { Text(text = label, color = Color.Gray, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, textAlign = TextAlign.Center, modifier = Modifier.padding(start = 7.dp)) },
        maxLines = 1,
        singleLine = singleLine,
        leadingIcon = { Icon(painterResource(id = draw), contentDescription = "Localized description", tint = Color.DarkGray, modifier = Modifier.size(25.dp)) },
        shape = RoundedCornerShape(15.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = drawc,
            disabledIndicatorColor = Color.Transparent,
            focusedIndicatorColor =  Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,//hide the indicator
            textColor = Color.Black),
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = ImeAction.Done,
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                keyboardController?.hide() // another way to close keyboard
            },
        ),
        modifier = modifier

        ,

        textStyle = TextStyle(textDirection = TextDirection.ContentOrLtr, ),


    )


}





