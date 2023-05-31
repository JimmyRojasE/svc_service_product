package cl.musicpro.svc_service_product.client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import cl.musicpro.svc_service_product.model.dto.CommonResponseDTO;


@FeignClient(name="svc-product-db",url="http://localhost:8282/products-db")
public interface ProductDbFeingClient {
   
    @GetMapping(path="/products",produces =MediaType.APPLICATION_JSON_VALUE)
    public CommonResponseDTO getProducts();
    
}
