package com.moneyyy.expressionDiary.dto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class MemberInsertDTO {

    @NotNull
    private Long id;

    @NotBlank
    private String password;

    @Builder
    public MemberInsertDTO(Long id, String password) {
        this.id = id;
        this.password = password;
    }

}
