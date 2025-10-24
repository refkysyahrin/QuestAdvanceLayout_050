package com.example.questadvancelayout_050

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Profil(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier. height(32.dp))

        Image(
            painter = painterResource(id = R.drawable.masa_kecil2),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Baris untuk ikon media sosial
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp), // Memberi jarak antar icon
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logoig),
                contentDescription = "Instagram",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Image(
                painter = painterResource(id = R.drawable.logowa),
                contentDescription = "WhatsApp",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Image(
                painter = painterResource(id = R.drawable.logotiktok),
                contentDescription = "Tiktok",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Image(
                painter = painterResource(id = R.drawable.logotwitter),
                contentDescription = "Twitter",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Informasi User
       Text(
           text = stringResource(id = R.string.nama),
           fontSize = 30.sp,
           fontFamily = FontFamily.SansSerif,
           color = Color.White,
           modifier = Modifier.padding(top = 15.dp)
       )
    }
}
