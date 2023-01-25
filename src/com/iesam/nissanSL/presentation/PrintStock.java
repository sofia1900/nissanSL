package com.iesam.nissanSL.presentation;

import com.iesam.nissanSL.domain.useCases.BuscarAccesorioUseCase;

public class PrintStock {
    public static void printStock (){
        BuscarAccesorioUseCase buscarAccUseCase = new BuscarAccesorioUseCase();

        System.out.println("El numero de ruedas A que hay es " + buscarAccUseCase.execute("1R").getUnidades());
        System.out.println("El numero de ruedas B que hay es " + buscarAccUseCase.execute("2R").getUnidades());
        System.out.println("El numero de motores A que hay es " + buscarAccUseCase.execute("1M").getUnidades());
        System.out.println("El numero de motores B que hay es " + buscarAccUseCase.execute("2M").getUnidades());
        System.out.println("El numero de cuadros de mando A que hay es " + buscarAccUseCase.execute("1C").getUnidades());
        System.out.println("El numero de cuadros de mando B que hay es " + buscarAccUseCase.execute("2C").getUnidades());
    }
}
