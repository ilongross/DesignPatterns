package com.ilongross.patterns.enterprise.datasource.mappers;

import com.ilongross.patterns.enterprise.datasource.Product;

import java.util.List;

public class ImitatorProductMapper implements ProductMapper{
    @Override
    public Object getSourceFromProduct(Product product) {
        return product.toString();
    }

    @Override
    public Product getProductFromSource(Object source) {
        return null;
    }

    @Override
    public List<Object> getListSourcesFromProducts(List<Product> productList) {
        return null;
    }

    @Override
    public List<Product> getProductsFromSources(List<Object> sourcesList) {
        return null;
    }
}
