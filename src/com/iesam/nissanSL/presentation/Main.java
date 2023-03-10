package com.iesam.nissanSL.presentation;

import com.iesam.nissanSL.domain.models.*;
import com.iesam.nissanSL.domain.useCases.BuscarAccesorioUseCase;
import com.iesam.nissanSL.domain.useCases.GuardarAccesorioUseCase;
import com.iesam.nissanSL.domain.useCases.GuardarChasisUseCase;
import com.iesam.nissanSL.domain.useCases.ModificarAccesorioUseCase;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        GuardarAccesorioUseCase guardarAccesorioUseCase = new GuardarAccesorioUseCase();
        ModificarAccesorioUseCase modificarAccesorioUseCase = new ModificarAccesorioUseCase();
        BuscarAccesorioUseCase buscarAccesorioUseCase = new BuscarAccesorioUseCase();
        GuardarChasisUseCase guardarChasisUseCase = new GuardarChasisUseCase();

        /*
         Todos los datos han sido introducidos directamente para que a la hora de comprobar que funciona
         el codigo no tener que meter todos los datos por teclado y sea más rápido. Esto se modificaría
         utilizando la clase Scanner.
         */

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
        Integer opcionStock;

        do{
            System.out.println("");
            System.out.println("MENU:");
            System.out.println("1. Crear los chasis de hoy");
            System.out.println("2. Imprimir stock accesorios");
            System.out.println("3. Imprimir chasis creados hoy");
            System.out.println("4. Actualizar stock");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Elige la opcion");
            opcion = scanner.nextInt();
            System.out.println("");
            switch (opcion){
                case 1:
                    /*
                    Esta opcion se podría modificar para que el usuario introdujera los cuatro chasis que
                    monta en ese día por teclado. Se utilizaría la clase Scanner y se repetiría en un bucle
                    for porque siempre son 4 los chasis que se montan o se haría una espcie de menú, como
                    en la opcion 4 del menu, es decir, se preguntaría al usuario constantemente si quiere
                    introducir un nuevo chasis.
                     */
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
                    guardarChasisUseCase.execute(chasisAAAA);

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
                    guardarChasisUseCase.execute(chasisBBBB);

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
                    guardarChasisUseCase.execute(chasisCCCC);

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
                    guardarChasisUseCase.execute(chasisDDDD);

                    break;
                case 2:
                    PrintStock printStock = new PrintStock();
                    printStock.printStock();
                    break;
                case 3:
                    //Esta función se podria modificar para que el codigo del chasis se introduzca por teclado
                    PrintChasis printChasis = new PrintChasis();
                    printChasis.printChasis("AAAA");
                    printChasis.printChasis("BBBB");
                    printChasis.printChasis("CCCC");
                    printChasis.printChasis("DDDD");

                    break;
                case 4:
                    String codAccesorio;
                    Integer unidades;
                    Accesorio accesorioElegido;
                    do{
                        System.out.println("Introduce el indice del accesorio");
                        codAccesorio = scanner.next();
                            //Para completarlo más, habría que comprobar que existe un accesorio con ese codigo.
                        System.out.println("Introduce el numero de unidades que desea añadir");
                        unidades = scanner.nextInt();

                        //caso de uso para coger el accesorio elegido
                         accesorioElegido = buscarAccesorioUseCase.execute(codAccesorio);
                        //caso de uso para modificar las unidades
                        accesorioElegido.setUnidades(accesorioElegido.getUnidades() + unidades);
                        modificarAccesorioUseCase.execute(accesorioElegido);

                        System.out.println("Si quiere añadir otro accesorio ponga un 1, sino ponga otro numero");
                        opcionStock = scanner.nextInt();
                    }while(opcionStock == 1);
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
