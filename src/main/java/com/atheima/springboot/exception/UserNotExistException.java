package com.atheima.springboot.exception;

/**
 * @auther lizongxiao
 * @date 2019/10/18 - 22:19
 */
public class UserNotExistException extends RuntimeException{

    public UserNotExistException(){
        super("用户不存在");
    }
}
