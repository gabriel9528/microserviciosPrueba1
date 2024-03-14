package com.microservicios1.shoppingService.Client;

import com.microservicios1.shoppingService.model.Customer;
import com.microservicios1.shoppingService.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "/products")
=======
import org.springframework.web.bind.annotation.RequestParam;

>>>>>>> 4c7e3195f8d0caeec3c4f775afcc03c5898f2c5f
@FeignClient(name = "productService")
public interface ProductClient {
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id);

    @GetMapping("/{id}/stock")
    public ResponseEntity<Product> updateStockProduct(@PathVariable("id") Long id, @RequestParam(name="quantity", required = true) Double quantity);
}
