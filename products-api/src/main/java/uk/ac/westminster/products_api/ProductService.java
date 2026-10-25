package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        products.add(new DigitalProduct("/download/1", 45.0, nextId++, "image", 98.56));
        products.add(new PhysicalProduct(nextId++, "laptop", 45.0, 2.0, "6*4"));
    }

    public List<Product> getAllProducts() {
        return products;
    }
    public Product addProduct(Product product) {
        product.setId(nextId++); // use the value, then add one
        products.add(product);
        nextId++;
        return product;
    }

    public Optional<Product> getById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public Boolean deleteById(Long id) {
       return products.removeIf(p -> p.getId().equals(id ));
    }

    public List<Product> findByName(String name) {
       return products.stream().filter( p -> p.getName().contains(name)).toList();
    }
}
