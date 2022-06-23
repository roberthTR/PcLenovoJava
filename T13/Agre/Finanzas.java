package T13.Agre;

public class Finanzas extends Tienda {

    private String email;

    public Finanzas(String nombre, String email) {
        super(nombre);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
