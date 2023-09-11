package co.edu.unisabana.siga.controller;

import co.edu.unisabana.siga.controller.dto.EstudianteDTO;
import co.edu.unisabana.siga.controller.dto.RespuestaDTO;
import co.edu.unisabana.siga.logica.EstudianteLogica;
import co.edu.unisabana.siga.persistencia.Estudiante;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // para decirme que es un controlador
@Slf4j
public class EstudianteController {


  private final EstudianteLogica estudianteLogica;

  public EstudianteController(EstudianteLogica estudianteLogica) {
    this.estudianteLogica = estudianteLogica;
  }


  @GetMapping(path = "/estudiantes")
  public List<Estudiante> obtenerEstudiantes() {
    log.info("Consultando estudiantes");
    return estudianteLogica.obtenerEstudiantes();
  }


  @PostMapping(path = "/estudiante/agregar")
  public RespuestaDTO guardarEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
    log.info("Agregando estudiantes");

    try {
      estudianteLogica.guardarEstudiante(estudianteDTO);
      return new RespuestaDTO("Estudiante guardado correctamente");
    } catch (IllegalArgumentException e) {
      log.error("error guardando estudiante", e);
      return new RespuestaDTO("Estudiante no se pudo guardar " + e.getMessage());
    }

  }
}
