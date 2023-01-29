package com.moneyyy.expressionDiary.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class BoardInsertDTO {

    private String title;

    private String content;

}
