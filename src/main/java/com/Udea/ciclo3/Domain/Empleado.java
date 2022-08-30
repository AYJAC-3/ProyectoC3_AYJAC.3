package com.Udea.ciclo3.Domain;
import javax.persistence.*;

import javax.persistence.*;
@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String nombreEmpleado;
    private String correoEmpleado;
    @ManyToOne
    @JoinColumn(name = "empresa_pertenece_id")
    private Empresa empresaPertenece;
    private String rolEmpleado;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correoEmpleado, Empresa empresaPertenece, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaPertenece = empresaPertenece;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Empresa getEmpresaPertenece() {
        return empresaPertenece;
    }

    public void setEmpresaPertenece(Empresa empresaPertenece) {
        this.empresaPertenece = empresaPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    @Override
    public String toString() {
        return
                "Nombre del empleado : " + nombreEmpleado + "\n" +
                        "Correo del empleado : " + correoEmpleado + "\n" +
                        "Rol del empleado : " + rolEmpleado + "\n\n" +
                        "\tEmpresa a la que Pertenece:\n\n" + empresaPertenece;

    }
}
