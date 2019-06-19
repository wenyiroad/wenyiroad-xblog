package com.wenyiroad.xblog.common.Exception;

/**
 * @Auther: Mojito
 * @Date: 2019/6/19 23:28
 * @Description:
 */
public interface CommonException {
    String getErrMsg();
    int getErrCode();
    void setErrMsg(String errMsg);
}
