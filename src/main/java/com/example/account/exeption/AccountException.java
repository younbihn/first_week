package com.example.account.exeption;

import com.example.account.type.ErrorCode;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountException extends RuntimeException{
    private ErrorCode errorCode;
    private String errormessage;

    public AccountException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.errormessage = errorCode.getDescription();
    }
}