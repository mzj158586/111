package com.mgd.myexception;

/**
 * @Author : 梅广东
 * @Date : 2022/4/5 17:51
 * @Description :
 **/

public class SudentException extends RuntimeException {
    public SudentException() {
    }

    public SudentException(String message) {
        super(message);
    }
}
