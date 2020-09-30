/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u4.ejemploagregacion;

/**
 *
 * @author jairo
 */
public class TestSegmento {
    
    public static void main(String arg[]){
        
        Segmento sa = new Segmento();
        System.out.println("Tam sa: " + sa.calcularTamaño());
        
        Punto a = new Punto(5,5);
        Punto b = new Punto(7,7);
        
        Segmento sb = new Segmento(a,b);
        Segmento sc = new Segmento(new Punto(3,5), a);
        
        System.out.println("Tam sb: " + sb.calcularTamaño());
        System.out.println("Tam sc: " + sc.calcularTamaño());
    }
    
}
