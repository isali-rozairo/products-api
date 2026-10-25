package uk.ac.westminster.products_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


    @RestController
    @RequestMapping("/products")
    public class ProductController {

        @Autowired
        private ProductService productService;

        @GetMapping()
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }


        @GetMapping("/{id}")
        public Product getById(@PathVariable Long id) {
            return productService.getById(id).orElse(null);
        }

        @PostMapping()
        public Product addProduct(@RequestBody Product product) {
            return productService.addProduct(product);
        }

        @DeleteMapping("/{id}")
        public void deleteProductById(@PathVariable Long id) {
            productService.deleteById(id);
        }

        @GetMapping("/search")
        public List<Product> search(String name) {
            return productService.findByName(name);

        }

    }

