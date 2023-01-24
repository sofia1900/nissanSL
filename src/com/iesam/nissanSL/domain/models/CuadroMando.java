package com.iesam.nissanSL.domain.models;

public class CuadroMando implements Accesorios{

    private String codigo;

    private String modelo;

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
}
