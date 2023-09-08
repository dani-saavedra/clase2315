package co.edu.unisabana.siga.controller;

import co.edu.unisabana.siga.controller.dto.EstudianteDTO;
import co.edu.unisabana.siga.controller.dto.RespuestaDTO;
import co.edu.unisabana.siga.logica.EstudianteLogica;
import co.edu.unisabana.siga.persistencia.Estudiante;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // para decirme que es un controlador
public class EstudianteController {

  private static final Logger logger = LogManager.getLogger(EstudianteController.class);


  private final EstudianteLogica estudianteLogica;

  public EstudianteController(EstudianteLogica estudianteLogica) {
    this.estudianteLogica = estudianteLogica;
  }


  @GetMapping(path = "/estudiantes")
  public List<Estudiante> obtenerEstudiantes() {
    logger.info("Consultando estudiantes");
    return estudianteLogica.obtenerEstudiantes();
  }



  /*@DeleteMapping(path = "/estudiante/eliminartodo")
  public boolean eliminarTodo() {
    estudianteRepository.deleteAll();
    return true;
  }*/

  @PostMapping(path = "/estudiante/agregar")
  public RespuestaDTO guardarEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
    logger.info("Agregando estudiantes");

    try {
      estudianteLogica.guardarEstudiante(estudianteDTO);
      return new RespuestaDTO("Estudiante guardado correctamente");
    } catch (IllegalArgumentException e) {
      return new RespuestaDTO("Estudiante no se pudo guardar " + e.getMessage());
    }

  }
}
