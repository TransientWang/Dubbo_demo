package com.mapping;

import com.dao.course;

public interface courseMapper {
    int deleteByPrimaryKey(Short cId);

    int insert(course record);

    int insertSelective(course record);

    course selectByPrimaryKey(Short cId);

    int updateByPrimaryKeySelective(course record);

    int updateByPrimaryKey(course record);
}