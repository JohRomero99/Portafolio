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
public class Destino {
    private String Pais;
    private String Ciudad;
    private String Direccion;

    public Destino(){
    this.setPais("");
    this.setCiudad("");
    this.setDireccion("");
    
    }

    public Destino(String Pais, String Ciudad, String Direccion) {
        this.setPais(Pais);
        this.setCiudad(Ciudad);
        this.setDireccion(Direccion);
    }
    
    
    
    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}
