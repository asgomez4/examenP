/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.isi.examen.examenprac;

/**
 * Clase que contiene las operaciones con numeros flotantes.
 *
 * @author Sofia Gomez
 */
public class OperacionesFloat {

    private float num1;
    private float num2;

    /**
     * Constructor de la clase
     *
     * @param num1 recibe el primer numero flotante
     * @param num2 Recibe el segundo nuemro flotante
     */
    public OperacionesFloat(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Funcion que realiza la suma con numeros flotantes
     *
     * @return devuelve el resultado de la operacion
     */
    public float suma() {
        return num1 + num2;
    }

    /**
     * Funcion que realiza la resta con numeros flotantes
     *
     * @return devuelve el resultado de la operacion
     */
    public float resta() {
        return num1 - num2;
    }

    /**
     * Funcion que realiza la multiplicacion con numeros flotantes
     *
     * @return deculeve el resutlado de la operacion
     */
    public float multiplicacion() {
        return num1 * num2;
    }

    /**
     * Funcion que realiza la division con numeros flotantes
     *
     * @return devuelve el resutlado de la operacion
     */
    public float division() {
        if (num2 > 0) {
            return num1 / num2;
        }
        return 0;
    }
}
