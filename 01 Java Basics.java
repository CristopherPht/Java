import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class JavaBasics {
public static void main(String[] args) {
        //Hello World
        System.out.println("Hello, Java!");

        String  myString = "This is a text chain";
        myString = "This will change chain text value";
        System.out.println(myString);

        final String myConstant = "This is a constant text chain";

        // Valores Enteros
        Integer myInt = 7;
        myInt = myInt + 7;
        System.out.println(myInt - 1);

        // Valores décimales
        Double  myDouble = 1.5;
        System.out.println(myDouble);

        // Por anotar...
        Float myFloat = 1.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + myFloat + myInt + " " + myString + " ");

        // True or False
        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        //Nulos
        myBoolean = null;
        System.out.println(myBoolean);

        myFloat = null;

        // Condicionales
        if(myFloat != null){
            System.out.println(myFloat + 10);
            System.out.println("My float is different than null");
        } else{
            System.out.println("My float is null");
        }

        // Condicionales compuestas
        if (myInt == 11){
            System.out.println("myInt = 11");
        } else if(myInt == 12){
            System.out.println("myInt = 12");
        } else{
            System.out.println("The value is not 11 or 12");
        }

        // Estructuras

        // Listas
        List <String> myList = new ArrayList();
        myList.add(myString);
        myList.add(myInt.toString());
        System.out.println(myList);

        // Mapas
        Map <String, String> myMap = new HashMap();
        myMap.put("string ", myString);
        myMap.put("int ", myInt.toString());
        System.out.println(myMap);
        System.out.println(myMap.get("int"));

        // Ciclos
        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }

        while(true){
            System.out.println("While Cicle");
        }
        

        // Arreglos
        /* int [] Numeros = new int [5];
        Numeros[0] = 5;
        Numeros[1] = 10; */


        // Main myMain = new Main();
        // myMain.myFunction(5,10);
        // myMain.myFunction(10,20);
    }
    // Funciones
    public int myFunction (int myFirstNumber, int mySecondNumber) {
        return myFirstNumber + mySecondNumber;
    }

}

    