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

        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }


        @GetMapping("/{id}")
        public Product getById(@PathVariable Long id) {
            return productService.getById(id).orElseThrow( ()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
        }

        @PostMapping
        public Product addProduct(@RequestBody Product product) {
            return productService.addProduct(product);
        }

        @DeleteMapping
        public void deleteProductById(@PathVariable Long id) {
            productService.deleteById(id);
        }

        @GetMapping
        public List<Product> search(String name) {
            return productService.findByName(name);

        }

    }

