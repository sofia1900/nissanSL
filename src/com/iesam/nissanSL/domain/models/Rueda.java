package com.iesam.nissanSL.domain.models;

import com.sun.jdi.IntegerType;

public class Rueda implements Accesorio{

    private String codigo;

    private String marca;

    private String modelo;

    private String diametro;

    private Integer unidades;

    //Funciones

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo=codigo;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo=modelo;
    }

    @Override
    public Integer getUnidades() {
        return unidades;
    }

    @Override
    public void setUnidades(Integer unidades) {
        this.unidades=unidades;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }
}
