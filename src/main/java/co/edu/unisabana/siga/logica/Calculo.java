package co.edu.unisabana.siga.logica;

import org.springframework.stereotype.Service;

@Service
public class Calculo {

  public int sumar(int num1, int num2) {
    return num1 + num1;
  }

  public int multiplicacion(int num1, int num2) {
    return num1 * num2;
  }
}
