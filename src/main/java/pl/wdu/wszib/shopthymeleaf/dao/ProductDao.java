package pl.wdu.wszib.shopthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wdu.wszib.shopthymeleaf.domain.Product;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceBetweenAndQuantityGreaterThanEqual(double from, double to, int quantity);
}
