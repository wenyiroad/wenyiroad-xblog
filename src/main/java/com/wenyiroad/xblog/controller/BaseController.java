package com.wenyiroad.xblog.controller;

import com.google.common.collect.Maps;
import com.wenyiroad.xblog.common.Exception.CommonException;
import com.wenyiroad.xblog.common.Exception.CommonExceptionHandler;
import com.wenyiroad.xblog.common.Exception.EmCommonException;
import com.wenyiroad.xblog.common.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;

/**
 * @Auther: Mojito
 * @Date: 2019/6/19 23:23
 * @Description:
 */
public class BaseController {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Object exceptionHandler(Exception ex){
        HashMap<String, Object> responseData = Maps.newHashMap();
        if(ex instanceof CommonException){
            CommonExceptionHandler commonExceptionHandler = (CommonExceptionHandler) ex;
            responseData.put("errCode",commonExceptionHandler.getErrCode());
            responseData.put("errMsg",commonExceptionHandler.getErrMsg());
        }else{
            responseData.put("errCode", EmCommonException.UNKNOWN_ERROR.getErrCode());
            responseData.put("errMsg",EmCommonException.UNKNOWN_ERROR.getErrMsg());
        }

        return CommonReturnType.fail(responseData,"fail");
    }
}
