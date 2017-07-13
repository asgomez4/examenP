/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.isi.examen.examenprac;

import java.util.Scanner;

/**
 *
 * @author Sofia Gomez
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0; 
        int num2 = 0;
        float num3 = 0;
        float num4 = 0;
	int seleccion;
        int operacion;
        int resultado = 0;
        float resul = 0;
        Operaciones obj;
	OperacionesFloat ope;
        Scanner entrada = new Scanner(System.in);
        /*Menu Principal*/
        System.out.println("Seleccione el tipo de dato:");
        System.out.println("1.- Enteros");
	System.out.println("2.- Flotantes");
        seleccion=entrada.nextInt();
	if(seleccion == 1){
		System.out.println("Ingrese numero 1: ");
        	num1=entrada.nextInt();
        	System.out.println("Ingrese numero 2: ");
        	num2=entrada.nextInt();
	}else{
		System.out.println("Ingrese numero 1: ");
        	num3=entrada.nextFloat();
        	System.out.println("Ingrese numero 2: ");
        	num4=entrada.nextFloat();
	}        
        System.out.println("Seleccione la operacion: ");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        operacion=entrada.nextInt();
	if(seleccion==1){
        	obj = new Operaciones(num1,num2);
        	if(operacion == 1){            
           		resultado = obj.suma();
        	}else if(operacion == 2){
	            	resultado = obj.resta();
        	}else if(operacion == 3){
        	    	resultado = obj.multiplicacion();
        	}else{
            		resultado = obj.division();
        	}
	}else{
        	ope = new OperacionesFloat(num1,num2);
        	if(operacion == 1){            
           		resul = ope.suma();
        	}else if(operacion == 2){
	            	resul = ope.resta();
        	}else if(operacion == 3){
        	    	resul = ope.multiplicacion();
        	}else{
            		resul = ope.division();
        	}
	}
        System.out.println("El resultado es:" + String.valueOf(resultado));
    }    
}
