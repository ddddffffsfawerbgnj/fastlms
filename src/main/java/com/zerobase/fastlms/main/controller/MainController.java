package com.zerobase.fastlms.main.controller;

//MainPage 클래스를 만든 목적!!
//매핑하기 위해서
//주소와(논리적인 주소 인터넷 주소) 물리적인 파일(프로그래밍을 해야하니까) 매핑

//http://www.naver.com/new/list.do
//하나의 주소에 대해서
//어디서 매핑? 누가 매핑?
//후보군? 클래스, 속성, 메소드
//http://localhost:8080/

import com.zerobase.fastlms.componenet.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MainController {
    private final MailComponents mailComponents;

//    @RequestMapping("/")
//    public String index() {
//        String email = "dmstndi12@gmail.com";
//        String subject = "안녕하세요. 제로베이스입니다.";
//        String text = "<p>안녕하세요.</p><p>반갑습니다.</p>";
//
//        mailComponents.sendMail(email, subject, text);
//
//        return "index";
//    }
}