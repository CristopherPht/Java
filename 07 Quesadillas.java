import java.lang.reflect.Array;

class Quesadillas{
    public static void main(String[] args) {
        int[] Cantidad = {1,2,3};
        int[] Quesadillas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14, 15,16};
        System.out.printf("\t\t\tListado de precios \n");
        //Ciclo For para Quesadillas
         System.out.printf("%-20s %-20s %-20s %-20s", "Cantidad", "Quesadilla", "Refrescos", "Jugos" );
        for (int i = 0; i < Cantidad.length; i++) {
            System.out.printf("%d\n", Cantidad[i]);
        }
        //for(int i = 0; i < Quesadillas.length; i++){
            //System.out.printf("%d\n\t", Quesadillas[i]);
        //}
    }
}