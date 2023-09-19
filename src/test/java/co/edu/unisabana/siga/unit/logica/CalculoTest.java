package co.edu.unisabana.siga.unit.logica;

import static org.junit.jupiter.api.Assertions.*;

import co.edu.unisabana.siga.logica.Calculo;
import org.junit.jupiter.api.Test;

class CalculoTest {

  Calculo calculo = new Calculo();

  @Test
  void Cuando_invoque_sumar_Entonces_da_8() {
    int resultado = calculo.sumar(3, 5);
    assertEquals(8, resultado);
  }

  @Test
  void multiplicacion() {
  }
}