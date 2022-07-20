package javacore.b_collections.equals.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;


    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //Para escrever o .equals do object é preciso
    //Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //Simétrico : para x y diferentes de null , se x.equals(y) == true então y.equals(x) deve ser true
    //Transitividade: para x,y,z diferentes de null, se x.equals(z) == true e x.equals(y) ==true logo y.equals(z) ==true
    //Consistente: x.equal(x) sempre retorna true se x!= null, x.equals(null) deve retornar false
    @Override
    public boolean equals(Object obj){
        if(obj == null)return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass())return false;
        Smartphone smartphone = (Smartphone) obj;
        return this.serialNumber != null&& this.serialNumber.equals(smartphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
