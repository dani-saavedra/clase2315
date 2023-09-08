package co.edu.unisabana.siga.logica;

import co.edu.unisabana.siga.controller.dto.EstudianteDTO;
import co.edu.unisabana.siga.persistencia.Estudiante;
import co.edu.unisabana.siga.persistencia.EstudianteRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service // Para decir que esta clase es logica de negocio.
public class EstudianteLogica {

  private EstudianteRepository estudianteRepository;

  public EstudianteLogica(EstudianteRepository estudianteRepository) {
    this.estudianteRepository = estudianteRepository;
  }
 /*
  public List<EstudianteDTO> obtenerEstudiantes() {
    return estudianteRepository.findAll().stream().map(
        estudiante -> new EstudianteDTO(estudiante.getCodigo(), estudiante.getNombre(),
            estudiante.getSemestre(), estudiante.getSexo())).collect(Collectors.toList());
  }

  */

  public List<Estudiante> obtenerEstudiantes() {
    return estudianteRepository.findAll();
  }

  public void guardarEstudiante(EstudianteDTO estudianteDTO) {

    if ("Daniel".equals(estudianteDTO.getNombre())) {
      throw new IllegalArgumentException("Prohibido los Daniel, tenemos exceso de ellos");
    }
    Estudiante estudiante = new Estudiante();
    estudiante.setActivo(true);
    estudiante.setFechaCreacion(LocalDate.now());
    estudiante.setFechaModificacion(LocalDate.now());
    estudiante.setNombre(estudianteDTO.getNombre());
    estudiante.setCodigo(estudianteDTO.getCodigo());
    if (ProgramaEnum.MEDICINA.equals(estudianteDTO.getPrograma())) {
      estudiante.setMatricula(30);
    } else {
      estudiante.setMatricula(20);

    }
    estudiante.setSemestre(estudianteDTO.getSemestre());
    estudiante.setSexo(estudianteDTO.getSexo());
    estudiante.setPrograma(estudianteDTO.getPrograma().name());
    estudianteRepository.save(estudiante);
  }
}
