package pagos;

public class FromaDePagoPaypal extends FormasDePago{
    private String email;
    private String password;

    public FromaDePagoPaypal(String email, String password) {
        this.email = email;
        this.password = password;
    }


    // tipo Alternative Classes with different interfaces
}
