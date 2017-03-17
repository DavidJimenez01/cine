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
public class TipoFila {
    
    private final Scanner teclado;
    
   
    
    /**
     * atributo que aloja que fila es preferencial
     */
    private byte filapreferencial;
    
    /**
     * atributo que aloja que fila es general
     */
    private byte filageneral;
    
    /** 
     * atributo que aloja que fila es ejecutiva
     */
    private byte filaejecutiva;
    /**
     * constructor que inicializa las variables filaejecutiva,filapreferencial,filageneral,acum
     * @param filapreferencial
     * @param filageneral
     * @param filaejecutiva 
     */
    public TipoFila( byte filapreferencial, byte filageneral, byte filaejecutiva){
        teclado = new Scanner(System.in);
        this.filaejecutiva= filaejecutiva;
        this.filapreferencial=filapreferencial;
        this.filageneral=filageneral;
        
    }

    /**
     * retorna el valor de fila preferencial
     * @return 
     */
    public byte getFilapreferencial() {
        return filapreferencial;
    }
    /**
     * modifica el valor de fila preferencial
     * @param filapreferencial 
     */
    
    public void setFilapreferencial(byte filapreferencial) {
        this.filapreferencial = filapreferencial;
    }
    /**
     * retorna el valor de fila general
     * @return 
     */
    public byte getFilageneral() {
        return filageneral;
    }
    /**
     * modifica el valor de fila general
     * @param filageneral 
     */
    public void setFilageneral(byte filageneral) {
        this.filageneral = filageneral;
    }
    /**
     * retorna el valor de fila ejecutiva
     * @return 
     */
    public byte getFilaejecutiva() {
        return filaejecutiva;
    }
    /**
     * modifica el valor de fila ejecutiva
     * @param filaejecutiva 
     */
    public void setFilaejecutiva(byte filaejecutiva) {
        this.filaejecutiva = filaejecutiva;
    }
    
    public void preferencial(byte filapreferencial){
        byte acum=0;
        
       
        
        
      
    }
   
}
