package com.jiankang.diary.core;

import java.io.Serializable;

public class JsonResult<T> implements Serializable {

    private String msg;

    private String code;

    private T data;

    public JsonResult() {

    }

    public JsonResult(String msg, String status, T data) {
        this.msg = msg;
        this.code = status;
        this.data = data;
    }

    public JsonResult(CommonCodeEnum commonCodeEnum, T data) {
        this.msg = commonCodeEnum.getMsg();
        this.code = commonCodeEnum.getCode();
        this.data = data;
    }

    public JsonResult success(T data){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(CommonCodeEnum.SUCCESS.getCode());
        jsonResult.setMsg(CommonCodeEnum.SUCCESS.getMsg());
        jsonResult.setData(data);
        return jsonResult;
    }

    public JsonResult error(T data) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode(CommonCodeEnum.ERROR.getCode());
        jsonResult.setMsg(CommonCodeEnum.ERROR.getMsg());
        jsonResult.setData(data);
        return jsonResult;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
