package com.example.labidnp03;

import java.io.Serializable;

public class Postulante implements Serializable {
    //Atributos
    private String apellido_paterno;
    private String apellido_materno;
    private String nombres;
    private String fecha_nacimiento;
    private String colegio;
    private String carrera;

    //Métodos setters y getters
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Postulante{" +
                "apellido_paterno='" + apellido_paterno + "\'" +
                ", apellido_materno='" + apellido_materno + "\'" +
                ", nombres='" + nombres + "\'" +
                ", fecha_nacimiento='" + fecha_nacimiento + "\'" +
                ", colegio='" + colegio + "\'" +
                ", carrera='" + carrera + "\'" +
                "}";
    }
}
