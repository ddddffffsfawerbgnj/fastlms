package com.zerobase.fastlms.course;

import com.zerobase.fastlms.admin.model.CommonParam;
import lombok.Data;

@Data
public class CourseParam extends CommonParam {
    long id; //course.id
    long categoryId;
}
