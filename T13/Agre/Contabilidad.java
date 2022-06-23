package T13.Agre;

public class Contabilidad extends Tienda {

    private String titulado;

    public Contabilidad(String nombre, String titulado) {
        super(nombre);
        this.titulado = titulado;
    }

    public String getTitulado() {
        return titulado;
    }

    public void setTitulado(String titulado) {
        this.titulado = titulado;
    }
}
