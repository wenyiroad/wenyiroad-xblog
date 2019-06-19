package com.wenyiroad.xblog.common.Exception;

/**
 * @Auther: Mojito
 * @Date: 2019/6/19 23:38
 * @Description:
 */
public class CommonExceptionHandler extends Exception implements CommonException {

    private CommonException commonException;

    public CommonExceptionHandler(CommonException commonException) {
        this.commonException = commonException;
    }

    public CommonExceptionHandler(CommonException commonException, String errMsg) {
        this.commonException = commonException;
        this.commonException.setErrMsg(errMsg);
    }

    @Override
    public String getErrMsg() {
        return this.commonException.getErrMsg();
    }

    @Override
    public int getErrCode() {
        return this.commonException.getErrCode();
    }

    @Override
    public void setErrMsg(String errMsg) {
        this.commonException.setErrMsg(errMsg);
    }
}
