import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double Altura, Radio, Volumen;
        Scanner Valor = new Scanner(System.in);
        System.out.println("Ingresa la Altura del Cono: ");
        Altura = Valor.nextDouble();
        System.out.println("Ingresa el Radio del Cono: ");
        Radio = Valor.nextDouble();
        // Formula for calculate
        Volumen = (3.1416 * Radio * Radio * Altura) / 3;
        System.out.println("El Volumen del Cono es = " + Volumen);
    }
}