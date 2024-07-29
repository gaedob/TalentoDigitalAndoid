package com.inforcap.herenciaenclases;

public class MountainBike extends  Bicicleta{
    private  String suspension;
    private String tamano;
    private double aro;

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getTamano() {
        return this.tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public double getAro() {
        return this.aro;
    }

    public void setAro(double aro) {
        this.aro = aro;
    }

    @Override
    public String informacion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double valorBicicleta() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double valorTotalBicicletas() {
        // TODO Auto-generated method stub
        return 0;
    }
    

}
