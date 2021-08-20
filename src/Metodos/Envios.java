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
public class Envios {
    private String Cajas;
    private String Documentos;
    private String Vestimentas;
    
    public Envios(){
      this.setCajas("");
      this.setDocumentos("");
      this.setVestimentas(""); 
    }

    public Envios(String Cajas, String Documentos, String Vestimentas) {
        this.setCajas(Cajas);
        this.setDocumentos(Documentos);
        this.setVestimentas(Vestimentas);
    }

    public String getCajas() {
        return Cajas;
    }

    public void setCajas(String Cajas) {
        this.Cajas = Cajas;
    }

    public String getDocumentos() {
        return Documentos;
    }

    public void setDocumentos(String Documentos) {
        this.Documentos = Documentos;
    }

    public String getVestimentas() {
        return Vestimentas;
    }

    public void setVestimentas(String Vestimentas) {
        this.Vestimentas = Vestimentas;
    }
}
