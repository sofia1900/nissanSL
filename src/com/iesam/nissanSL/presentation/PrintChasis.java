package com.iesam.nissanSL.presentation;

import com.iesam.nissanSL.domain.models.Chasis;
import com.iesam.nissanSL.domain.useCases.BuscarChasisUseCase;

public class PrintChasis {

    public void printChasis(String codigoBastidor){
        BuscarChasisUseCase buscarChasisUseCase = new BuscarChasisUseCase();

        System.out.println("");
        System.out.println("Este montaje tiene el codigoBastidor "+buscarChasisUseCase.execute(codigoBastidor).getCodigoBastidor());
        System.out.println("LLeva montadas las ruedas "+buscarChasisUseCase.execute(codigoBastidor).getAccesorios().get(0).getCodigo());
        System.out.println("LLeva el motor "+buscarChasisUseCase.execute(codigoBastidor).getAccesorios().get(1).getCodigo());
        System.out.println("LLeva el cuadro de mando "+buscarChasisUseCase.execute(codigoBastidor).getAccesorios().get(2).getCodigo());
        System.out.println("");



    }

}
