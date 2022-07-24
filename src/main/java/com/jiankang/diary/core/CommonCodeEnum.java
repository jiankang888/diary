package com.jiankang.diary.core;

public enum CommonCodeEnum {

    SUCCESS("000000", "成功"),
    ERROR("999999","失败"),
    PARAM_ERROR("100000", "参数错误！");

    private String code;
    private String msg;

    CommonCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
