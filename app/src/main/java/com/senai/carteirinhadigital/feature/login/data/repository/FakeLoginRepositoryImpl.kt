package com.senai.carteirinhadigital.feature.login.data.repository

import com.senai.carteirinhadigital.feature.login.domain.model.UsuarioLogado
import kotlinx.coroutines.delay

class FakeLoginRepositoryImpl : LoginRepository {

    override suspend fun login(usuario: String, senha: String): Result<UsuarioLogado> {
        delay(1500)

        return if(usuario.equals("aluno") &&  senha.equals("123")){
            Result.success(
                UsuarioLogado(
                    id = "1",
                    nome =  "Raí Felipe",
                    curso = "Desenvolvimento de Sistemas",
                    turma = "2DEVEST-B",
                    token = "token-fake"
                )
            )
        }else{
            Result.failure(
                IllegalArgumentException(
                    "Login ou senha inválidos"
                )
            )
        }
    }
}