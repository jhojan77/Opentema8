public class Main {
    public static void main(String[] args) {

        persona persona1 = new persona();

        persona1.setNombre("Juan");
        System.out.println("Hola mi nombre es:"+ persona1.getNombre());
        persona1.setEdad(30);
        System.out.println("Mi edad es:" + persona1.getEdad() + " años");
        persona1.setTelefono(258709345);
        System.out.println("Mi numero de telefono es:"+ persona1.getTelefono());
        System.out.println("------------------------------------------------------");

        persona1.setNombre("Andres");
        System.out.println("Hola mi nombre es:"+ persona1.getNombre());
        persona1.setEdad(23);
        System.out.println("Mi edad es:" + persona1.getEdad() + " años");
        persona1.setTelefono(464948022);
        System.out.println("Mi numero de telefono es:"+ persona1.getTelefono());
        System.out.println("------------------------------------------------------");

        persona1.setNombre("Eliana");
        System.out.println("Hola mi nombre es:"+ persona1.getNombre());
        persona1.setEdad(48);
        System.out.println("Mi edad es:" + persona1.getEdad() + " años");
        persona1.setTelefono(788456745);
        System.out.println("Mi numero de telefono es:"+ persona1.getTelefono());
    }
}