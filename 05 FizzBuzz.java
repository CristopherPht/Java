// Reto #1 FIZZ BUZZ
// Dificultad: Fácil
/* Escribe un programa que muestre (por consola) los números del 1 - 100
(ambos incluídos y con un salto de línea entre cada impesión), sustituyendo
los siguientes:
- Múltiplos de 3 por la palabra "Fizz"
- Múltiplos de 5 por la palabra "Buzz"
- Múltiplos de 3 y 5 a la vez por la palabra "Fizz Buzz"
 */
class FizzBuzz{
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i < n; i++){
            if(i % 5 == 0 && i % 3 == 0)
                System.out.println("Fizzbuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i + " ");
        }
    }
}