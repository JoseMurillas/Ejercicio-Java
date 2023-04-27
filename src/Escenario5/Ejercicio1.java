package escenario5;

import java.util.Scanner;

public class Ejercicio1 {
    
    private int valor;
    private Ejercicio1 izquierda;
    private Ejercicio1 derecha;

    // Constructor que inicializa el valor del nodo del arbol
    public Ejercicio1(int valor) {
        this.valor = valor;
    }

    // Metodo que realiza la búsqueda de un valor en el arbol 
    // utilizando search para hacer la recursividad
    public boolean search(int valorBuscado) {
        if (valor == valorBuscado) {
            return true;
        } else if (valorBuscado < valor && izquierda != null) {
            return izquierda.search (valorBuscado);
        } else if (derecha != null) {
            return derecha.search(valorBuscado);
        } else {
            return false;
        }
    }
    
    public static void main(String[] args){
        // Creamos el arbol binario de busqueda
        Ejercicio1 raiz = new Ejercicio1(12);
        raiz.izquierda = new Ejercicio1(6);
        raiz.izquierda.izquierda = new Ejercicio1(4);
        raiz.izquierda.derecha = new Ejercicio1 (10);
        raiz.derecha = new Ejercicio1 (18);
        raiz.derecha.derecha = new Ejercicio1(24);

        // Pedimos al usuario que ingrese el valor a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscado = scanner.nextInt();
        
        // Buscamos el valor en el arbol
        boolean encontrado = raiz.search (valorBuscado);

        // Imprimimos el resultado de la búsqueda
        if (encontrado) {
            System.out.println(valorBuscado + " se encuentra en el arbol.");
        } else {
            System.out.println(valorBuscado + " no se encuentra en el arbol.");
        }
    }
}