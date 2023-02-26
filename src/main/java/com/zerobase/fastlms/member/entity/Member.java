package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member implements MemberCode {
    @Id
    private String userId;

    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt;

    private boolean emailAuthYn;
    private LocalDateTime emailAuthDt;
    private String emailAuthKey;

    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;

    //관리자여부를 지정할거냐?
    //회원에 따른 ROLE을 저장할거냐?
    //준회원/정회원/특별회원/관리자
    //ROLE_SAMI_USER, ROLE_USER, ROLE_SPECIAL_USER, ROLE_ADMIN
    //준회원/정회원/특별회원
    //관리자???
    private boolean adminYn;

    private String userStatus; //회원상태: 이용 가능, 정지


}
