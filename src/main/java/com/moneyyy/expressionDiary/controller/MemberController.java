package com.moneyyy.expressionDiary.controller;

import com.moneyyy.expressionDiary.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/login")
    public String login() {

        return "/login";
    }

    @PostMapping("/register")
    public String register() {

        return "/register";
    }

}
