/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canchapro.modelo;

import java.time.LocalDate;

public class cliente {
    private String codigo;
    private String nombre;
    private String telefono;
    private String correo;
    private LocalDate fechaRegistro;
    
    public cliente(String codigo,String nombre,String telefono, String correo,LocalDate fechaRegistro){
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.correo=correo;
        this.fechaRegistro=fechaRegistro;
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
     
     public String gettelefono(){
         return telefono;
     }
    public void settelefono(String telefono){
         this.telefono=telefono;
    }
    public String getcorreo(){
        return correo;
    }
    public void setcorreo(String correo){
        this.correo=correo;
        
    }
    public LocalDate getfechaRegistro(){
        return fechaRegistro;
    }
    public void setfechaRegistro(LocalDate fechaRegistro){
        this.fechaRegistro=fechaRegistro;
    }
   public String aLineaCSV(){
        return codigo + "," + nombre + "," + telefono + "," + (correo != null ? correo : "") + "," + fechaRegistro;
    }
}

