/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

import java.util.Scanner;

/**
 *
 * @author Juano /<>
 */
public class Principal2 {

    public static void main(String[] args) {

        var a = 0;
        /* System.out.println("a= " + a);
        a++;
        System.out.println("a= " + a);
        a++;
        System.out.println("a= " + a);
        a++;
        System.out.println("a= " + a);
        a++;
        System.out.println("a= " + a);

        while (a < 100) {
            // primero muestro despues sumo    
            System.out.println("a= " + a);
            a++;

        }
         
        var numero = 0;
        do {
            var lectura = new Scanner(System.in);

            System.out.println("Ingresar un numero menores a 10");
            numero = lectura.nextInt();
            System.out.println("Numero=" + numero);

        } while (numero < 10);

        for (var i = 0; i < 10; i++) {

            System.out.println("Hola " + i);
        }
         */

        var lectura = new Scanner(System.in);

        System.out.println("Ingrese la dimension del arreglo");
        var dimension = lectura.nextInt();

        System.out.println("Ingrese los numeros del vector");
        var numeroVector = new int[dimension];

        for (int x = 0; x < dimension; x++) {

            numeroVector[x] = lectura.nextInt();
        }
        for (int y = 0; y < dimension; y++) {
            System.out.println(" Numero de vector de la posicion [" + y + "] es "
                    + numeroVector[y]);
        }

    }

    /*
        var numeroList = new int[5];
        numeroList[0] = 7;
        numeroList[1] = 9;
        numeroList[2] = 4;
        numeroList[3] = 11;
        numeroList[4] = 3;

        var numeroDecimalList = new double[5];
        //  var x= 0
        numeroDecimalList[0] = 8.5;
        numeroDecimalList[1] = 8.5;
        numeroDecimalList[2] = 8.5;
        numeroDecimalList[3] = 8.5;
        numeroDecimalList[4] = 8.5;
        
       System.out.println("Ingrese la dimension del arregl0");

        for (int x = 0; x < 5; x++) {
            System.out.println("Numero decimal de la posicion [" + x + "] es "
                    + numeroDecimalList[x]);

            
     */
}
}
