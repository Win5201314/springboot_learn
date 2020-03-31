package com.zsl.springboot.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString
//https://blog.csdn.net/u010695794/article/details/70441432
public class User {

    /**
     * 主键
     */
    private BigInteger id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;


}
