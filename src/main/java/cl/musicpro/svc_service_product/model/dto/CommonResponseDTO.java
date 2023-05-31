package cl.musicpro.svc_service_product.model.dto;

import lombok.Data;

@Data
public class CommonResponseDTO {
    private String responseCode;
    private String responseMessage;
    private Object data;
}
