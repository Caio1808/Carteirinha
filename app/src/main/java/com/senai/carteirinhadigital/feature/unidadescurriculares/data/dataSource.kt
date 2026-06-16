package com.senai.carteirinhadigital.feature.unidadescurriculares.data

import com.senai.carteirinhadigital.feature.unidadescurriculares.domain.model.UnidadeCurricular

fun dataSource (): List<UnidadeCurricular> {
   return listOf(
       UnidadeCurricular(id = "1",nome = "PPDM",professor = "Rafael Costa",nota1=10.0,nota2= 10.0,media= 10.0,faltas = 0),
       UnidadeCurricular(id = "1",nome = "PPDM",professor = "Paulo Ygor",nota1=10.0,nota2= 10.0,media= 10.0,faltas = 0),
       UnidadeCurricular(id = "1",nome = "PFEND",professor = "Roger Santos",nota1=10.0,nota2= 10.0,media= 10.0,faltas = 0),
       UnidadeCurricular(id = "1",nome = "PBEND",professor = "Rafael Oliveira",nota1=10.0,nota2= 10.0,media= 10.0,faltas = 0),
       UnidadeCurricular(id = "1",nome = "PSOF",professor = "Tércio Ribeiro",nota1=10.0,nota2= 10.0,media= 10.0,faltas = 0)
   )
}