package T13.Agre;

public class Main {

    public static void main(String[] args)
    {
    Tienda fashFood= new Tienda("Mega Fash Food");

    Finanzas oli= new Finanzas("Lic. Oliver ZAPATA BERAUN", "oliver.zb81@gmail.com");
    
    Contabilidad juan= new Contabilidad("Juan RAMOS OLIVERA", " en Contabilidad");

    Asistente julio = new Asistente("Julio SEVALLOS PARRA", 611578329);

    
    System.out.println("++++++++++"+fashFood.getNombre()+"++++++++++\n");
    System.out.println("En Tienda "+fashFood.getNombre());
    System.out.println("El encargado de es Finanzas: "+oli.getNombre()+" su Correo: "+oli.getEmail());
    System.out.println("El encargado de es Contabilidad: "+juan.getNombre()+" es Titulado en: "+juan.getTitulado());
    System.out.println("El encargado de es Asistente: "+julio.getNombre()+" su Id de empleado es: "+julio.getId());

    }
}
