package cl.musicpro.svc_service_product.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.musicpro.svc_service_product.model.dto.CommonResponseDTO;

import cl.musicpro.svc_service_product.service.ProductService;

@RestController
@RequestMapping("/products-svc")
public class ProductController {
    @Autowired
    ProductService productService;
    
    @GetMapping(path="/products", produces=MediaType.APPLICATION_JSON_VALUE )
    public CommonResponseDTO getProducts(){
        return productService.getProducts();
    }
    
}
