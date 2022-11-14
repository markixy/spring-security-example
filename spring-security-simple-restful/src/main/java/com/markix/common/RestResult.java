package com.markix.common;

import com.markix.utils.JsonUtils;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author markix
 */
@Data
@Accessors(chain = true)
public class RestResult<T> {

    private int code;
    private T data;
    private String msg;

    private RestResult() {
    }

    public static RestResult success() {
        return new RestResult().setCode(200);
    }

    public static RestResult success(Object data) {
        return success().setData(data);
    }

    public static RestResult error() {
        return new RestResult().setCode(500);
    }

    public static RestResult error(String errMsg) {
        return error().setMsg(errMsg);
    }

    public static RestResult error(int code, String errMsg) {
        return new RestResult().setCode(code).setMsg(errMsg);
    }

    public static RestResult error(Exception ex) {
        return error(ex.getMessage());
    }

    public String toJsonString() {
        return JsonUtils.toJsonString(this);
    }

}
