package com.example.expensetracker.core.data

import com.example.expensetracker.core.NetworkError
import com.example.expensetracker.core.domain.Result
import com.example.expensetracker.core.domain.RootError
import io.ktor.client.call.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.serialization.SerializationException

suspend inline fun <reified T> HttpResponse.toResult(): Result<T, RootError> {
    return try {
        if (status.isSuccess()) {
            val data: T = body()
            Result.Success(data)
        } else {
            Result.Error(status.toNetworkError())
        }
    } catch (e: SerializationException) {
        Result.Error(NetworkError.SERIALIZATION)
    } catch (e: Exception) {
        Result.Error(NetworkError.UNKNOWN)
    }
}

fun HttpStatusCode.isSuccess(): Boolean = this.value in 200..299

fun HttpStatusCode.toNetworkError(): NetworkError = when (this) {
    HttpStatusCode.RequestTimeout -> NetworkError.REQUEST_TIMEOUT
    HttpStatusCode.TooManyRequests -> NetworkError.TOO_MANY_REQUESTS
    HttpStatusCode.InternalServerError -> NetworkError.SERVER_ERROR
    else -> NetworkError.UNKNOWN
}
