package com.inforcap.desafiotiendaindianjeans;

import java.util.ArrayList;
import java.util.List;

public class ListaObjetos<T> {

    private List<T> lista;

    public ListaObjetos() {
        this.lista = new ArrayList<>();
    }

    public void add(T elemento) {
        lista.add(elemento);
    }

    public List<T> getLista() {
        return lista;
    }

}
