package com.darvinsystems.metodosdebusqueda1.funciones;

public class Busqueda {

    // 🔍 BÚSQUEDA SECUENCIAL
    public static int busquedaSecuencial(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    // 🔍 BÚSQUEDA BINARIA (arreglo ORDENADO)
    public static int busquedaBinaria(int[] arr, int valor) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == valor) {
                return medio;
            } else if (arr[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
