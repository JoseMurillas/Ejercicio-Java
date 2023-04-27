package Escenario3;
import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Definimos un arreglo de enteros con los siguientes números:
        int[] arrayInts = {5, 2, 3, 1, 8, 6};

        //Llamamos el método que contiene el algoritmo de ordenamiento
        insertionSort(arrayInts);

        //Imprimimos los elementos del arreglo con su nuevo orden
        Arrays.stream(arrayInts).forEach(valor -> System.out.print(valor + " "));

    }

    private static void insertionSort(int[] arrayInts) {

        //Utilizamos un ciclo for para recorrer los elementos del arreglo.
        for (int i = 1; i < arrayInts.length; i++) {

            //Obtenemos el valor actual que esta recorriendo el ciclo y lo almacenamos en una variable auxiliar
            int temporal = arrayInts[i];

            /*Se declara una variable llamada left que cumple la función de examinar todos los elementos
            que se encuentren a la izquierda del valor que esta leyendo el ciclo. */
            int left = i - 1;

            /*Se declara un ciclo while cuya función es intercambiar todos los valores mayores al valor actual
            que está recorriendo el ciclo hacia la derecha mientras que la variable left sea mayor o igual a cero y
            el elemento de la izquierda sea mayor al elemento actual */
            while (left >= 0 && arrayInts[left] > temporal) {
                arrayInts[left + 1] = arrayInts[left];
                left--;
            }
           /* Por último insertamos el valor que esta en nuestra variable auxiliar en su espacio correspondiente
           después de mover los elementos mayores a este hacia la derecha y así sucesivamente con cada iteración */
            arrayInts[left + 1] = temporal;
        }
    }
}


