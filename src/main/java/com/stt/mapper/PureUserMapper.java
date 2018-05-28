package com.stt.mapper;

import com.stt.po.PureUser;
import java.math.BigDecimal;

public interface PureUserMapper {
    int deleteByPrimaryKey(BigDecimal userId);

    int insertSelective(PureUser record);

    PureUser selectByPrimaryKey(BigDecimal userId);

    int updateByPrimaryKeySelective(PureUser record);
}