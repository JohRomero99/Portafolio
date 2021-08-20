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
public class Pago {
    public String Pago(String c,String p){
      int cantidad,resultado,kg,total;
      int valor = 10 , peso = 10;
      String salida = "" ;
      
      cantidad = Integer.parseInt(c);
      resultado = cantidad * valor;
      kg = Integer.parseInt(p);
      if(kg > 20){
        peso = peso + 10;
        total = resultado + peso;
        salida = Integer.toString(total);
      }else{
      total = resultado + peso;
      salida =Integer.toString(total);
      }
      return "Total a Pagar: " +salida;
    }
}
