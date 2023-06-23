package cl.musicpro.svc_service_product.client;



import cl.musicpro.svc_service_product.model.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cl.musicpro.svc_service_product.model.dto.CommonResponseDTO;


@FeignClient(name="svc-product-db",url="http://localhost:8282/products-db")
public interface ProductDbFeingClient {
   
    @GetMapping(path="/products",produces =MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getProducts();

    @GetMapping(path = "/product/{id}", produces =MediaType.APPLICATION_JSON_VALUE )
    public CommonResponseDTO getProduct(@PathVariable int id);

    @PostMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO> addProduct(@RequestBody ProductDTO productoDTO);

    @PutMapping(path = "/product/edit", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CommonResponseDTO>EditProduct(@RequestBody ProductDTO productoDTO);

    @DeleteMapping(path = "/product/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public CommonResponseDTO deleteProduct(@PathVariable int id);
    
}
