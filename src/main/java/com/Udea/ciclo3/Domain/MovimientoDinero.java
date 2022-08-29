package com.Udea.ciclo3.Domain;
import lombok.Getter;
import lombok.Setter;
public class MovimientoDinero {

    @Getter @Setter
    private int montoMovimiento;

    @Getter @Setter
    private String conceptoMovimiento;

    @Getter @Setter
    private Empleado empleadoEncargado;


    public MovimientoDinero() {
    }

    public MovimientoDinero(int montoMovimiento, String conceptoMovimiento, Empleado empleadoEncargado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empleadoEncargado = empleadoEncargado;
    }

    @Override
    public String toString() {
        return "\t Registro de transacción  \n\n" +
                "Valor de la transacción : " + montoMovimiento +"\n"+
                "Concepto del Movimiento : " + conceptoMovimiento + "\n" +
                "Empleado encargado:\n" + empleadoEncargado;
    }
}
