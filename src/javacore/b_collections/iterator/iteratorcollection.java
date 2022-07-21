package javacore.b_collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Uma classe para interagir com os itens da coleção de forma segura inclusive remover
public class iteratorcollection {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Heitor");
        listString.add("Guedes");
        listString.add("Var");
        listString.add("Reinaldo");
        listString.add("R.Ceni");
        listString.add("Luciano");
        listString.add("Calleri");
        listString.add("Miranda");
        listString.add("Luís Fabiano");

        Iterator<String> listStringIterator = listString.iterator();
        while(listStringIterator.hasNext()){
            //String iterator = listStringIterator.next();
            //if(iterator.equals("Heitor")){
            //    System.out.println(iterator);
            //}
            if(listStringIterator.next().equals("Luciano")){
                System.out.println(listStringIterator.next());
            }
        }

        //Existe uma forma moderna que foi adicionada no java 8 com programação funcional que é o remoteIf
        listString.removeIf(m -> m.equals("Heitor"));
        System.out.println(listString);
    }
}
