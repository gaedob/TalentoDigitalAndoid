package com.inforcap.desafiotiendaindianjeans;

import java.util.ArrayList;

public class ProductoServicio {

    ArrayList<Producto> listaProductos;

    public ProductoServicio() {
        listaProductos = new ArrayList<>();

    }

    public ArrayList<Producto> getListaProductos() {
        return this.listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;

    }

    public void  listarProductos() {

        int indexV = 1;

        for (Producto producto : listaProductos) {


            System.out.println("Articulo " + indexV + ": " + producto.toString());
            
            indexV++;

        }
       
    }

    public void agregarProductos(Producto producto) {

        this.listaProductos.add(producto);


 
    }

}
