package com.Udea.ciclo3.Domain;
import javax.persistence.*;
@Entity
@Table(name = "movimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long montoMovimiento;

    private String conceptoMovimiento;

    @ManyToOne
    @JoinColumn(name = "empleado_encargado_nombre_empleado")
    private Empleado empleadoEncargado;

    public MovimientoDinero() {
    }

    public MovimientoDinero(long montoMovimiento, String conceptoMovimiento, Empleado empleadoEncargado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empleadoEncargado = empleadoEncargado;
    }

    public long getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(long montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getEmpleadoEncargado() {
        return empleadoEncargado;
    }

    public void setEmpleadoEncargado(Empleado empleadoEncargado) {
        this.empleadoEncargado = empleadoEncargado;
    }

    @Override
    public String toString() {
        return "\tRegistro de transacción  \n\n" +
                "Valor de la transacción : " + montoMovimiento + "\n" +
                "Concepto del Movimiento : " + conceptoMovimiento + "\n\n" +
                "\tEmpleado encargado:\n\n" + empleadoEncargado;

    }
}
