package com.RDCM.x00045719;

public final class CalculadoraImpuestos extends Empleado{
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;

    private CalculadoraImpuestos(String nombre, String puesto, double salario){
        super(nombre, puesto, salario);
        totalRenta = 0.1;
        totalISSS = 0.03;
        totalAFP = 0.0625;
    }

    public static double calcularPagoSP(double salario){
        double salario1 = salario;
        double totalRenta = 0.01;

        double renta = totalRenta * salario1;
        double pagoEmpleado = salario1 - renta;
        System.out.println("El salario es de $" + pagoEmpleado);
        return pagoEmpleado;
    }

    public static double calcularPagoPF(double salario){
        double renta = 0;
        double totalISSS = 0.03;
        double totalAFP = 0.0625;

        double AFP = totalAFP * salario;
        double ISSS = totalISSS * salario;
        double restante = salario - AFP - ISSS;

        if(restante < 472){
            double pagoEmpleado = restante;
            System.out.println("El salario es de $" + pagoEmpleado);
            return pagoEmpleado;
        }else{
            if(restante < 895.24){
                double pagoEmpleado = 0.1 * (restante-472) + 17.67;
                System.out.println("El salario es de $" + pagoEmpleado);
                return pagoEmpleado;
            }else{
                if(restante < 2038.10){
                    double pagoEmpleado = 0.2 * (restante - 895.24) + 60;
                    System.out.println("El salario es de $" + pagoEmpleado);
                    return pagoEmpleado;
                }else{
                    if(restante > 2038.10){
                        double pagoEmpleado = 0.3 * (restante - 2038.10) + 288.57;
                        System.out.println("El salario es de $" + pagoEmpleado);
                        return pagoEmpleado;
                    }
                }
            }
        }
        return 0;
    }
}

