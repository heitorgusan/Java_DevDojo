package javacore.b_collections.map_hashmap_linkedhashmap;

import javacore.b_collections.classToUse.Consumidor;
import javacore.b_collections.classToUse.Quadrinho;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maptestconsumidor2 {

    public static void main(String[] args) {
        Quadrinho q1 = new Quadrinho("Superman","Super Heroes",20.0);
        Quadrinho q2 = new Quadrinho("HomemAranha","Super Heroes",20.0);
        Quadrinho q3 = new Quadrinho("Batmanprmim","Super Heroes",20.0);
        Consumidor c1 = new Consumidor("Heitor Guedes");
        Consumidor c2= new Consumidor("Felipe Guedes");
        Consumidor c3 = new Consumidor("Query Jr.");

        List<Quadrinho> listQuadrinhosc1 = List.of(q1,q2,q3);
        Map<Consumidor,List<Quadrinho>> consumidorQuadrinhoMap = new HashMap<>();
        consumidorQuadrinhoMap.put(c1,listQuadrinhosc1);

        for (Map.Entry<Consumidor,  List<Quadrinho>> entry: consumidorQuadrinhoMap.entrySet()){
            System.out.println(entry.getKey());
            //System.out.println(entry.getValue());
            for(Quadrinho quad: entry.getValue()){
                System.out.println(quad.getName());
            }
        }
    }
}
