package javacore.b_collections.NavigableMapTreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
//Ordena pelo comparable da chave
public class NavigableMapTreeMapTest {
    public static void main(String[] args) {
        NavigableMap<String,String>listNames = new TreeMap<>();//Comparator e Comparable precisa ser equivalente ao equals
        listNames.put("A", "Letter A");
        listNames.put("B", "Letter B");
        listNames.put("C", "Letter C");


        for(Map.Entry<String,String>entry: listNames.entrySet()){
            System.out.println(entry.getValue() + " "+entry.getValue());
        }


        System.out.println(listNames.headMap("C"));//Menor que vem antes do C, O headMap está linkado
        System.out.println(listNames.headMap("C",true));//Menor ou igual que vem antes do C, O headMap está linkado
        System.out.println(listNames.headMap("C").remove("A"));//REMOVER
        System.out.println(listNames);

        //Tem outros métodos importantes, os mesmos do treeset, ceiling,floor....

    }
}
