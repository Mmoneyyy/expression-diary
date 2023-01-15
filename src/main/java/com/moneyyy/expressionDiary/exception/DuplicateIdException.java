package com.moneyyy.expressionDiary.exception;

public class DuplicateIdException extends RuntimeException {
    public DuplicateIdException(Long id) {
        super(id + "중복");
    }
}
