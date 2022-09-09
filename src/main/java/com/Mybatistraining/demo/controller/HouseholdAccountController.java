package com.Mybatistraining.demo.controller;


import com.Mybatistraining.demo.service.HouseholdAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseholdAccountController {

    private final HouseholdAccountService householdAccountService;//ここは何している
    //コンストラクタ生成
    public HouseholdAccountController(HouseholdAccountService householdAccountService) {
        this.householdAccountService = householdAccountService;
    }

    @GetMapping("/accounts")
    //Responseを嚙ますことでエラーが消えた。
    public List<HouseholdAccountResponse> getNames() {
        //householdAccountServiceのリストをstreamに変換。
        return householdAccountService.findAll().stream().map(HouseholdAccountResponse::new).toList();
    }

}
