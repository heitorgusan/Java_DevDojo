package javacore.b_collections.list.test;

import javacore.b_collections.list.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Se vc quiser comparar e outra forma que não seja a implementada no método vc pode usar o comparator
class MangaByNomeComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga m1, Manga m2 ){
        return m1.getName().compareTo(m2.getName());
    }
}
public class sortingList {

    public static void main(String[] args) {
        Manga m1 = new Manga("DBZ",1L,20.0);
        Manga m2 = new Manga("Babuka",2L,10.0);
        Manga m3 = new Manga("Lalaland",3L,13.0);

        List<Manga> listMangas = new ArrayList<>();
        listMangas.add(m1);
        listMangas.add(m2);
        listMangas.add(m3);

        System.out.println("Ordenando by preco");
        Collections.sort(listMangas);
        System.out.println(listMangas);

        System.out.println("Ordenando by name com comparator");
        listMangas.sort(new MangaByNomeComparator());
        System.out.println(listMangas);

    }
}
