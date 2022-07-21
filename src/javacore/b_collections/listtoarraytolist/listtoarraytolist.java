package javacore.b_collections.listtoarraytolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listtoarraytolist {
    public static void main(String[] args) {
        //List to Array
        System.out.println("List to Array");
        List<Integer> listNumeros = new ArrayList<>();
        listNumeros.add(1);
        listNumeros.add(2);
        listNumeros.add(3);

        Integer[]listToArrayNumeros = listNumeros.toArray(new Integer[0]);
        System.out.println(listToArrayNumeros.toString());

        System.out.println("----------------------------------------");

        System.out.println("Array to List");
        Integer[] arrayNumeros = new Integer[3];
        arrayNumeros[0] = 1;
        arrayNumeros[1] = 2;
        arrayNumeros[2] = 3;

        List<Integer>arrayToListNumeros = Arrays.asList(arrayNumeros);

        System.out.println(arrayToListNumeros);

        //Tome muito cuidado pois o arrayNumeros está linkado com o arrayToListNumeros
        //Lembre: Arrays.asList linka o array com o list, se vc fazer alterações irá alterar ambos
        //Como pode então criar uma copia do array que não esteja vinculado: ABAIXO
        List<Integer>arrayToListNumeros2 = new ArrayList<>(Arrays.asList(arrayNumeros)); //Melhor Forma

        System.out.println("Forma Vinculada:"+ arrayToListNumeros);
        System.out.println("Forma NAO Vinculada:"+ arrayToListNumeros2);

    }
}
