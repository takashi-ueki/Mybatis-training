package com.Mybatistraining.demo.entitiy;

import javax.xml.crypto.Data;

public class HouseholdAccount {
    private int id;
    private Data dt;
    private String inc_exp;
    private String category;
    private int amount;

    //コンストラクター
    public HouseholdAccount(int id, Data dt, String inc_exp, String category, int amount) {
        this.id = id;
        this.dt = dt;
        this.inc_exp = inc_exp;
        this.category = category;
        this.amount = amount;
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
