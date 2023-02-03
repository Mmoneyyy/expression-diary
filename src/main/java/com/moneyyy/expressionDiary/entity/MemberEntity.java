package com.moneyyy.expressionDiary.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // erd 수정하기(필수), Column name "id"로 고치기(보류)
    @Column(name = "member_id")
    private Long memberId;

    // 로그인 아이디
    private Long id;

    // 로그인 비밀번호
    private String password;

}
