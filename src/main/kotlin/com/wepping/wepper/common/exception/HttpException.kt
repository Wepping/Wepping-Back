package com.wepping.wepper.common.exception

enum class HttpErrorCode(code: Int) {
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    CONFLICT(409),
    GONE(410),
    INTERNAL_SERVER_ERROR(500),
    SERVICE_UNAVAILABLE(503)
}

open class HttpException(
    errorCode: HttpErrorCode,
    message: String
) : BaseException(errorCode, message)

class NotFoundException(message: String) : HttpException(HttpErrorCode.NOT_FOUND, message)