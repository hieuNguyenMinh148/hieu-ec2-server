package org.hieunm.serverfullec2.constants.exception;

public enum ErrMsg {

    JWT_EXPIRED_TIME(500, "JWT expired Time"),
    JWT_SIGN_ERROR(500, "JWT Sign Error"),
    FAILED_TO_DOWNLOAD_FILE(500, "Failed to download file"),
    ROLE_NOT_FOUND(404, "Role not found"),
    INVALID_ACCOUNT(404,"Username or password invalid"),
    ANI_ERASER_ACCOUNT_NOT_FOUND(404, "Ani Eraser Account not found"),
    BROWSER_NOT_START(500, "Browser not start"),
    BROWSER_START_FAILED(500, "Browser start failed, please try again"),
    CRAWL_DATA_NOT_FOUND(404, "Crawl data not found"),
    ;

    private final int errCode;
    private final String errMsg;

    ErrMsg(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
