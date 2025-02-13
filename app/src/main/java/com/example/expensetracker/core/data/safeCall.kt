package com.example.expensetracker.core.data

import com.example.expensetracker.core.NetworkError
import com.example.expensetracker.core.domain.Result
import com.example.expensetracker.core.domain.RootError
import io.ktor.client.statement.HttpResponse
import io.ktor.util.network.UnresolvedAddressException
import kotlinx.coroutines.ensureActive
import kotlinx.serialization.SerializationException
import kotlin.coroutines.coroutineContext


suspend inline fun <reified T> safeApiCall(
    crossinline execute: suspend () -> HttpResponse
): Result<T, RootError> {
    val response = try {
        execute()
    } catch (e: UnresolvedAddressException) {
        return Result.Error(NetworkError.NO_INTERNET)
    } catch (e: SerializationException) {
        return Result.Error(NetworkError.SERIALIZATION)
    } catch (e: Exception) {
        coroutineContext.ensureActive()
        return Result.Error(NetworkError.UNKNOWN)
    }

    return response.toResult()
}
