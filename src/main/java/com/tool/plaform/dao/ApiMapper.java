package com.tool.plaform.dao;

import com.tool.plaform.entity.Api;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api
     *
     * @mbg.generated
     */
    int insert(Api record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api
     *
     * @mbg.generated
     */
    int insertSelective(Api record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api
     *
     * @mbg.generated
     */
    Api selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Api record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table api
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Api record);

    Api queryApiByParam(String param);

    List<Api> findAllApi();
}