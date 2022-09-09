package com.Mybatistraining.demo.service;

import com.Mybatistraining.demo.entitiy.HouseholdAccount;
import com.Mybatistraining.demo.mapper.HouseholdAccountMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //業務処理を行うのでこのアノテーションを付与
public class HouseholdAccountServiceImpl implements HouseholdAccountService {

    //mapperから処理を呼び出してコンストラクター生成
    private HouseholdAccountMapper householdAccountMapper;

    public HouseholdAccountServiceImpl(HouseholdAccountMapper householdAccountMapper) {
        this.householdAccountMapper = householdAccountMapper;
    }

    @Override  //インターフェースの処理を実行
    public List<HouseholdAccount> findAll() {
        return householdAccountMapper.findAll();
    }

}
