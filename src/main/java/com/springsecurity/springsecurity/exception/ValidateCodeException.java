package com.springsecurity.springsecurity.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author BABA
 * @date 2019/10/11 14:52
 */
public class ValidateCodeException extends AuthenticationException {
    private static final long serialVersionUID = 5022575393500654458L;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
