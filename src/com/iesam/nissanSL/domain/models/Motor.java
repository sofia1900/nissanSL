package com.iesam.nissanSL.domain.models;

public class Motor implements Accesorio{

    private String codigo;

    private String modelo;

    private String cilindrada;

    private String caballos;

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

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCaballos() {
        return caballos;
    }

    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }
}
