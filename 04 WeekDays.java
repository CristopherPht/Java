import java.util.Scanner;

public class WeekDays{
    public static void main(String[] args) {
        int Day;
        Scanner day = new Scanner(System.in);
        System.out.println("Escribe el número del día que quieres mostrar: \n");
        Day = day.nextInt();
        System.out.println("\n");
        switch (Day) {
            case 1:
                System.out.println("El número equivale al día: ");  
                System.out.println("\n Domingo");
            break;

            case 2:
                System.out.println("El número equivale al día: "); 
                System.out.println("\nLunes");
            break;

            case 3:
                System.out.println("El número equivale al día: "); 
                System.out.println("\nMartes");
            break;

            case 4:
                System.out.println("El número equivale al día: "); 
                System.out.println("\nMiércoles");
            break;

            case 5:
                System.out.println("El número equivale al día: "); 
                System.out.println("\nJueves");
            break;

            case 6:
                System.out.println("El número equivale al día: "); 
                System.out.println("\nViernes");
            break;

            case 7:
                System.out.println("El número equivale al día: "); 
                System.out.println("\nSábado");
            break;
            default: 
                System.out.println("\nEl número que se ha introducido no coincide con los valores asignados");
                break;
        }
    }
}