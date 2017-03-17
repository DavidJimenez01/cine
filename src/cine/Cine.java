/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Cine {
    
    private final Scanner teclado;
    
    /**
     * CONSTRUCTOR DE LA CLASE CINE
     */
    public Cine(){
        teclado= new Scanner(System.in);
        mensajeInicio();
        datosSillas();
        tipo();
        
        
        
    }
    /**
     * METODO QUE ARROJA MENSAJE DE BIENVENIDA
     */
    private void mensajeInicio(){
        System.out.println("BIENVENIDOS A SU CINE FILMS PREMIUM");
        
    }
    /**
     * metodo que pide datos para crear sala
     */
    private void datosSillas(){
        byte columna,fila;
        System.out.println("digite el numero de filas ");
        fila= teclado.nextByte();
        System.out.println("digite el numero de columnas ");
        columna=teclado.nextByte();
        PedirDatos pide1 = new PedirDatos(fila,columna);
        pide1.dibujar(columna, fila);
    }
    
    private void tipo(){
        byte filaejecutiva,filageneral,filapreferencial;
        System.out.println("digite cuantas filas desea genereales ?");
        filageneral= teclado.nextByte();
        System.out.println("digite cuantas filas desea preferenciales ?");
        filapreferencial= teclado.nextByte();
        System.out.println("digite el numero de fila que desea para ser ejecutiva ?");
        filaejecutiva= teclado.nextByte();
        TipoFila tipof = new TipoFila (filaejecutiva,filageneral,filapreferencial);
        tipof.preferencial(filapreferencial);
    } 
    
    
    
    
    

}
