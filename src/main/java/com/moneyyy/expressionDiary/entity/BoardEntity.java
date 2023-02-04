package com.moneyyy.expressionDiary.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(length = 50)
    @NotBlank
    private String title;

    @Column(length = 300)
    @NotBlank
    private String content;

    private Date regDate;

    @ManyToOne
    private MemberEntity memberEntity;

}
