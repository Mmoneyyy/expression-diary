package com.moneyyy.expressionDiary.dto.member;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class MemberInsertDTO {

    @NotNull
    private Long memberId;

    @NotBlank
    private String password;

    @Builder
    public MemberInsertDTO(Long memberId, String password) {
        this.memberId = memberId;
        this.password = password;
    }

}
