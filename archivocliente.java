/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canchapro.modelo;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class archivocliente {
public void guardarclientes(cliente c){
try{
FileWriter archivo = new FileWriter("cliente.csv",true);
BufferedWriter bw = new BufferedWriter(archivo);
bw.write(c.aLineaCSV());
bw.newLine();
System.out.println("cliente guardado exitosamente.");

} catch (IOException e) {
System.out.println("Error: " + e.getMessage());
}
}
}
