package cl.musicpro.svc_service_product.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.musicpro.svc_service_product.client.ProductDbFeingClient;
import cl.musicpro.svc_service_product.model.dto.CommonResponseDTO;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductService {
   @Autowired
    ProductDbFeingClient productDbFeingClient;

    public  CommonResponseDTO getProducts(){
    
        log.info("Request cl.musicpro.svc_service_product.service[getProducts]");
        log.info("[getProducts] Response: "+productDbFeingClient.getProducts().toString());
        return productDbFeingClient.getProducts();
    }
}
