package Escenario3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**Implemente una función en lenguaje java que, dado un arreglo de enteros, A, calcule y
         retorne el número que más veces se repite en A. En caso de empate, la función puede
         retornar cualquiera de los números más frecuentes.*/
        ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario Ingrese numeros enteros, y al finalizar ingresar 000");

        // Recopilar números enteros ingresados por el usuario
        while (true) {
            int terminar = sc.nextInt();
            if (terminar == 000) {
                break;
            }
            numerosEnteros.add(terminar);
        }
        masRepetido(numerosEnteros);
    }

    private static void masRepetido(ArrayList<Integer> numerosEnteros) {
        // Encontrar el número que se repite más y cuántas veces aparece
        Map<Integer, Integer> repite = new HashMap<>();
        int masFrecuencia = 0;
        int masFrecuenciaNumeros = 0;

        for (int i = 0; i < numerosEnteros.size(); i++) {
            int num = numerosEnteros.get(i);
            int frequency = repite.getOrDefault(num, 0) + 1;
            repite.put(num, frequency);
            if (frequency > masFrecuencia) {
                masFrecuencia = frequency;
                masFrecuenciaNumeros = num;
            }
        }

        // Imprimir el número que se repite más y cuántas veces aparece
        System.out.println("El numero que se repite mas es: " + masFrecuenciaNumeros + ", se repite " + masFrecuencia + " veces.");
    }
}
