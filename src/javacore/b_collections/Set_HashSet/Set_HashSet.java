package javacore.b_collections.Set_HashSet;

import javacore.b_collections.list.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//SET: NÃO PERMITE DUPLICADOS
// HashSet: Coleção que ordena  por hashcode -> sua ordem é organizada pelo HashCode
//O HashCode é um valor gerado que o Java usa para indexar as coleções.
//LinkedHashSet -> Mantém ordem de inserção
public class Set_HashSet {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        //Set<Manga> mangas = new LinkedHashSet<>();  Mantém a ordem de inserção

        //O Set não é indexado não existe mangas[0]

        mangas.add(new Manga("DBZ",1L,20.9));
        mangas.add(new Manga("DBZ2",2L,10.9));
        mangas.add(new Manga("DBZ3",3L,22.9));
        mangas.add(new Manga("DBZ",1L,20.9));//Não entra na collection pois é duplicado

        for(Manga m :   mangas){

            System.out.println(m);
        }
    }
}
