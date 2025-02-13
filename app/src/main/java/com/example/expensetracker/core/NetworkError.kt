package com.example.expensetracker.core

import com.example.expensetracker.core.domain.RootError

sealed class NetworkError : RootError() {
    object REQUEST_TIMEOUT : NetworkError()
    object TOO_MANY_REQUESTS : NetworkError()
    object NO_INTERNET : NetworkError()
    object SERVER_ERROR : NetworkError()
    object SERIALIZATION : NetworkError()
    object UNKNOWN : NetworkError()
}
