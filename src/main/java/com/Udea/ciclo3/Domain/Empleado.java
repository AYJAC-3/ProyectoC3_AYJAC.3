package com.Udea.ciclo3.Domain;

import lombok.Getter;
import lombok.Setter;

public class Empleado {


    @Getter
    @Setter
    private String nombreEmpleado;
    @Getter @Setter
    private String correoEmpleado;


    private Empresa empresaPertenece;
    @Getter @Setter
    private String rolEmpleado;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correoEmpleado, Empresa empresaPertenece, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaPertenece = empresaPertenece;
        this.rolEmpleado = rolEmpleado;
    }

    public void setempresaPertenece(Empresa empresa) {
        this.empresaPertenece = empresa;
    }

    public Empresa getEmpresaPertenece() {
        return empresaPertenece;
    }

    @Override
    public String toString() {
        return
                "\tNombre del empleado : " + nombreEmpleado + "\n" +
                        "\tCorreo del empleado : " + correoEmpleado + "\n" +
                        "\tRol del empleado : " + rolEmpleado + "\n"+
                        "Empresa a la que Pertenece:" + empresaPertenece + "\n";

    }
    //intento1000
}
