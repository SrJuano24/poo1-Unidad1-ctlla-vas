/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

/**
 *
 * @author Mauricio Ortiz
 */
public class Principal {
    
    public static void main(String [] args){
        /*
        var progra = new Asignatura();
        progra.codigo=1;
        progra.costoHora=3.5;
        progra.horas=160;
        progra.nombre="Programación Orientada a Objetos";
        progra.nombreDocente="Mauricio Ortiz Ochoa";
        progra.vigente=true;
        
        System.out.println(progra.mostrarInformacion());
*/
        
        var auto1 = new Auto();
        auto1.placa="ABF9592";
        auto1.marca="Chevrolet";
        auto1.nombrePropietario="Juana Moreno";
        auto1.precio=15200;
        auto1.color="Amarillo";
        auto1.year=2018;
        
        System.out.println(auto1.mostrarInfo()+" el país de origen de la marca es "+auto1.getPaisMarca());
        System.out.println("La provincia de matrícula es: "+auto1.getProvincia());
        System.out.println("El número de continente es: "+auto1.getNumeroContinente());
        System.out.println("El auto tiene "+auto1.calcularEdad(2022)+" años");
        System.out.println("El IVA a pagar por el auto es: "+auto1.calcularIVA()+" USD");
        System.out.println("El costo a pagar por la matricula es: "+auto1.calcularCostoMatricula(2022)+" USD");
        System.out.println("El valor de la depreciacion es: "+auto1.calcularDepreciacion(2022)+" USD");
        System.out.println("El carro se puede asegurar: "+auto1.sePuedeAsegurar(2022));
        System.out.println("La placa es valida : "+auto1.esPlacaValida());
        System.out.println("");
        
        var auto2 = new Auto();
        auto2.placa="GDX0422";
        auto2.marca="Toyota";
        auto2.nombrePropietario="Mariana Ortiz";
        auto2.color="Gris";
        auto2.precio=25000;
        auto2.year=2019;
        
        System.out.println(auto2.mostrarInfo()+" el país de origen de la marca es "+auto2.getPaisMarca());
        System.out.println("La provincia de matrícula es: "+auto2.getProvincia());
        System.out.println("El número de continente es: "+auto2.getNumeroContinente());
        System.out.println("El auto tiene "+auto2.calcularEdad(2022)+" años");
        System.out.println("El IVA a pagar por el auto es: "+auto2.calcularIVA()+" USD");
        System.out.println("El costo a pagar por la matricula es: "+auto2.calcularCostoMatricula(2022)+" USD");
        System.out.println("El valor de la depreciacion es: "+auto2.calcularDepreciacion(2022)+" USD");
        System.out.println("El carro se puede asegurar: "+auto2.sePuedeAsegurar(2022));
        System.out.println("La placa es valida : "+auto2.esPlacaValida());
        System.out.println("");
        
        
        
        
        var auto3 = new Auto();
        auto3.placa="UBH0025";
        auto3.marca="Jetour";
        auto3.nombrePropietario="Juan Ortiz";
        auto3.color="Blanco";
        auto3.precio=9000;
        auto3.year=2004;
        
        System.out.println(auto3.mostrarInfo()+" el país de origen de la marca es "+auto3.getPaisMarca());
        System.out.println("La provincia de matrícula es: "+auto3.getProvincia());
        System.out.println("El número de continente es: "+auto3.getNumeroContinente());
        System.out.println("El auto tiene "+auto3.calcularEdad(2022)+" años");
        System.out.println("El IVA a pagar por el auto es: "+auto3.calcularIVA()+" USD");
        System.out.println("El costo a pagar por la matricula es: "+auto3.calcularCostoMatricula(2022)+" USD");
        System.out.println("El valor de la depreciacion es: "+auto3.calcularDepreciacion(2022)+" USD");
        System.out.println("El carro se puede asegurar: "+auto3.sePuedeAsegurar(2022));
        System.out.println("La placa es valida : "+auto3.esPlacaValida());
        System.out.println("");
        
        
        
        
        
    }
    
    
    
}
