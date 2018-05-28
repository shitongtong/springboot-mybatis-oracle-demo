package com.stt.mapper;

import com.stt.po.Demo;

import java.util.List;

public interface DemoMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);

    List<Demo> findAll();
}