package com.inforcap.herenciaenclases;

public  abstract  class Bicicleta implements  ICalculable{

    protected int codigo;
    protected String marca;
    protected String modelo;
    protected double valorUSD;
    protected String transmision;
    protected String frenos;
    protected int stock;


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorUSD() {
        return this.valorUSD;
    }

    public void setValorUSD(double valorUSD) {
        this.valorUSD = valorUSD;
    }

    public String getTransmision() {
        return this.transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getFrenos() {
        return this.frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}

