package com.an7one.part02.ch04factorymethod.example.idcard;

import com.an7one.part02.ch04factorymethod.example.framework.Product;

public class IDCard extends Product {

    private final String owner;

    IDCard(String owner) {
        System.out.println("Manufacturing the IDCard of " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(" using " + owner + "'s IDCard");
    }

    public String getOwner() {
        return owner;
    }
}
