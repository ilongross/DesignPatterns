package com.ilongross.patterns.enterprise.datasource.mappers;

import com.ilongross.patterns.enterprise.datasource.Product;

import java.util.List;

public interface ProductMapper {
    Object getSourceFromProduct(Product product);
    Product getProductFromSource(Object source);
    List<Object> getListSourcesFromProducts(List<Product> productList);
    List<Product> getProductsFromSources(List<Object> sourcesList);
}
