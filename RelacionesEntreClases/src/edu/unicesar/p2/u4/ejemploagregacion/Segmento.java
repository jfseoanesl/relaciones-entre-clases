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
public class Segmento {
    
    private Punto a;
    private Punto b;
    
    public Segmento(){
        this(new Punto(), new Punto());
    }
    
    public Segmento(Punto a, Punto b){
        this.a = a;
        this.b= b;
    }
    
    public Punto getPuntoA(){return this.a;}
    public Punto getPuntoB(){return this.b;}
    public void setPuntoA(Punto a){this.a=a;}
    public void setPuntoB(Punto b){this.b=b;}
    
    public double calcularTamaño(){
        return this.a.distancia(this.b);
    }
    
}
