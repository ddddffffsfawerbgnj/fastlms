package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MemberDto {
    String userId;
    String userName;
    String phone;
    String password;
    LocalDateTime regDt;
    LocalDateTime upDt;

    boolean emailAuthYn;
    LocalDateTime emailAuthDt;
    String emailAuthKey;

    String resetPasswordKey;
    LocalDateTime resetPasswordLimitDt;

    boolean adminYn;
    String userStatus;

    private String zipcode;
    private String address;
    private String addrDetail;

    //추가 컬럼
    long totalCount;
    long seq;

    public static MemberDto of(Member member) {
        return MemberDto.builder()
                .userId(member.getUserId())
                .userName(member.getUserName())
                .phone(member.getPhone())
                //.password(member.getPassword())
                .regDt(member.getRegDt())
                .upDt(member.getUpDt())
                .emailAuthYn(member.isEmailAuthYn())
                .emailAuthDt(member.getEmailAuthDt())
                .emailAuthKey(member.getEmailAuthKey())
                .resetPasswordKey(member.getResetPasswordKey())
                .resetPasswordLimitDt(member.getResetPasswordLimitDt())
                .adminYn(member.isAdminYn())
                .userStatus(member.getUserStatus())

                .zipcode(member.getZipcode())
                .address(member.getAddress())
                .addrDetail(member.getAddrDetail())

                .build();
    }

    public String getRegDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd HH::mm:ss");
        return regDt != null ? regDt.format(formatter) : "";
    }

    public String getUpDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd HH::mm:ss");
        return upDt != null ? upDt.format(formatter) : "";
    }
}
