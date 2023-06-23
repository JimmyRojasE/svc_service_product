package cl.musicpro.svc_service_product.service;



import cl.musicpro.svc_service_product.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public CommonResponseDTO getProduct(int id){
        log.info("Request cl.musicpro.svc_service_product.service[getProduct]");
        log.info("[getProduct] Response: "+productDbFeingClient.getProducts().toString());
        return productDbFeingClient.getProduct(id);
    }

    public CommonResponseDTO deleteProduct(int id){
        log.info("Request cl.musicpro.svc_service_product.service[deleteProduct]");
        log.info("[deleteProduct] Response: "+productDbFeingClient.getProducts().toString());
        return productDbFeingClient.deleteProduct(id);
    }
    public ResponseEntity<CommonResponseDTO> addProduct(ProductDTO productDTO){
        log.info("Request cl.musicpro.svc_service_product.service[addProduct]");
        log.info("[addProduct] Response: "+productDbFeingClient.getProducts().toString());
        return productDbFeingClient.addProduct(productDTO);
    }
    public ResponseEntity<CommonResponseDTO> editProduct(ProductDTO productDTO){
        log.info("Request cl.musicpro.svc_service_product.service[editProduct]");
        log.info("[editProduct] Response: "+productDbFeingClient.getProducts().toString());
        return productDbFeingClient.EditProduct(productDTO);
    }
}
