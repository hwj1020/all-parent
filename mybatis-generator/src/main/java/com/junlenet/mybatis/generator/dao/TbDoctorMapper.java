package com.junlenet.mybatis.generator.dao;

import com.junlenet.mybatis.generator.model.TbDoctor;

public interface TbDoctorMapper {
    /**
     */
    int deleteByPrimaryKey(Long id);

    /**
     */
    int insert(TbDoctor record);

    /**
     */
    int insertSelective(TbDoctor record);

    /**
     */
    TbDoctor selectByPrimaryKey(Long id);

    /**
     */
    int updateByPrimaryKeySelective(TbDoctor record);

    /**
     */
    int updateByPrimaryKey(TbDoctor record);
}