package com.wenyiroad.xblog.common.Exception;

/**
 * @Auther: Mojito
 * @Date: 2019/6/19 23:32
 * @Description:
 */
public enum EmCommonException implements CommonException {
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10002, "未知错误"),
    USER_NOT_EXIST(20001, "用户不存在")
    ;

    private String errMsg;
    private int errCode;

    EmCommonException(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
