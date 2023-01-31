package com.moneyyy.expressionDiary.service;

import com.moneyyy.expressionDiary.dto.member.MemberInsertDTO;
import com.moneyyy.expressionDiary.entity.MemberEntity;

public interface MemberService {
    public MemberEntity join(MemberInsertDTO memberInsertDTO);
}
