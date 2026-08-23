package com.senai.carteirinhadigital.feature.unidCurrProf.data

import com.senai.carteirinhadigital.feature.unidCurrProf.domain.model.UcProf
import com.senai.carteirinhadigital.feature.unidadescurriculares.domain.model.UnidadeCurricular

fun dataSource (): List<UcProf> {
    return listOf(
        UcProf(id = "1",nome = "PPDM",professor = "Rafael Costa",materia1 = "Kotlin",materia2 = "Android studio",materia3 = "Jetpack Compose")

    )
}