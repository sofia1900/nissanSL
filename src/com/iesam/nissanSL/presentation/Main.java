package com.iesam.nissanSL.presentation;

import com.iesam.nissanSL.domain.models.*;
import com.iesam.nissanSL.domain.useCases.BuscarAccesorioUseCase;
import com.iesam.nissanSL.domain.useCases.GuardarAccesorioUseCase;
import com.iesam.nissanSL.domain.useCases.ModificarAccesorioUseCase;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        GuardarAccesorioUseCase guardarAccesorioUseCase = new GuardarAccesorioUseCase();
        ModificarAccesorioUseCase modificarAccesorioUseCase = new ModificarAccesorioUseCase();
        BuscarAccesorioUseCase buscarAccesorioUseCase = new BuscarAccesorioUseCase();

        Rueda ruedaA = new Rueda();
        ruedaA.setCodigo("1R");
        ruedaA.setMarca("Michelin");
        ruedaA.setModelo("Alpin 6");
        ruedaA.setDiametro("185");
        ruedaA.setUnidades(5);
        guardarAccesorioUseCase.execute(ruedaA);

        Rueda ruedaB = new Rueda();
        ruedaB.setCodigo("2R");
        ruedaB.setMarca("Firestone");
        ruedaB.setModelo("Winter Hawk");
        ruedaB.setDiametro("205");
        ruedaB.setUnidades(3);
        guardarAccesorioUseCase.execute(ruedaB);

        Motor motorA = new Motor();
        motorA.setCodigo("1M");
        motorA.setModelo("x6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("120cv");
        motorA.setUnidades(2);
        guardarAccesorioUseCase.execute(motorA);

        Motor motorB = new Motor();
        motorB.setCodigo("2M");
        motorB.setModelo("x9000");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160cv");
        motorB.setUnidades(2);
        guardarAccesorioUseCase.execute(motorB);

        CuadroMando cuadroMandoA = new CuadroMando();
        cuadroMandoA.setCodigo("1C");
        cuadroMandoA.setModelo("LM2000");
        cuadroMandoA.setUnidades(4);
        guardarAccesorioUseCase.execute(cuadroMandoA);

        CuadroMando cuadroMandoB = new CuadroMando();
        cuadroMandoB.setCodigo("2C");
        cuadroMandoB.setModelo("LM6000");
        cuadroMandoB.setUnidades(2);
        guardarAccesorioUseCase.execute(cuadroMandoB);


        //MENU:
        Scanner scanner = new Scanner(System.in);
        Integer opcion;

        do{
            System.out.println("MENU:");
            System.out.println("1. Crear los chasis de hoy");
            System.out.println("2. Imprimir stock accesorios");
            System.out.println("3. Imprimir chasis creados hoy");
            System.out.println("4. Actualizar stock");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Elige la opcion");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    Chasis chasisAAAA = new Chasis();
                    chasisAAAA.setCodigoBastidor("AAAA");
                    chasisAAAA.setMarca("Ford");
                    chasisAAAA.setModelo("Mondeo");
                    chasisAAAA.addAccesorio(ruedaA);
                    //caso de uso para modificar las unidades de ruedas que hay
                        ruedaA.setUnidades(ruedaA.getUnidades() - 1); //restamos una porque interpretamos que vienen en pack de 4
                        modificarAccesorioUseCase.execute(ruedaA);
                    chasisAAAA.addAccesorio(motorB);
                    //caso de uso para modificar las unidades de motores que hay
                        motorB.setUnidades(motorB.getUnidades() - 1);
                        modificarAccesorioUseCase.execute(motorB);
                    chasisAAAA.addAccesorio(cuadroMandoA);
                    //caso de uso para modificar las unidades de motores que hay
                        cuadroMandoA.setUnidades(cuadroMandoA.getUnidades() - 1);
                        modificarAccesorioUseCase.execute(cuadroMandoA);
                    //Caso de uso para guardar este chasis

                    Chasis chasisBBBB = new Chasis();
                    chasisBBBB.setCodigoBastidor("BBBB");
                    chasisBBBB.setMarca("Audi");
                    chasisBBBB.setModelo("A1");
                    chasisBBBB.addAccesorio(ruedaB);
                    //caso de uso para modificar las unidades de ruedas que hay
                        ruedaB.setUnidades(ruedaB.getUnidades() - 1); //restamos una porque interpretamos que vienen en pack de 4
                        modificarAccesorioUseCase.execute(ruedaB);
                    chasisBBBB.addAccesorio(motorB);
                    //caso de uso para modificar las unidades de motores que hay
                        motorB.setUnidades(motorB.getUnidades() - 1);
                        modificarAccesorioUseCase.execute(motorB);
                    chasisBBBB.addAccesorio(cuadroMandoB);
                    //caso de uso para modificar las unidades de motores que hay
                        cuadroMandoB.setUnidades(cuadroMandoB.getUnidades() - 1);
                        modificarAccesorioUseCase.execute(cuadroMandoB);
                    //Caso de uso para guardar este chasis

                    Chasis chasisCCCC = new Chasis();
                    chasisCCCC.setCodigoBastidor("CCCC");
                    chasisCCCC.setMarca("Land Rover");
                    chasisCCCC.setModelo("Defender");
                    chasisCCCC.addAccesorio(ruedaA);
                    //caso de uso para modificar las unidades de ruedas que hay
                        ruedaA.setUnidades(ruedaA.getUnidades() - 1); //restamos una porque interpretamos que vienen en pack de 4
                        modificarAccesorioUseCase.execute(ruedaA);
                    chasisCCCC.addAccesorio(motorA);
                    //caso de uso para modificar las unidades de motores que hay
                        motorA.setUnidades(motorA.getUnidades() - 1);
                        modificarAccesorioUseCase.execute(motorA);
                    chasisCCCC.addAccesorio(cuadroMandoA);
                    //caso de uso para modificar las unidades de motores que hay
                        cuadroMandoA.setUnidades(cuadroMandoA.getUnidades() - 1);
                        modificarAccesorioUseCase.execute(cuadroMandoA);
                    //Caso de uso para guardar este chasis

                    Chasis chasisDDDD = new Chasis();
                    chasisDDDD.setCodigoBastidor("DDDD");
                    chasisDDDD.setMarca("Citroen");
                    chasisDDDD.setModelo("Sara");
                    chasisDDDD.addAccesorio(ruedaA);
                    //caso de uso para modificar las unidades de ruedas que hay
                        ruedaA.setUnidades(ruedaA.getUnidades() - 1); //restamos una porque interpretamos que vienen en pack de 4
                        modificarAccesorioUseCase.execute(ruedaA);
                    chasisDDDD.addAccesorio(motorA);
                    //caso de uso para modificar las unidades de motores que hay
                        motorA.setUnidades(motorA.getUnidades() - 1);
                        modificarAccesorioUseCase.execute(motorA);
                    chasisDDDD.addAccesorio(cuadroMandoB);
                    //caso de uso para modificar las unidades de motores que hay
                        cuadroMandoB.setUnidades(cuadroMandoB.getUnidades() - 1);
                        modificarAccesorioUseCase.execute(cuadroMandoB);
                    //Caso de uso para guardar este chasis

                    break;
                case 2:
                    //Imprimir stock accesorios
                    break;
                case 3:
                    //Imprimir chasis creados
                    break;
                case 4:
                    //Actualizar stock accesorios
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        }while(opcion != 5);
    }

}
