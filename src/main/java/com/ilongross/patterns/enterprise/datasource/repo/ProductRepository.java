package com.ilongross.patterns.enterprise.datasource.repo;

import com.ilongross.patterns.enterprise.datasource.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository {

    // CREATE
    boolean insertProduct(Product product);
    int insertBatchProduct(List<Product> productList);

    // READ
    List<Product> getAll();
    List<Product> getByFilter(String[] args);
    List<Product> getWithCondition(String[] args);
    Product getByUUID(UUID uuid);

    // UPDATE
    boolean updateProduct(Product product);
    int updateBatchProduct(List<Product> productList);

    // DELETE
    boolean delete(Product product);
    int deleteBatchProduct(List<Product> productList);
    int deleteProductByFilter(String[] args);

    void rollback();

}
