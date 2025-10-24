package com.example.questadvancelayout_050

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import java.lang.reflect.Modifier

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(modifier= Modifier
        .padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontal
    ){
        Text(
            text = stringResource((id = R.string.prodi),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}
