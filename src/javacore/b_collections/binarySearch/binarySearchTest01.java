package javacore.b_collections.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class binarySearchTest01 {

    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(10);
        listNumbers.add(9);
        listNumbers.add(11110);
        listNumbers.add(12);
        listNumbers.add(0);
        listNumbers.add(20);
        listNumbers.add(22);
        listNumbers.add(210);


        //Caso não exista o valor retorna: -(ponto de inserção)-1
        //Sempre ordene primeiro para usar o binarySearch
        Collections.sort(listNumbers);
        System.out.println(Collections.binarySearch(listNumbers, 20));


    }
}
