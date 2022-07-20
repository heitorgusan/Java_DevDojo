package javacore.b_collections.binarySearch;

import javacore.b_collections.list.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class mangaByNomeComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class MangaBinarySearch {
    public static void main(String[] args) {
        Manga m1 = new Manga("DBZ", 1L, 13.0);
        Manga m2 = new Manga("ABZ", 3L, 14.0);
        Manga m3 = new Manga("BOKZ", 2L, 10.0);

        List<Manga> listMangas = new ArrayList<>();
        listMangas.add(m1);
        listMangas.add(m2);
        listMangas.add(m3);
        //Para usar o binary search primeiro é preciso ordenar.
        //listMangas.sort(new mangaByNomeComparator());
        Collections.sort(listMangas);
        System.out.println(listMangas);
        Manga mangaToSearch = new Manga("DBZ",1L,13.0);

        //System.out.println(Collections.binarySearch(listMangas, mangaToSearch,new mangaByNomeComparator()));
        System.out.println(Collections.binarySearch(listMangas, mangaToSearch));

    }
}
