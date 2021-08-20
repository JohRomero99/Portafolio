/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

public class Cliente {
    private String nombre;
    private String Gmail;
    private String cedula;
   

    public Cliente(){
        this.setNombre("");
        this.setGmail("");
        this.setCedula("");
      
    }
    
    public Cliente(String nombre, String Gmail, String cedula) {
        this.setNombre(nombre);
        this.setGmail(Gmail);
        this.setCedula(cedula);
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

   

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   

   
}
