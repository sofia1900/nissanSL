package com.iesam.nissanSL.presentation;

import com.iesam.nissanSL.domain.models.Chasis;
import com.iesam.nissanSL.domain.models.Motor;
import com.iesam.nissanSL.domain.models.Rueda;
import com.iesam.nissanSL.domain.models.CuadroMando;


public class Main {

    public static void main(String[] args) {

        Rueda ruedaA = new Rueda();
        ruedaA.setCodigo("1R");
        ruedaA.setMarca("Michelin");
        ruedaA.setModelo("Alpin 6");
        ruedaA.setDiametro("185");
        ruedaA.setUnidades(5);

        Rueda ruedaB = new Rueda();
        ruedaB.setCodigo("2R");
        ruedaB.setMarca("Firestone");
        ruedaB.setModelo("Winter Hawk");
        ruedaB.setDiametro("205");
        ruedaB.setUnidades(3);

        Motor motorA = new Motor();
        motorA.setCodigo("1M");
        motorA.setModelo("x6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("120cv");
        motorA.setUnidades(2);

        Motor motorB = new Motor();
        motorB.setCodigo("2M");
        motorB.setModelo("x9000");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160cv");
        motorB.setUnidades(2);

        CuadroMando cuadroMandoA = new CuadroMando();
        cuadroMandoA.setCodigo("1C");
        cuadroMandoA.setModelo("LM2000");
        cuadroMandoA.setUnidades(4);

        CuadroMando cuadroMandoB = new CuadroMando();
        cuadroMandoB.setCodigo("2C");
        cuadroMandoB.setModelo("LM6000");
        cuadroMandoB.setUnidades(2);

        Chasis chasisAAAA = new Chasis();
        chasisAAAA.setCodigoBastidor("AAAA");
        chasisAAAA.setMarca("Ford");
        chasisAAAA.setModelo("Mondeo");
        chasisAAAA.addAccesorio(ruedaA);
        //Modificar el número de unidades de ruedas A (-1 porque entendemos que en el stock son paquetes)
            // –> caso de uso
        chasisAAAA.addAccesorio(motorB);
        chasisAAAA.addAccesorio(cuadroMandoA);
        //Caso de uso para guardar este chasis

        Chasis chasisBBBB = new Chasis();
        chasisBBBB.setCodigoBastidor("BBBB");
        chasisBBBB.setMarca("Audi");
        chasisBBBB.setModelo("A1");
        chasisBBBB.addAccesorio(ruedaB);
        //Modificar el número de unidades de ruedas B (-1 porque entendemos que en el stock son paquetes)
            // –> caso de uso
        chasisBBBB.addAccesorio(motorB);
        chasisBBBB.addAccesorio(cuadroMandoB);
        //Caso de uso para guardar este chasis

        Chasis chasisCCCC = new Chasis();
        chasisCCCC.setCodigoBastidor("CCCC");
        chasisCCCC.setMarca("Land Rover");
        chasisCCCC.setModelo("Defender");
        chasisCCCC.addAccesorio(ruedaA);
        //Modificar el número de unidades de ruedas A (-1 porque entendemos que en el stock son paquetes)
            // –> caso de uso
        chasisCCCC.addAccesorio(cuadroMandoA);
        chasisCCCC.addAccesorio(motorA);
        //Caso de uso para guardar este chasis

        Chasis chasisDDDD = new Chasis();
        chasisDDDD.setCodigoBastidor("DDDD");
        chasisDDDD.setMarca("Citroen");
        chasisDDDD.setModelo("Sara");
        chasisDDDD.addAccesorio(ruedaA);
        //Modificar el número de unidades de ruedas A (-1 porque entendemos que en el stock son paquetes)
            // –> caso de uso
        chasisDDDD.addAccesorio(motorA);
        chasisDDDD.addAccesorio(cuadroMandoB);
        //Caso de uso para guardar este chasis


    }
}
