package com.moneyyy.expressionDiary.service.board;

import com.moneyyy.expressionDiary.dto.board.BoardDeleteDTO;
import com.moneyyy.expressionDiary.dto.board.BoardInsertDTO;
import com.moneyyy.expressionDiary.dto.board.BoardUpdateDTO;
import com.moneyyy.expressionDiary.entity.BoardEntity;

public interface BoardService {
    public BoardEntity insert(BoardInsertDTO boardInsertDTO);
    public BoardEntity update(BoardUpdateDTO boardUpdateDTO);
    public BoardEntity delete(BoardDeleteDTO boardDeleteDTO);
}
