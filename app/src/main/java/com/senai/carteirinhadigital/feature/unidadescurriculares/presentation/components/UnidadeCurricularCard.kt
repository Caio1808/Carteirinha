package com.senai.carteirinhadigital.feature.unidadescurriculares.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.senai.carteirinhadigital.feature.unidadescurriculares.domain.model.UnidadeCurricular

@Composable
fun UnidadeCurricularCard(
    modifier: Modifier = Modifier,
    unidadeCurricular: UnidadeCurricular
) {

    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF1C1C1E) // preto acinzentado
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            // TÍTULO (AMARELO + BOLD)
            Text(
                text = unidadeCurricular.nome,
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xFFFFD54F), // amarelo
                fontWeight = FontWeight.Bold
            )

            // PROFESSOR (BRANCO)
            Text(
                text = "Professor: ${unidadeCurricular.professor}",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )

            // NOTAS
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "N1: ${unidadeCurricular.nota1}",
                    color = Color(0xFFFFD54F) // amarelo
                )

                Text(
                    text = "N2: ${unidadeCurricular.nota2}",
                    color = Color(0xFFFFD54F) // amarelo
                )

                Text(
                    text = "Média: ${unidadeCurricular.media}",
                    color = Color.White
                )
            }

            // FALTAS
            Text(
                text = "Faltas: ${unidadeCurricular.faltas}",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}
