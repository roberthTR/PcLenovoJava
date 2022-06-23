package T13.Agre;

public class Asistente extends Tienda {

    private int id;

    public Asistente(String nombre, int id) {
        super(nombre);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
