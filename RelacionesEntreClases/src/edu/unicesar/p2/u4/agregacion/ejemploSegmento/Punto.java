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
public class Punto {
    
    private double x;
    private double y;
    
    public Punto(){
        this(0,0);
    }
    
    public Punto (double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    
    public double distancia(Punto b){
        double dx = this.x - b.x;
        double dy = this.y - b.y;
        double suma = Math.pow(dx, 2) + Math.pow(dy, 2);
        return Math.sqrt(suma);
    }
    
}
