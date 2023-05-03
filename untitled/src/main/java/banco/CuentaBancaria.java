package banco;

public class CuentaBancaria {
    private double balance;
    private double interes;

    public double getBalance() {
        return balance;
    }

    public double getInteres() {
        return interes;
    }

    // Método para calcular el interés en base a los años
    public double calcularInteres(int anyos) {
        return balance * interes * anyos;
    }
}

