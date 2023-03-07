package com.atguigu.exception;

import com.gtguigu.common.result.ResultCodeEnum;
import lombok.Data;

@Data
public class GuiguException extends RuntimeException {

    private Integer code;//状态码
    private String msg;//描述信息

    public GuiguException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    /**
     * 接收枚举类型对象
     */
    public GuiguException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMessage();
    }

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
