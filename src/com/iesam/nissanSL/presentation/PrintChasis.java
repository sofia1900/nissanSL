package com.iesam.nissanSL.presentation;

import com.iesam.nissanSL.domain.models.Chasis;

public class PrintChasis {

    public static void printChasis(Chasis chasis){

        System.out.println("Este montaje tiene el chasis"+chasis.getCodigoBastidor());
        System.out.println("LLeva montadas las ruedas "+chasis.getAccesorios().get(0));
        System.out.println("LLeva el motor "+chasis.getAccesorios().get(1));
        System.out.println("LLeva el cuadro de mando "+chasis.getAccesorios().get(2));



    }

}
