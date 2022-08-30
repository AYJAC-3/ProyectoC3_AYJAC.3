package com.Udea.ciclo3.Domain;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Table(name = "movimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter @Getter
    private long montoMovimiento;
    @Setter @Getter
    private String conceptoMovimiento;
    @Setter
    @ManyToOne
    @JoinColumn(name = "empleado_encargado_nombre_empleado")
    @Getter
    private Empleado empleadoEncargado;

    public MovimientoDinero() {
    }

    public MovimientoDinero(long montoMovimiento, String conceptoMovimiento, Empleado empleadoEncargado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
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
