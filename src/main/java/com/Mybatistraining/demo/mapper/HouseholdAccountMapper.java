package com.Mybatistraining.demo.mapper;

import com.Mybatistraining.demo.entitiy.HouseholdAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface HouseholdAccountMapper {

    @Select("SELECT * FROM accounts")
//ここは何している
    List<HouseholdAccount> findAll();

    @Select("SELECT * FROM names WHERE id = #{id}")
        //ここは何している
    Optional<HouseholdAccount> findById(int id);
}
