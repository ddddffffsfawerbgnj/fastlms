package com.zerobase.fastlms;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test01 {
    @Test
    void Test_01() {
        String value = "2021-06-08";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate.parse(value, formatter);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}