package pagos;

public class FormaDePagoTarjeta extends FormasDePago{
    private String numeroTarjeta;
    private String fechaCaducidad;
    private String cvv;

    public FormaDePagoTarjeta(String numeroTarjeta, String fechaCaducidad, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
        this.cvv = cvv;
    }


    // tipo Alternative Classes with different interfaces
}
