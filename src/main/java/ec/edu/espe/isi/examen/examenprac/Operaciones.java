/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.isi.examen.examenprac;

/**
 *
 * @author sony
 */
public class Operaciones {    
    private int num1;
    private int num2;

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    /**
     * Funcion que realiza la suma de dos números
     * @return devuelve el resultado de la suma
     */
   public int suma(){
       return num1 + num2;
   }
   /**
    * Funcion que realiza la resta de dos números
    * @return devuelve el resultado de la resta
    */
   public int resta(){
       return num1 - num2;
   }
   /**
    * metodo que devuelve la multiplicacion entre dos numeros
    * @return multiplicacion
    */
   public int multiplicacion(){
       return num1 * num2;
   }
   
   /**
    * metodo que devuelve la division entre dos numeros
    * @return division entre numeros
    */
   public int division(){
       if (num2<0){
         System.out.println("Ingrese denominador positivo");
       }
       return num1 / num2;      
   }
}
