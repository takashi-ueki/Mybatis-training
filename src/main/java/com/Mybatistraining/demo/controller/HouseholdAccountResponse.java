package com.Mybatistraining.demo.controller;

import com.Mybatistraining.demo.entitiy.HouseholdAccount;

import javax.xml.crypto.Data;

public class HouseholdAccountResponse {
    private int id;
    private Data dt;
    private String inc_exp;
    private String category;
    private int amount;

    public HouseholdAccountResponse(int id, Data dt, String inc_exp, String category, int amount) {
        this.id = id;
        this.dt = dt;
        this.inc_exp = inc_exp;
        this.category = category;
        this.amount = amount;
    }

    public HouseholdAccountResponse(HouseholdAccount householdAccount) {
        this.id = householdAccount.getId();
        this.dt = householdAccount.getDt();
        this.inc_exp = householdAccount.getInc_exp();
        this.category = householdAccount.getCategory();
        this.amount = householdAccount.getAmount();
    }

    public int getId() {
        return id;
    }

    public Data getDt() {
        return dt;
    }

    public String getInc_exp() {
        return inc_exp;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }
}
