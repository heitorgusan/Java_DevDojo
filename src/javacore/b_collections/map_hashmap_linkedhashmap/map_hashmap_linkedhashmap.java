package javacore.b_collections.map_hashmap_linkedhashmap;

import java.util.HashMap;
import java.util.Map;

//Trabalha com chave e valor
// sobreescreve o valor caso exista chaves iguais
public class map_hashmap_linkedhashmap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("tec","teclado");
        map.put("mou","mouse");
        map.put("pen","caneta");
        map.putIfAbsent("tes", "teste");//Só adiciona caso não exista a chave
        System.out.println(map);

        //Imprimir todas as chaves + valores
        System.out.println("----Chave+Valor----------");
        for(String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
        System.out.println("-----Valores-------");
        //apenas valores
        for (String value : map.values()){
            System.out.println(value);

        }

        //Outra forma ---------------
        System.out.println("---------Outra Forma---------");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.print(entry.getKey()+":"+ entry.getValue() + "\n");
        }
    }
}
