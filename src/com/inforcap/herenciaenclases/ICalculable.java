package com.inforcap.herenciaenclases;

public interface ICalculable {

    double PORCENTAJE_IVA  = 0.19;
    double DESCUENTO_MTB  = 0.15;
    double DESCUENTO_GRAVEL  = 0.25;
    double VALOR_DOLAR  = 725;

    public double  valorBicicleta();
    public double  valorTotalBicicletas();
    public  String informacion();



}
