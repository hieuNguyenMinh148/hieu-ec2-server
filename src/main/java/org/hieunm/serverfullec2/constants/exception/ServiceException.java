package org.hieunm.serverfullec2.constants.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {

    private final int errorCode;

    private final int statusCode;

    public int getErrorCode() { return this.errorCode; }

    public int getStatusCode() { return this.statusCode; }

    public ServiceException(HttpStatus httpStatus, String message) {
        super(message);
        this.errorCode = httpStatus.value();
        this.statusCode = httpStatus.value();
    }

    public ServiceException(ErrMsg errMsg) {
        super(errMsg.getErrMsg());
        this.errorCode = errMsg.getErrCode();
        this.statusCode = HttpStatus.BAD_REQUEST.value();
    }

    // Not Found
    public static ServiceException notFound()
    {
        return notFound("Resource Not Found");
    }

    public static ServiceException notFound(String msg) {
        return new ServiceException(HttpStatus.NOT_FOUND, msg);
    }

    // FORBIDDEN
    public static ServiceException forbidden()
    {
        return forbidden("Access Denied");
    }

    public static ServiceException forbidden(String msg)
    {
        return new ServiceException(HttpStatus.FORBIDDEN, msg);
    }

    // Bad Request
    public static ServiceException badRequest()
    {
        return badRequest("Bad Request");
    }

    public static ServiceException badRequest(String msg)
    {
        return new ServiceException(HttpStatus.BAD_REQUEST, msg);
    }

    // UNAUTHORIZED
    public static ServiceException unauthorized()
    {
        return unauthorized("UNAUTHORIZED");
    }

    public static ServiceException unauthorized(String msg) {
        return new ServiceException(HttpStatus.UNAUTHORIZED, msg);
    }

    // Internal Server Error
    public static ServiceException internalServerError()
    {
        return internalServerError("Internal Server Error");
    }

    public static ServiceException internalServerError(String msg) {
        return new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR, msg);
    }
}
