package desafioexcepcion;

public class ExceptionNumero extends RuntimeException {

    public ExceptionNumero(String arg) {
        super(arg);
    }

    public String validaNulo(String arg) {
        String mensaje = "";
        if (arg == null) {
            mensaje = "campo nulo";
        }
        return mensaje;
    }
}
