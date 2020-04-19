package com.RDCM.x00045719;

public class Main {

    public static void main(String[] args) {
        ServicioProfesional empleado1 = new ServicioProfesional("Pedro", "Empleado", 350, 12);
        CalculadoraImpuestos.calcularPagoSP(350);

        PlazaFija empelado2 = new PlazaFija("Armando", "Jefe", 1550, 34563828);
        CalculadoraImpuestos.calcularPagoPF(1550);
    }
}
