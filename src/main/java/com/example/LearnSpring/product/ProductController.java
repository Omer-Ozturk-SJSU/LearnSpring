package com.example.LearnSpring.product;

import com.example.LearnSpring.product.model.Product;
import com.example.LearnSpring.product.services.CreateProductsService;
import com.example.LearnSpring.product.services.DeleteProductService;
import com.example.LearnSpring.product.services.GetProductService;
import com.example.LearnSpring.product.services.UpdateProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    // Dependency injection
    // Field injection = @Autowired
    // *** not the best way to do it
    private final CreateProductsService createProductsService;

    private final GetProductService getProductService;

    private final UpdateProductService updateProductService;

    private final DeleteProductService deleteProductService;

    // Constructor injection
    public ProductController(CreateProductsService createProductsService,
                             GetProductService getProductService,
                             UpdateProductService updateProductService,
                             DeleteProductService deleteProductService) {
        this.createProductsService = createProductsService;
        this.getProductService = getProductService;
        this.updateProductService = updateProductService;
        this.deleteProductService = deleteProductService;
    }

    @PostMapping
    public ResponseEntity<String> createProduct(){
        return createProductsService.execute(null);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        return getProductService.execute(null);
    }

    @PutMapping
    public ResponseEntity<String> updateProduct(){
        return updateProductService.execute(null);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return deleteProductService.execute(null);
    }
}
