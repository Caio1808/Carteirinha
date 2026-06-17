package com.senai.carteirinhadigital.feature.home.presentation.screen

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.text.font.FontWeight
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
               .alpha(0.9f),
           contentScale = ContentScale.Crop
        )

        Column(
            modifier = modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Bem vindo, Aluno !", fontSize = 32.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier.height(110.dp)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                Button(
                    onClick = { navController.navigate(Routes.UnidadesCurriculares.route) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier
                        .width(166.dp)
                        .height(75.dp)
                        .background(
                            brush = Brush.radialGradient(
                                colors = listOf(
                                    Color(0xFF414141),
                                    Color(0xFF1E1C1C),
                                    Color(0xFF050505)
                                )
                            ),
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                        Text(
                            text = "Unidades Curriculares",
                            color = Color.White
                        )

                }

                Button(
                    onClick = { navController.navigate(Routes.Carteirinha.route) },
                    modifier = Modifier
                        .width(166.dp)
                        .height(75.dp)
                        .background(
                        brush = Brush.radialGradient(
                            colors = listOf(
                                Color(0xFF414141),
                                Color(0xFF1E1C1C),
                                Color(0xFF050505)
                            )
                        ),
                shape = RoundedCornerShape(10.dp)
                ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {

                        Text(
                            text = "Carteirinha Digital",
                            color = Color.White
                        )
                }
            }
        }
    }
}