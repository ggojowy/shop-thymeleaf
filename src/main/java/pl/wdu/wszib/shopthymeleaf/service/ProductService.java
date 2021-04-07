package pl.wdu.wszib.shopthymeleaf.service;

import pl.wdu.wszib.shopthymeleaf.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    List<Product> findWithFilter(String from, String to, String onStock);
}
