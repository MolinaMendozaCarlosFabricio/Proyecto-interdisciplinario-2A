import java.util.Scanner;
public class Menu {
    Producto infProducto [] = new Producto[200];
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        int procedimiento;
        do {
            procedimiento = entrada.nextInt();
            switch (procedimiento) {
                case 1: break;
            
                default:System.out.println("Ingrese una operacion valida"); break;
            }
        } while ();
    }
    public static void registrarProducto (){}
    public static void modificarProducto (){}
    public static void eliminarProducto (){}
    public static void modificarExistencias (){}
    public static void consultarInfo (){}
    public static void buscarInfo (){}
    public static void vender (){}
    public static void registroDeVentas (){}
}
