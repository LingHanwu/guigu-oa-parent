package com.atguigu.exception;
import com.gtguigu.common.result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * projectName:  guigu-oa-parent
 *
 * @author 杨宇超
 * time 2023-03-07 16:10 周二
 * description:全局异常处理类
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler(ArithmeticException.class)
    public Result error(ArithmeticException e){
        e.printStackTrace();
        return Result.fail().message("执行了特定异常处理");
    }

    //自定义异常处理
    @ExceptionHandler(GuiguException.class)
    public Result error(GuiguException e) {
        e.printStackTrace();
        return Result.fail().code(e.getCode()).message(e.getMsg());
    }

}
