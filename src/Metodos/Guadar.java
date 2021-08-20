/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Ventanas.Productos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Guadar{
    FileWriter archivo;
    PrintWriter linea;
    public void  guardardatos( String a , String b , String c) {
     
        try {
            archivo = new FileWriter("Datos.txt",true);
            linea = new PrintWriter(archivo);
            linea.println("Nombre: " +a);
            linea.println("Cedula "+b);
            linea.println("Correo: "+c);
            linea.close();
            archivo.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public void guardarDatosPaquete(String t ,String c , String p){
        try{
            archivo = new FileWriter("Datos.txt",true);
            linea = new PrintWriter(archivo);
            linea.println("Tamaño: " +t);
            linea.println("Cantidad: "+c);
            linea.println("Peso: "+p);
            linea.close();
            archivo.close();
        }catch(IOException ex){
           JOptionPane.showMessageDialog(null,ex);
        }   
    }
        
    public void guardarDestino(String d,String c,String a){
    try{
            archivo = new FileWriter("Datos.txt",true);
            linea = new PrintWriter(archivo);
            linea.println("Pais: " +d);
            linea.println("Ciudad: "+c);
            linea.println("Direccion: "+a);
            linea.println("");
            linea.close();
            archivo.close();
        }catch(IOException ex){
           JOptionPane.showMessageDialog(null,ex);
        }   
    
    
    
    }    
      
     
}
