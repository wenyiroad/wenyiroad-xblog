package com.wenyiroad.xblog.common.response;

/**
 * @Auther: Mojito
 * @Date: 2019/6/19 23:53
 * @Description:
 *
 */
public class CommonReturnType {
    private String status;
    private Object data;

    public static CommonReturnType success(Object data) {
        return CommonReturnType.fail(data, "success");
    }

    public static CommonReturnType fail(Object data, String status) {
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setData(data);
        commonReturnType.setStatus(status);
        return commonReturnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}