import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.JOptionPane;

class ListaDePrecios{

    public static void main(String[] args){
        int cantidadProductos, precioQuesadillas, precioRefrescos, precioJugos, pantalla;
        Scanner entrada = new Scanner(System.in);
        cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
        int[] productos = new int[cantidadProductos];
        precioQuesadillas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de las quesadillas: "));
        precioRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de los refrescos: "));
        precioJugos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
        System.out.println("Cantidad       " + "Quesadillas      " + "Refrescos     "+ "     Jugos");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i+1) + "              " + (precioQuesadillas * i) + "                " + (precioRefrescos * i) + "                " + (precioJugos * i));
        }        
    }
}