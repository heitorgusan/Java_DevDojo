package javacore.b_collections.list.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private String name;
    private Long id;
    private Double preco;

    public Manga(String name, Long id, Double preco)  {
        Objects.requireNonNull(id);
        Objects.requireNonNull(id);
        this.name = name;
        this.id = id;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return name.equals(manga.name) && id.equals(manga.id) && preco.equals(manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga o) {
        //negativo se o this < outroManga
        //se this == outroManga return 0
        //positivo se this >outroManga

        //Ordenando por ID
        /*
        if(this.id < o.getId()){
            return -1;
        }else if(this.id.equals(o.getId())){
            return 0;
        }else{
            return 1;
        }*/

        //Outra forma
        //return  this.id.compareTo(o.getId());

        //Returning por preço

        return Double.compare(this.preco, o.getPreco());
    }
}
