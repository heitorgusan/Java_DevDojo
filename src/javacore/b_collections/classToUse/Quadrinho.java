package javacore.b_collections.classToUse;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Quadrinho {
    private String name;
    private String category;
    private double valor;


    public Quadrinho(String name, String category, double valor) {
        this.name = name;
        this.category = category;
        this.valor = valor;
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrinho quadrinho = (Quadrinho) o;
        return name.equals(quadrinho.name) && category.equals(quadrinho.category) && id.equals(quadrinho.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, id);
    }

    @Override
    public String toString() {
        return "Quadrinho{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", valor=" + valor +
                ", id=" + id +
                '}';
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
