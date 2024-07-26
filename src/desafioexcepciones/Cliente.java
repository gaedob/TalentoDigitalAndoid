package desafioexcepciones;


public class Cliente {

    private int edad;

    public Cliente() {
    }

    public Cliente(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "{" +
            " edad='" + getEdad() + "'" +
            "}";
    }

}
