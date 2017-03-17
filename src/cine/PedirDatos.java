/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Scanner;




/**
 *clase que reibe los datos del numero de filas y columnas
 * @author david
 */
public class PedirDatos {
    
    /**
     * atributo que aloja el numero de filas
    */
    private byte columna;
    /**
     * atributo que aloja el numero de columnas
     */
    private byte fila;
   
    /**
     * constructor de la clase que inicializa las variables 
     * @param fila
     * @param columna 
     */
    public PedirDatos(byte fila, byte columna){
        this.columna=columna;
        this.fila= fila;
    }
/**
 * retorna el valor de la columna
 * @return columna
 */
    public byte getColumna() {
        return columna;
    }
/**
 * modifica el valor de columna
 * @param columna 
 */
    public void setColumna(byte columna) {
        this.columna = columna;
    }
/**
 * retorna el valor de fila
 * @return fila
 */
    public byte getFila() {
        return fila;
    }
/**
 * modifica el valor de fila
 * @param fila 
 */
    public void setFila(byte fila) {
        this.fila = fila;
    }
   
    public void dibujar(byte columna, byte fila){
        byte i,j,cont=1;
        System.out.println();
        System.out.println("          ____________________          ");
        System.out.println("         |     PANTALLA       |        \n\n ");
        
        for(i=1; i<=fila; i++){
            for(j=1; j<=columna; j++){
                if(cont<10){
                    System.out.print(" ||" + cont + " || ");
                }else{
                    System.out.print(" ||" + cont + "|| ");
                }
                cont = (byte) (cont+1);
            }
            System.out.println();
            System.out.println();
           }
    }
    
            
}
