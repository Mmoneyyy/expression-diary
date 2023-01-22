package com.moneyyy.expressionDiary.repository;

import com.moneyyy.expressionDiary.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
