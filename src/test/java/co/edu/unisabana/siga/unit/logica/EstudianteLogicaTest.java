package co.edu.unisabana.siga.unit.logica;

import static org.junit.jupiter.api.Assertions.*;

import co.edu.unisabana.siga.controller.dto.EstudianteDTO;
import co.edu.unisabana.siga.logica.EstudianteLogica;
import co.edu.unisabana.siga.logica.ProgramaEnum;
import co.edu.unisabana.siga.persistencia.Estudiante;
import co.edu.unisabana.siga.persistencia.EstudianteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EstudianteLogicaTest {

  @InjectMocks
  EstudianteLogica logica;

  @Mock
  EstudianteRepository repository;

  @Test
  void obtenerEstudiantes() {
  }

  @Test
  void Dado_estudianteMedicina_Cuando_guarde_Entonces_matricula_30() {
    //preparacion de la data
    EstudianteDTO estudianteDTO = new EstudianteDTO();
    estudianteDTO.setNombre("Juan");
    estudianteDTO.setPrograma(ProgramaEnum.MEDICINA);
    Estudiante estudiante = logica.guardarEstudiante(estudianteDTO);
    assertEquals(30, estudiante.getMatricula());
    Mockito.verify(repository).save(estudiante);
  }

  @Test
  void Dado_estudianteDiferenteMedicina_Cuando_guarde_Entonces_matricula_20() {
    //preparacion de la data
    EstudianteDTO estudianteDTO = new EstudianteDTO();
    estudianteDTO.setNombre("Juan");
    estudianteDTO.setPrograma(ProgramaEnum.INFORMATICA);
    Estudiante estudiante = logica.guardarEstudiante(estudianteDTO);
    assertEquals(20, estudiante.getMatricula());
    Mockito.verify(repository).save(estudiante);
  }

  @Test
  void Dado_estudianteDaniel_Cuando_guarde_Entonces_Excepcion() {
    //preparacion de la data
    EstudianteDTO estudianteDTO = new EstudianteDTO();
    estudianteDTO.setNombre("Daniel");
    assertThrows(Exception.class, () -> {
      logica.guardarEstudiante(estudianteDTO);
    });
  }
}