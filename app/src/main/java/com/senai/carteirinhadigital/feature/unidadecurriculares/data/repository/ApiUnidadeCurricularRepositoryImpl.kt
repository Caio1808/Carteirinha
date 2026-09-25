package com.senai.carteirinhadigital.feature.unidadecurriculares.data.repository

import com.senai.carteirinhadigital.feature.unidadecurriculares.data.remote.service.UnidadeCurricularApi
import com.senai.carteirinhadigital.feature.unidadecurriculares.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadecurriculares.domain.repository.UnidadeCurricularRepository
import okio.IOException
import retrofit2.HttpException

class ApiUnidadeCurricularRepositoryImpl(
    private val api: UnidadeCurricularApi
) : UnidadeCurricularRepository {

    override suspend fun listarUnidadesCurriculares(): Result<List<UnidadeCurricular>> {
        return runCatching {
            api.listarUnidadesCurriculares().map {
                it.toDomain()
            }
        }.recoverCatching { throwable ->
            throw when (throwable) {
                is HttpException -> {
                    if (throwable.code() == 401) {
                        IllegalStateException("Sua sessão expirou. Faça login novamente")
                    } else {
                        IllegalStateException("Erro ao carregar unidades curriculares (${throwable.code()})")
                    }
                }
                is IOException ->
                    IllegalStateException("Não foi possível conectar na API")
                else ->
                    IllegalStateException(throwable.message ?: "Erro ao carregar unidades curriculares")
            }
        }
    }
}