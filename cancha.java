/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canchapro.modelo;


import java.time.LocalTime;
/**
 *
 * @author dumbc
 */
public class cancha {
   private String codigo;
   private String nombre;
   private int capacidad;
   private double precioBase;
   private LocalTime apertura;
   private LocalTime cierre;
   
   public cancha(String codigo,String nombre,int capacidad, double precioBase,LocalTime apertura,LocalTime cierre){
        this.codigo=codigo;
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.precioBase=precioBase;
        this.apertura=apertura;
        this.cierre=cierre;
    }
    public String getcodigo(){
        return codigo;
    }
    public void setcodigo(String codigo){
        this.codigo=codigo;
    }
    public String getnombre(){
        return nombre;
    }
     public void setnombre(String nombre){
        this.nombre=nombre;}
     
     public int getcapacidad(){
         return capacidad;
     }
    public void setcapacidad(int capacidad ){
         this.capacidad=capacidad;
    }
    public double getprecioBase(){
        return precioBase;
    }
    public void setprecioBase(double precioBase){
        this.precioBase=precioBase;
        
    }
    public LocalTime getapertura(){
        return apertura;
    }
    public void setapertura(LocalTime apertura){
        this.apertura=apertura;
    }
    public LocalTime getcierre(){
        return cierre;
    }
    public void setcierre(LocalTime cierre){
        this.cierre=cierre;
    }
    
}
