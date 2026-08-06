package com.senai.carteirinhadigital.feature.login.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.senai.carteirinhadigital.R // Certifique-se de importar o R do seu pacote
import com.senai.carteirinhadigital.app.navegation.Routes

@Composable
fun LoginScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Box(modifier = modifier.fillMaxSize()) {
        // Imagem de Fundo
        Image(
            painter = painterResource(id = R.drawable.redbg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                // Título "Login"
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.headlineLarge,
                    color = MaterialTheme.colorScheme.onBackground
                )

                // Campo de Email
                OutlinedTextField(
                    value = email,
                    onValueChange = { novoTexto ->
                        email = novoTexto
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Email") },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = MaterialTheme.colorScheme.outline,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline,
                        focusedLabelColor = MaterialTheme.colorScheme.onBackground,
                        unfocusedLabelColor = MaterialTheme.colorScheme.onBackground,
                        focusedTextColor = MaterialTheme.colorScheme.onBackground,
                        unfocusedTextColor = MaterialTheme.colorScheme.onBackground
                    )
                )

                // Campo de Senha
                OutlinedTextField(
                    value = senha,
                    onValueChange = { novoTexto ->
                        senha = novoTexto
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Senha") },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = MaterialTheme.colorScheme.outline,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline,
                        focusedLabelColor = MaterialTheme.colorScheme.onBackground,
                        unfocusedLabelColor = MaterialTheme.colorScheme.onBackground,
                        focusedTextColor = MaterialTheme.colorScheme.onBackground,
                        unfocusedTextColor = MaterialTheme.colorScheme.onBackground
                    )
                )

                // Botão
                Button(
                    onClick = { navController.navigate(Routes.Home.route) },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Text(text = "Entrar")
                }
            }
        }
    }
}