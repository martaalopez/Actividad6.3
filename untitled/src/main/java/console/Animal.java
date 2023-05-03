package console;
public class Animal {
    private String nombre;
    private int edad;
    private String tipo;

    public static String sonido(String tipo) {
    String result ="";
        if (tipo.equals("vaca")) {
            return "Muu";
        } else if (tipo.equals("perro")) {
            return "Guau";
        } else if (tipo.equals("gato")) {
            return "Miau";
        } else if (tipo.equals("oveja")) {
            return  "Bee";
        } else {
            System.out.println("No se ha podido reconocer el animal");
        }
        return result;
    }
    // esto es un duplicate code en vez de el == hemos puesto un ecuals para que no falle
    //Replace Nested Conditional with Guard Clauses

}
