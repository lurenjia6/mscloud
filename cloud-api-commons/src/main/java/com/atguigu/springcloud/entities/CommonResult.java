package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JSON封装，返回前端通用的json
 * @auther admin
 * @Date 2020/4/4 17:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;//响应码
    private String message;//响应信息
    private T data;//返回数据


    public CommonResult(Integer code,String message){
        this(code,message,null);
    }


}


