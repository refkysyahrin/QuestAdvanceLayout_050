package com.example.questadvancelayout_050

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
           modifier = Modifier.padding(top = 0.dp)
       )
       Text(
            text = stringResource(id = R.string.akun),
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White,
            modifier = Modifier.padding(top = 1.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.qoutes),
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 0.dp)
        )
        Spacer(modifier = Modifier.height(24.dp))

        // Tombol Privasi
        Button(
            onClick = {   },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
            modifier = Modifier.fillMaxWidth().height(75.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.logoprivasi),
                    contentDescription = "Privasi Icon",
                    modifier = Modifier.size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text("Privacy", color = Color.White, fontSize = 16.sp)
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.logoplay),
                    contentDescription = "Arrow Icon",
                    modifier = Modifier.size(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        // Tombol Riwayat Transaksi
        Button(
            onClick = {   },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
            modifier = Modifier.fillMaxWidth().height(75.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logogithub),
                    contentDescription = "GitHub Icon",
                    modifier = Modifier.size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text("GitHub", color = Color.White, fontSize = 16.sp)
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.logoplay),
                    contentDescription = "Arrow Icon",
                    modifier = Modifier.size(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Spacer(modifier = Modifier.height(12.dp))

        // Tombol Pengaturan
        Button(
            onClick = {   },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
            modifier = Modifier.fillMaxWidth().height(75.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logopenganturan2),
                    contentDescription = "Pengaturan Icon",
                    modifier = Modifier.size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text("Pengaturan", color = Color.White, fontSize = 16.sp)
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.logoplay),
                    contentDescription = "Arrow Icon",
                    modifier = Modifier.size(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))
        Spacer(modifier = Modifier.weight(1f)) //Mendorong tombol logout ke bawah

        //Tombol Logout
        Button(
            onClick = {     },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(56.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = R.drawable.logoexit),
                    contentDescription = "Logout Icon",
                    modifier = Modifier.size(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Logout", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))



        }
}
