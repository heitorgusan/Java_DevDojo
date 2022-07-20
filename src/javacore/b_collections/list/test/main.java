package javacore.b_collections.list.test;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Heitor");
        nameList.add("Ana Caroline de Abreu");
        nameList.add("Ferdinand Henry");

        for(int i = 0 ; i < nameList.size(); i ++){
            System.out.println(nameList.get(i));
        }

    }
}
