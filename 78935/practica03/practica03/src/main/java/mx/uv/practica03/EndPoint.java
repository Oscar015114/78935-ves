package mx.uv.practica03;

 import org.springframework.ws.server.endpoint.annotation.Endpoint;
 import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
 import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
 import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import https.t4is_uv_mx.saludos.SaludarRequest;
import https.t4is_uv_mx.saludos.SaludarResponse;



 @Endpoint
public class EndPoint {
    @PayloadRoot(localPart = "SaludarRequest", namespace = "https//t4is.uv.mx/saludos")

@ResponsePayload
 public SaludarResponse saludar(@RequestPayload SaludarRequest peticion) {
    SaludarResponse respuesta = new SaludarResponse();
     respuesta.setRespuesta("hola" + peticion.getNombre());
    return respuesta;
 }

 }
