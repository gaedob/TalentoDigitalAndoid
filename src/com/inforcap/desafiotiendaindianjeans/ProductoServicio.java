package com.inforcap.desafiotiendaindianjeans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public void listarProductos() {

        //int indexV = 1;

        for (Producto producto : listaProductos) {

            presentarDatosProductoPantalla(producto);

            // System.out.println("Articulo " + indexV + ": " + producto.toString());

            // indexV++;

        }

    }

    public void agregarProductos(Producto producto) {

        this.listaProductos.add(producto);

    }

    public Producto buscarProductoCodigo(String codigo) {

        List<Producto> productosFiltrado = listaProductos.stream()
                .filter(producto -> (producto.getCodigo() == null ? codigo == null : producto.getCodigo().equals(codigo)))
                .collect(Collectors.toList());

        if (!productosFiltrado.isEmpty()) {
            return productosFiltrado.get(0);
        }
        return null;

    }
    public  void presentarDatosProductoPantalla(Producto producto){

        System.out.println(" ---  Producto ----");
        System.out.println(" ------------------");

        System.out.println("[1] -  Articulo :" + producto.getArticulo());
        System.out.println("[2] -  Precio :" + producto.getPrecio());
        System.out.println("[3] -  Descripcion :" + producto.getDescripcion());
        System.out.println("[4] -  Código :" + producto.getCodigo());
        System.out.println("[5] -  Talla :" + producto.getTalla());
        System.out.println("[6] -  Marca :" + producto.getMarca());
        System.out.println("[7] -  Color :" + producto.getColo());
        System.out.println("");
    }

    public void cambiaPrimerProductoencontrado(Producto productoAntiguo, Producto productoNuevo) {

        int indiceProductoOld = listaProductos.indexOf(productoAntiguo);
        listaProductos.set(indiceProductoOld, productoNuevo);

        // int indice = -1;
        // for (int i = 0; i < listaProductos.size(); i++) {
        //     if (listaProductos.get(i).equals(productoAntiguo)) {
        //         indice = i;
        //         break;
        //     }
        // }

        // if (indice != -1) {
        //     listaProductos.set(indiceProductoOld, productoNuevo);
        // }

    }

}
