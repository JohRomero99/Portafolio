/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Usuario
 */
public class Paquete {
    private String Tamaño;
    private String Cantidad;
    private String Peso;

    public Paquete(){
     this.setCantidad("");
     this.setPeso("");
     this.setTamaño("");
    
    }

    public Paquete(String Tamaño, String Cantidad, String Peso) {
        this.setTamaño(Tamaño);
        this.setPeso(Peso);
        this.setCantidad(Cantidad);
    }
    
    
    
    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }
    
    
}
