package com.zerobase.fastlms.course.model;

import com.zerobase.fastlms.admin.model.CommonParam;
import lombok.Data;

import java.sql.Struct;

@Data
public class ServiceResult {
    boolean result;

    String message;

    //디폴트 생성자
    public ServiceResult() {
    }

    public ServiceResult(boolean result, String message) {
        this.result = result;
        this.message = message;
    }

    public ServiceResult(boolean result) {
        this.result = result;
    }
}
