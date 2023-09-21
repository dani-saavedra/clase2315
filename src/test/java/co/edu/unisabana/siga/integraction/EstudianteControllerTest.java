package co.edu.unisabana.siga.integraction;

import static org.junit.jupiter.api.Assertions.assertEquals;


import co.edu.unisabana.siga.controller.dto.EstudianteDTO;
import co.edu.unisabana.siga.controller.dto.RespuestaDTO;
import co.edu.unisabana.siga.logica.ProgramaEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = "pruebitas")
class EstudianteControllerTest {


  @Autowired
  TestRestTemplate rest;

  @Test
  void x() {
    EstudianteDTO dto = new EstudianteDTO("Camilo", 1234567, 6, "Hombre", ProgramaEnum.INFORMATICA);
    ResponseEntity<RespuestaDTO> respuesta = rest.postForEntity(
        "/estudiante/agregar", dto, RespuestaDTO.class);
    assertEquals("Estudiante guardado correctamente", respuesta.getBody().getMensaje());
  }

}
