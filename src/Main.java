public class Main {
    public static void main(String[] args) {

        System.out.println(esPrimo(1));
    }
/*
EJERCICIO 1:
    Entrada:
     - Numero entero n.
    Salida:
     - Retornara booleano que indica si es primo o no.
    Pre condicion:
     - N > 0
    Post codiciones:
     - Retornara un valor booleano verdadero si el numero es un primo sino retornara falso.
*/

    public static boolean esPrimo (int n) {
        if (n > 0){
            int catidadDivisiores = 0;
            for (int i = 1; i <= 100; i++) {
                if (n % i == 0) {
                    catidadDivisiores++;
                }
            }
            return catidadDivisiores == 2;
        }
        return false;
    }

/*
EJERCICIO 2:
    Entrada:
        - Numero entero n.
    Salida:
        - Mostrara en pantalla el numero primo mas cercano que debera ser mayor al numero n.
    Pre condicion:
        - N > 0
    Post condicion:
        - Mostrara en pantalla el numero primo mas cercano y que sea mayor al numero n.
*/
    public static void numeroPrimoCerano() {

    }

/*
EJERCICIO 3
    Entrada:
        - Numero entero A
        - Numero entero B
   Salida:
        - Retornara el maximo comun divisor del numero a y b y el valor sera de tipo integer.
   Pre Condicion:
        - A > 0
        - B > 0
   Post Condicion:
        - Retoranara un valor de tipo integer que sera el maximo comun divisor de A y B.
*/




}