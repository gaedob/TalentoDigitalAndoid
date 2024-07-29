package com.inforcap.herenciaenclases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bodega {

    private ArrayList<Bicicleta> bicicletas;

    public Bodega() {
        bicicletas = new ArrayList<>();
    }

    public int registrarBicicleta(Bicicleta nueva) {
        bicicletas.add(nueva);
        return nueva.codigo;
    }

    public boolean venderBicicleta(int codigo) {

        return false;

    }

    public Bicicleta buscarPorCodigo(int codigo) {

        List<Bicicleta> biciletaFiltrada= bicicletas.stream()
        .filter(bicicletas -> bicicletas.getCodigo() == codigo)
        .collect(Collectors.toList());
        
    

        return biciletaFiltrada.get(0);

    }

    public ArrayList<Gravel> listarBicicletaGravel() {

        // ArrayList<Gravel> gravels = new ArrayList<>();

        // for (Bicicleta item : bicicletas) {
        //     if (item instanceof Gravel) {
        //         gravels.add((Gravel) item);
        //     }
        // }

        List<Gravel> gravels = bicicletas.stream()
                .filter(Gravel.class::isInstance)
                .map(Gravel.class::cast)
                .collect(Collectors.toList());

        return (ArrayList<Gravel>) gravels;

    }

    public double totalPosiblesganancias() {

        double ganacia = 0;

        for (Bicicleta item : bicicletas) {
            ganacia = ganacia + item.valorUSD;
        }
        return ganacia;

    }

}
