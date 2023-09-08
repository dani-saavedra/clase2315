package co.edu.unisabana.siga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

  @GetMapping("/saludame")
  public String saludar() {
    return "Hola Mundo desde un servidor";
  }

  @GetMapping("/saludame/conestilo")
  public String saludar2() {
    return "Whatsup";
  }

  @GetMapping("/suma")
  public String sumar(@RequestParam int numero1, @RequestParam int numero2) {
    return "Resultado " + (numero1 + numero2);
  }
  @GetMapping("/mal")
  public String mal() {
    throw new NullPointerException();

  }
}
