package com.moneyyy.expressionDiary.service;

import com.moneyyy.expressionDiary.dto.MemberInsertDTO;
import com.moneyyy.expressionDiary.entity.MemberEntity;
import com.moneyyy.expressionDiary.exception.DuplicateIdException;
import com.moneyyy.expressionDiary.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public MemberEntity join(MemberInsertDTO memberInsertDTO) {

        if(memberRepository.existsById(memberInsertDTO.getMemberId())) {
            throw new DuplicateIdException(memberInsertDTO.getMemberId());
        }

        MemberEntity memberEntity = MemberEntity.builder()
                .id(memberInsertDTO.getMemberId())
                .password(memberInsertDTO.getPassword())
                .build();

        return memberEntity;
    }

}
