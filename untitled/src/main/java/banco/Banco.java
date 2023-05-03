package banco;

import banco.CuentaBancaria;

import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas;

    // otros métodos

    public double calcularInteresTotal(int anyos) {
        double interesTotal = 0;
        for (CuentaBancaria cuenta : cuentas) {
            interesTotal += cuenta.calcularInteres(anyos);
        }
        return interesTotal;
    }

    //tipo de refactorisacion
    // Move Method middle man
}
