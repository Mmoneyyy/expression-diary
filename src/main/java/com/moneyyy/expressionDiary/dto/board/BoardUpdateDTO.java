package com.moneyyy.expressionDiary.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class BoardUpdateDTO {

    private Long boardId;

    private String title;

    private String content;

}
