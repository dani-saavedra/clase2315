package co.edu.unisabana.siga.persistencia;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Que es una tabla de base de datos
@Entity
@Table
public class Estudiante {

  //LOMBOK
  @Id
  @Column
  private int codigo;

  @Column
  private String nombre;
  @Column
  private int semestre;
  @Column
  private boolean activo;

  @Column
  private String sexo;

  @Column
  private int matricula;

  @Column
  private String programa;

  @Column
  private LocalDate fechaCreacion;

  @Column
  private LocalDate fechaModificacion;

  @Column
  private String apellido;

  @Column
  private String otroApellido;

  public String getPrograma() {
    return programa;
  }

  public void setPrograma(String programa) {
    this.programa = programa;
  }

  public LocalDate getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(LocalDate fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public LocalDate getFechaModificacion() {
    return fechaModificacion;
  }

  public void setFechaModificacion(LocalDate fechaModificacion) {
    this.fechaModificacion = fechaModificacion;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getSemestre() {
    return semestre;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }
}
