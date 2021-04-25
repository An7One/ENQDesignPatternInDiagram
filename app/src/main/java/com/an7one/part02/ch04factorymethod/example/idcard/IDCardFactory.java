package com.an7one.part02.ch04factorymethod.example.idcard;

import com.an7one.part02.ch04factorymethod.example.framework.Factory;
import com.an7one.part02.ch04factorymethod.example.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private final List<String> owners;

    public IDCardFactory() {
        this.owners = new ArrayList<>();
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
