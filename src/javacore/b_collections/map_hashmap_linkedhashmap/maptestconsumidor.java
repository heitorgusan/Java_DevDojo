package javacore.b_collections.map_hashmap_linkedhashmap;

import javacore.b_collections.classToUse.Consumidor;
import javacore.b_collections.classToUse.Quadrinho;

import java.util.HashMap;
import java.util.Map;

public class maptestconsumidor {

    public static void main(String[] args) {
        Quadrinho q1 = new Quadrinho("Superman","Super Heroes",20.0);
        Quadrinho q2 = new Quadrinho("Superman","Super Heroes",20.0);
        Quadrinho q3 = new Quadrinho("Superman","Super Heroes",20.0);
        Consumidor c1 = new Consumidor("Heitor Guedes");
        Consumidor c2= new Consumidor("Felipe Guedes");
        Consumidor c3 = new Consumidor("Query Jr.");

        Map<Consumidor,Quadrinho> consumidorQuadrinhoMap = new HashMap<>();
        consumidorQuadrinhoMap.put(c1,q1);
        consumidorQuadrinhoMap.put(c2,q2);
        consumidorQuadrinhoMap.put(c3,q3);

        for(Map.Entry<Consumidor,Quadrinho> entry: consumidorQuadrinhoMap.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
