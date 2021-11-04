package com.ilongross.patterns.enterprise.datasource.repo;

import com.ilongross.patterns.enterprise.datasource.DbImitator;
import com.ilongross.patterns.enterprise.datasource.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductRepositoryOnDbImitator implements ProductRepository{
    private DbImitator imitator = new DbImitator();
    @Override
    public boolean insertProduct(Product product) {
        return false;
    }

    @Override
    public int insertBatchProduct(List<Product> productList) {
        return 0;
    }

    @Override
    public List<Product> getAll() {
//        String result = imitator.getListObjectBySQL("Product");
        return new ArrayList<>();
    }

    @Override
    public List<Product> getByFilter(String[] args) {
        return null;
    }

    @Override
    public List<Product> getWithCondition(String[] args) {
        return null;
    }

    @Override
    public Product getByUUID(UUID uuid) {
        return null;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }

    @Override
    public int updateBatchProduct(List<Product> productList) {
        return 0;
    }

    @Override
    public boolean delete(Product product) {
        return false;
    }

    @Override
    public int deleteBatchProduct(List<Product> productList) {
        return 0;
    }

    @Override
    public int deleteProductByFilter(String[] args) {
        return 0;
    }

    @Override
    public void rollback() {

    }
}
