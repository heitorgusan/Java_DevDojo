package javacore.b_collections.equals.test;

import javacore.b_collections.equals.domain.Smartphone;

public class test01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1AB","Apple");
        Smartphone s2 = new Smartphone("1AB","Apple");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2)); // Só é igual pq reescrevi o .equals();


    }
}
