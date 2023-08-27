import java.util.ArrayList;

class Seleccion {
    // Variable -> Estado
    // Comportamiento -> Métodos

    // Tipos de datos primitivos
    // int, byte, short, long, float, double, boolean, char

    String nombreEquipo;
    char grupo;
    boolean clasificadosACuartos;

    // Métodos
    void imprimirEquipo(){
        System.out.println(nombreEquipo);
        System.out.println(grupo);
        System.out.println(clasificadosACuartos);
    }

    public static void main(String[] args) {
        Seleccion argentina = new Seleccion();
        argentina.nombreEquipo = "Argentina";
        argentina.grupo = 'C';
        argentina.clasificadosACuartos = false;

        argentina.imprimirEquipo();

        // Imprimir resultados sin métodos
        /* System.out.println(argentina.nombreEquipo);
        System.out.println(argentina.grupo);
        System.out.println(argentina.clasificadosACuartos); */

        // Bloques condicionales

        // If Statement

        if(argentina.clasificadosACuartos == true) {
            System.out.println("Clasicados");
        } else if (argentina.clasificadosACuartos == false) {
            System.out.println("Somos malisimos");
        }

        // Bucles - loops

        // for - loop
        for (int i = 1; i < 11; i++){
            System.out.println("Asiento: " + i);
        }

        // while loop
        int j = 1;
        while (j < 11) {
            System.out.println("Asiento: " + j);
            j++;
        }

        // Excepciones

        int x = 0;
        int z = 5;

        // Try - Catch
        try {
            System.out.println(z / x);
        } catch (Exception excepcion){
            System.out.println("Imposible dividir por 0");
        }
        
        // API
        ArrayList <String> selecciones = new ArrayList<>();
        selecciones.add("Francia");
        selecciones.add("Inglaterra");
        selecciones.add("Brasil");
        selecciones.add("Marruecos");

        System.out.println(selecciones);

    }
}
