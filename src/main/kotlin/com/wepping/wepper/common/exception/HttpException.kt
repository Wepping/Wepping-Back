package com.wepping.wepper.common.exception

open class HttpException(
    errorCode: ErrorCode,
    message: String
) : BaseException(errorCode, message) {

    enum class ErrorCode(val code: Int) {
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        FORBIDDEN(403),
        NOT_FOUND(404),
        CONFLICT(409),
        GONE(410),
        INTERNAL_SERVER_ERROR(500),
        SERVICE_UNAVAILABLE(503)
    }
}

class NotFoundException(message: String) : HttpException(ErrorCode.NOT_FOUND, message)
class BadRequestException(message: String) : HttpException(ErrorCode.BAD_REQUEST, message)