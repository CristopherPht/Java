import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.JOptionPane;

class ListaDePrecios{

    public static void main(String[] args){
        int cantidadProductos, precioQuesadillas, precioRefrescos, precioJugos, pantalla;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos a comprar: ");
        cantidadProductos = entrada.nextInt();
        int[] productos = new int[cantidadProductos];
        System.out.println("\nIngrese el precio de las quesadillas: ");
        precioQuesadillas = entrada.nextInt();
        System.out.println("\nIngrese el precio de los refrescos: ");
        precioRefrescos = entrada.nextInt();
        System.out.println("\nIngrese la cantidad de productos: ");
        precioJugos = entrada.nextInt();
        System.out.println("Cantidad       " + "Quesadillas      " + "Refrescos     "+ "     Jugos");
        for (int i = 1; i <= productos.length; i++) {
            System.out.println((i) + "              " + (precioQuesadillas * i) + "                " + (precioRefrescos * i) + "                " + (precioJugos * i));
        }        
    }
}