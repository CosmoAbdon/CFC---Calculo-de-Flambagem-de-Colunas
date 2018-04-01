/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufersa.valecius.tcc.utils;

import static java.lang.Math.sqrt;
import java.util.OptionalDouble;

/**
 *
 * @author cosmo
 */
public class VariavelCl {
    

    public static void main(String [] args){
        VariavelCl variavelCl = new VariavelCl(4.0, 8.0, 2.0, 1.0);
        
        
        System.out.println("Valor lx : "+ variavelCl.getIx());
        System.out.println("Valor ly : "+ variavelCl.getIy());
        System.out.println("Valor A : "+ variavelCl.getA());
        System.out.println("Valor RX : "+ variavelCl.getRx());
    }
    
    
    private int tipo; 
    /*
        0 = Abas Largas
        1 = Retangular Cheio
        2 = Retangular Vazio
        3 = Circular Cheio
        4 = Circular Vazio
    */
    
    // Abas Largas
    private Double tw;
    private Double bf;
    private Double tf;
    private Double d;
    
    //Circular 
    private Double r1;
    private Double r2;
    
    //Retangular
    private Double b;
    private Double h;
    private Double e1;
    private Double e2;
    
    // Variaveis Fixas
    private Double Ix;
    private Double iy;
    private Double A;
    private Double rx;
    private Double ry;
    private Double k;
    private Double l;
    private Double lef;

    public VariavelCl() {
    }

    public VariavelCl(int tipo, Double tw, Double bf, Double tf, Double d) {
        this.tipo = tipo;
        this.tw = tw;
        this.bf = bf;
        this.tf = tf;
        this.d = d;
        
        Ix = (tw*(d-2*tf)*(d-2*tf)*(d-2*tf))/12 + 2*((bf*tf*tf*tf)/12+(bf*tf)*((d-tf)/2)*((d-tf)/2));
        iy = (((d - (2 * tf)) * Math.pow(tw, 3)) / 12 + (2 * tf * Math.pow(bf, 3) )/12);
        A = (d*bf) - (bf - tw) * (d- 2*tf);
        rx = sqrt(Ix/A);
        ry = sqrt(iy/A);
        
    }

    public VariavelCl(int tipo, Double r1, Double r2) {
        this.tipo = tipo;
        this.r1 = r1;
        this.r2 = r2;
        
        Ix = (Math.PI * (Math.pow(r1, 4) - Math.pow(r2, 4)) / 4);
        iy = (Math.PI * (Math.pow(r1, 4) - Math.pow(r2, 4)) / 4);
        A = Math.PI * (r1*r1 - r2*r2) ;
        rx = sqrt(Ix/A);
        ry = sqrt(iy/A);
    }

    public VariavelCl(int tipo, Double r1) {
        this.tipo = tipo;
        this.r1 = r1;
        
        Ix = (Math.PI * Math.pow(r1, 4)) / 4 ; 
        iy = (Math.PI * Math.pow(r1, 4)) / 4 ; 
        A = Math.PI * (r1*r1) ;
        rx = sqrt(Ix/A);
        ry = sqrt(iy/A);
    }

    
    public VariavelCl (Double b, Double h){
        tipo = 1;
        
        Ix = (b*Math.pow(h,3))/12;
        iy = (h*Math.pow(b,3))/12;
        A = b*h;
        rx = sqrt(Ix/A);
        ry = sqrt(iy/A);
    }
    
    
    public VariavelCl(Double b, Double h, Double e1, Double e2){
        tipo = 2;
        
        Ix = b*Math.pow(h, 3)/12 - (b-2*e2) * Math.pow((h-2*e1), 3)/12;
        iy = h*Math.pow(b, 3)/12 - (h-2*e1) * Math.pow((b-2*e2), 3)/12;
        A = b*h - (b-2*e2) * (h-2*e1);
        rx = sqrt(Ix/A);
        ry = sqrt(iy/A);
        
    }
    
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Double getTw() {
        return tw;
    }

    public void setTw(Double tw) {
        this.tw = tw;
    }

    public Double getBf() {
        return bf;
    }

    public void setBf(Double bf) {
        this.bf = bf;
    }

    public Double getTf() {
        return tf;
    }

    public void setTf(Double tf) {
        this.tf = tf;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getR1() {
        return r1;
    }

    public void setR1(Double r1) {
        this.r1 = r1;
    }

    public Double getR2() {
        return r2;
    }

    public void setR2(Double r2) {
        this.r2 = r2;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getE1() {
        return e1;
    }

    public void setE1(Double e1) {
        this.e1 = e1;
    }

    public Double getE2() {
        return e2;
    }

    public void setE2(Double e2) {
        this.e2 = e2;
    }

    public Double getIx() {
        return Ix;
    }

    public void setIx(Double Ix) {
        this.Ix = Ix;
    }

    public Double getIy() {
        return iy;
    }

    public void setIy(Double iy) {
        this.iy = iy;
    }

    public Double getA() {
        return A;
    }

    public void setA(Double A) {
        this.A = A;
    }

    public Double getRx() {
        return rx;
    }

    public void setRx(Double rx) {
        this.rx = rx;
    }

    public Double getRy() {
        return ry;
    }

    public void setRy(Double ry) {
        this.ry = ry;
    }

    public Double getK() {
        return k;
    }

    public void setK(Double k) {
        this.k = k;
    }

    public Double getL() {
        return l;
    }

    public void setL(Double l) {
        this.l = l;
    }

    public Double getLef() {
        return lef;
    }

    public void setLef(Double lef) {
        this.lef = lef;
    }

    
    
   
    
    
    
}
