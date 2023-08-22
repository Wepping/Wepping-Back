package com.wepping.wepper.common.exception

open class BaseException(
    val errorCode: Any,
    override val message: String
) : RuntimeException()