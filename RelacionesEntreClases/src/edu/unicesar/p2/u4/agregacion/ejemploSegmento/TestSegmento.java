/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.u4.agregacion.ejemploSegmento;

/**
 *
 * @author jairo
 */
public class TestSegmento {
    public static void main(String[] arg){
        
        Segmento sa = new Segmento();
        System.out.println("Tamaño de sa: " + sa.calcularTamaño());
        
        Punto a = new Punto(5,5);
        Punto b= new Punto (8,8);
        Segmento sb = new Segmento(a,b);
        System.out.println("Tamaño de sb: " + sb.calcularTamaño());
        
        
        Segmento sc = new Segmento(b);
        System.out.println("Tamaño de sc: " + sc.calcularTamaño());
        
        
    }
}
