package com.inforcap.desafiotiendaindianjeans;

public class Producto {

    String articulo;
    String precio;
    String descripcion;
    String codigo;
    String talla;
    String marca;
    String colo;

    public Producto() {
    }

    public String getArticulo() {
        return this.articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getPrecio() {
        return this.precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColo() {
        return this.colo;
    }

    public void setColo(String colo) {
        this.colo = colo;
    }

    @Override
    public String toString() {
        return "{\n" +
            "  articulo='" + getArticulo() + "'\n" + 
            "  precio='" + getPrecio() +  "'\n" + 
            "  descripcion='" + getDescripcion() +  "'\n" + 
            "  codigo='" + getCodigo() + "'\n" + 
            "  talla='" + getTalla() +  "'\n" + 
            "  marca='" + getMarca() +  "'\n" + 
            "  colo='" + getColo() + "'\n" + 
            "}";
    }

    

}
