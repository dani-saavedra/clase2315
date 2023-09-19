package co.edu.unisabana.siga.controller.dto;

import co.edu.unisabana.siga.logica.ProgramaEnum;

public class EstudianteDTO {

  private String nombre;
  private int codigo;
  private int semestre;
  private String sexo;

  private ProgramaEnum programa;

  public EstudianteDTO() {
  }

  public EstudianteDTO(String nombre, int codigo, int semestre, String sexo,
      ProgramaEnum programa) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.semestre = semestre;
    this.sexo = sexo;
    this.programa = programa;
  }

  public ProgramaEnum getPrograma() {
    return programa;
  }

  public void setPrograma(ProgramaEnum programa) {
    this.programa = programa;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getSemestre() {
    return semestre;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
}
