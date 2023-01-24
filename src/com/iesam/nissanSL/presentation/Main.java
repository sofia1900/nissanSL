package com.iesam.nissanSL.presentation;

import com.iesam.nissanSL.domain.models.Motor;
import com.iesam.nissanSL.domain.models.Ruedas;
import com.iesam.nissanSL.domain.models.CuadroMando;


public class Main {

    public static void main(String[] args) {

        Ruedas ruedasA = new Ruedas();
        ruedasA.setCodigo("1");
        ruedasA.setMarca("Michelin");
        ruedasA.setModelo("Alpin 6");
        ruedasA.setDiametro("185");
        ruedasA.setUnidades(5);

        Ruedas ruedasB = new Ruedas();
        ruedasB.setCodigo("2");
        ruedasB.setMarca("Firestone");
        ruedasB.setModelo("Winter Hawk");
        ruedasB.setDiametro("205");
        ruedasB.setUnidades(3);



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
