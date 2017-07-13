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
    
   public int suma(){
       return num1 + num2;
   }
   
   public int resta(){
       return num1 - num2;
   }
}
