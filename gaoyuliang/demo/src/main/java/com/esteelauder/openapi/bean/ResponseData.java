package com.esteelauder.openapi.bean;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.function.Supplier;
@Data
public class ResponseData<T> implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(ResponseData.class);

    private String code;
    @Schema(
            description = "返回信息",
            example = "成功"
    )
    private String message;
    @Schema(
            description = "返回数据"
    )
    private T data;
    public static final String SUCCESS = "00000000";
    public static final String SUCCESS_DESC = "成功";

    public static <T> ResponseData<T> resp(Supplier<T> supplier) {
        try {
            return new ResponseData("00000000", "成功", supplier.get());
        } catch (Exception var3) {
            log.error("系统异常：errorCode:{} ", "系统繁忙，请稍后重试", var3);
            return new ResponseData("00000001", "系统繁忙，请稍后重试！", (Object)null);
        }
    }

    public ResponseData(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
