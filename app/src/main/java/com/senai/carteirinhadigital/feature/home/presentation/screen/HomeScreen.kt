package com.senai.carteirinhadigital.feature.home.presentation.screen

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.senai.carteirinhadigital.R
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinhadigital.app.navegation.Routes

@Composable
fun HomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    Box{
        Image(
           painter = painterResource(id = R.drawable.bg2),
           contentDescription = "Fundo",
           modifier = Modifier
               .fillMaxSize()
               .alpha(0.8f),
           contentScale = ContentScale.Crop
        )

        Column(
            modifier = modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Button(
                    onClick = {navController.navigate(Routes.Carteirinha.route)},
                    modifier = Modifier.width(130.dp).height(90.dp),
                    shape = RoundedCornerShape(10.dp)
                ){
                    Text(text = "Carteirinha Digital")
                }

                Button(
                    onClick = {navController.navigate(Routes.UnidadesCurriculares.route)},
                    modifier = Modifier.width(140.dp).height(90.dp),
                    shape = RoundedCornerShape(10.dp)
                ){
                    Text(text = "Unidades Curriculares")
                }
            }
        }
    }
}