/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Auto {

    String placa;
    String marca;
    String nombrePropietario;
    int year;
    String color;
    double precio;
    int cilindrajeMotor;

    public String mostrarInfo() {
        var retorno = "El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + " y el propietario es: " + this.nombrePropietario
                + " . El auto cuesta "+this.precio+ " USD y es modelo: " + this.year;

        return retorno;
    }

    public String getProvincia() {
        var retorno = "";
        var primeraLetra="";
        primeraLetra=this.placa.substring(0,1);
        switch(primeraLetra){
            case "A":
                retorno="Azuay";
                break;
           case "P":
                retorno="Pichincha";
                break;
           case "G":
                retorno="Guayas";
                break;
            case "U":
                retorno="Cañar";
                break;
            default:
                retorno="Provincia no definida";
        }
        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japón";
            } else {
                retorno = "No definido";
            }
        }
        return retorno;
    }

    public int getNumeroContinente() {
        //1: Africa 2:America 3:Asia 4:Europa 5:Oceania
        var retorno = 0;
        var marcaPais=this.getPaisMarca();
        switch(marcaPais){
            case "EE.UU":
                retorno=2;
                break;
            case "Japón":
                retorno=3;
                break;
            default:
                retorno=0;
        }
        return retorno;
    }
    
    public double calcularIVA(){
        var retorno=0.0d;
        retorno = this.precio*0.12;
        
        return retorno;
    }
    
    public int calcularEdad(int yearActual){
        var retorno=0;    
        retorno=yearActual- this.year;
        return retorno;
    }
    
    //10% por cada año de uso
    //La depreciacion no puede exceder el precio
    // Despues de 10 años el costo de la depreciacion es el mimso del auto 
    public double calcularDepreciacion(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
        retorno=edad*0.1*this.precio;
        return retorno;
    }
    
    /*
    Edad 0-5: 10% del precio
    Edad 5-10: 8% del precio
    Edad 10-15: 7% del precio
    Edad >15: 6% del precio
    <>
    */
    
    public double calcularCostoMatricula(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
        if (edad>5){retorno=this.precio*0.1;}
        else{if(edad>5 && edad<11){
            retorno=this.precio*0.8;}
        else{if(edad>10 && edad<15){
            retorno=this.precio*0.7;}
        else{if(edad>16){
            retorno=this.precio*0.6;}
    
        }}}
        return retorno;
    }
    
      /*
    Edad 0-5 y precio menos de 10000 SI
    Edad 10-15 y precio menos de 10000 a 20000 SI
    Edad >15 y precio menos de 20000 a 30000 SI
    Edad >15 NO
     */
    public boolean sePuedeAsegurar(int yearActual){
        var retorno=false;
        var edad=this.calcularEdad(yearActual);
        if(edad>5 && this.precio<10000){retorno=true;
        }else{if(edad>5 && edad<11 && this.precio<=10000 && this.precio<20000)
        {retorno=true;
        }else{if(edad>10 && edad<16 && this.precio<20000 && this.precio<30000)
        {retorno=true;
        }else{if(edad>16)
        {retorno=false;
            
        }}}}   
        
        return retorno;
    }
    public boolean esClasico(int yearActual, int yearClasico){
        var retorno=false;
        
        return retorno;
    }
    
// Taza solidaria se calcula con elñ año actual y el limite de precio
// Mas a 20 la taza es0
// De 0 a 5 años y el cilindraje menos de 1500 la tasa es del 15% del costo
// De 0 a 5 años y el cilindraje mas de 1500 y menos de 2000 la tasa es del 15% del costo
   
// De 0 a 5 años y el cilindraje menos de 1500 la tasa es del 15% del costo
// auto 7 años 16000,18000
    public double calculoTasaSolidaria(int yearActual, double limitePrecio){
        var retorno=0.0d;
        
        
        return retorno;
    }
    
public boolean esPlacaValida(){
        var retorno=false;
        var longitud =this.placa.length();
        if(longitud==7){
            var caracter1=this.placa.charAt(0);
            var caracter2=this.placa.charAt(1);
            var caracter3=this.placa.charAt(2);
            var caracter4=this.placa.charAt(3);
            var caracter5=this.placa.charAt(4);
            var caracter6=this.placa.charAt(5);
            var caracter7=this.placa.charAt(6);
            
          if(Character.isLetter(caracter1)&& Character.isLetter(caracter2)
             && Character.isLetter(caracter3)&&Character.isDigit(caracter4)
             &&Character.isDigit(caracter5)&&Character.isDigit(caracter6)
                  &&Character.isDigit(caracter7))
             {
              retorno = true;
          }
                  
              
 
        }
        
        
        
        
        
        return retorno;
    }
}
