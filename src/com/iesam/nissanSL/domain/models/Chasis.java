package com.iesam.nissanSL.domain.models;
import java.util.ArrayList;
import java.util.List;

public class Chasis {
    private String codigoBastidor;
    private String marca;
    private String modelo;
    private List<Accesorio> accesorios = new ArrayList<>();


    public String getCodigoBastidor() {
        return codigoBastidor;
    }

    public void setCodigoBastidor(String codigoBastidor) {
        this.codigoBastidor = codigoBastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Accesorio> getAccesorios() {
        return accesorios;
    }

    public void addAccesorio (Accesorio accesorio) {
        this.accesorios.add(accesorio);
    }
}
