package org.hieunm.serverfullec2.constants.response;

import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import java.util.Collection;

public class ResultUtil {

    private final static String SUCCESS = "success";

    public static <T> ResultData<T> success() {
        return new ResultData<T>().setCode(HttpStatus.OK).setMsg(SUCCESS);
    }

    public static <T> ResultData<T> success(T data) {
        return new ResultData<T>().setCode(HttpStatus.OK).setMsg(SUCCESS).setData(data);
    }

    public static <T> ResultData<T> error(String message) {
        return new ResultData<T>().setCode(HttpStatus.BAD_REQUEST).setMsg(message);
    }

    public static <T> ResultData<T> resultData(T data) {
        if (data instanceof Collection){
            Collection collection = (Collection)data;
            if (CollectionUtils.isEmpty(collection)){
                return new ResultData<T>().setCode(HttpStatus.BAD_REQUEST).setMsg("data is empty");
            } else {
                return new ResultData<T>().setCode(HttpStatus.OK).setMsg(SUCCESS).setData(data);
            }
        } else if (data == null){
            return new ResultData<T>().setCode(HttpStatus.BAD_REQUEST).setMsg("data is null");
        } else {
            return new ResultData<T>().setCode(HttpStatus.OK).setMsg(SUCCESS).setData(data);
        }
    }

    public static <T> ResultData<T> resultData(int statusCode, String message) {
        return new ResultData<T>().setCode(statusCode).setMsg(message);
    }

    public static <T> ResultData<T> resultData(int statusCode, String message, T t) {
        ResultData<T> result = new ResultData<T>().setCode(statusCode).setMsg(message);
        result.setData(t);
        return result;
    }

}
