package com.senai.carteirinhadigital.feature.turmas.data

import com.senai.carteirinhadigital.feature.turmas.domain.model.Turmas
import com.senai.carteirinhadigital.feature.unidadescurriculares.domain.model.UnidadeCurricular

fun dataSource (): List<Turmas> {
    return listOf(
        Turmas(id = "1", nome = "2DevestB", alunos = 30, idUc = "1")
    )
}