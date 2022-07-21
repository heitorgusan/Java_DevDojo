package javacore.b_collections.NavigableSetTreeSet;

import javacore.b_collections.classToUse.Animal;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
// O TreeSet ordena pelo comparator ou comparable ele não se baseia no .equals #ATENÇÃO

class comparatorByName implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class testeNavigableSet {


    public static void main(String[] args) {
        //NavigableSet<Animal> setNavigable = new TreeSet<>(); //TreeSet precisa ter implementado o comparable, nesse caso ordena por peso
        NavigableSet<Animal> setNavigable = new TreeSet<>(new comparatorByName()); //Por nome

        Animal an1 = new Animal("Cachorro",12);
        Animal an2 = new Animal("Cavalo",600);
        Animal an3 = new Animal("Camelo",200);
        Animal an4 = new Animal("Abelha",0.1);
        setNavigable.add(an1);
        setNavigable.add(an2);
        setNavigable.add(an3);
        setNavigable.add(an4);
        for(Animal an : setNavigable){
            System.out.println(an);
        }
        System.out.println("-------------- por ordem descendente");
        for(Animal an : setNavigable.descendingSet()){
            System.out.println(an);
        }

        //Métodos úteis para comparação

        //lower < Imediatamente menor
        //floor <= mesmo elemento ou imediato menor
        //higher > O imediatamente maior
        //ceiling >= O imediatamente maior ou igual

        Animal cat = new Animal("Boalem",3);
        System.out.println("------------------------");
        System.out.println("Lower: "+setNavigable.lower(cat));
        System.out.println("Floor: "+setNavigable.floor(cat));
        System.out.println("Higher: "+setNavigable.higher(cat));
        System.out.println("Ceiling: "+setNavigable.ceiling(cat));
        //PollFirst -> Retorna e Remove o primeiro elemento da lista
        //PollLast -> Retorna e Remove o último elemento da lista

        System.out.println(setNavigable.size());
        System.out.println(setNavigable.pollFirst());
        System.out.println(setNavigable.size());
        System.out.println(setNavigable.pollLast());
        System.out.println("Tamanho final: "+setNavigable.size());
    }
}
