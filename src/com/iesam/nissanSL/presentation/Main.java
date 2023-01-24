package com.iesam.nissanSL.presentation;

import com.iesam.nissanSL.domain.models.Motor;
import com.iesam.nissanSL.domain.models.Rueda;
import com.iesam.nissanSL.domain.models.CuadroMando;


public class Main {

    public static void main(String[] args) {

        Rueda ruedaA = new Rueda();
        ruedaA.setCodigo("1");
        ruedaA.setMarca("Michelin");
        ruedaA.setModelo("Alpin 6");
        ruedaA.setDiametro("185");
        ruedaA.setUnidades(5);

        Rueda ruedaB = new Rueda();
        ruedaB.setCodigo("2");
        ruedaB.setMarca("Firestone");
        ruedaB.setModelo("Winter Hawk");
        ruedaB.setDiametro("205");
        ruedaB.setUnidades(3);



        Motor motorA = new Motor();
        motorA.setCodigo("1");
        motorA.setModelo("x6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("120cv");
        motorA.setUnidades(2);

        Motor motorB = new Motor();
        motorB.setCodigo("2");
        motorB.setModelo("x9000");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160cv");
        motorB.setUnidades(2);



        CuadroMando cuadroMandoA = new CuadroMando();
        cuadroMandoA.setCodigo("1");
        cuadroMandoA.setModelo("LM2000");
        cuadroMandoA.setUnidades(4);

        CuadroMando cuadroMandoB = new CuadroMando();
        cuadroMandoB.setCodigo("2");
        cuadroMandoB.setModelo("LM6000");
        cuadroMandoB.setUnidades(2);

    }
}
