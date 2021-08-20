/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class verificacion {
    public boolean verificarIngreso(String usuario, String contrasena) throws Exception 
    {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        boolean r =false;
        try {
           // Apertura del fichero y creacion de BufferedReader para poder
           // hacer una lectura comoda (disponer del metodo readLine()).
           archivo = new File ("usuarios.txt");
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           // Lectura del fichero
           String linea;
           while((linea=br.readLine())!=null)
           {
              String user, pass ="";
              //System.out.println(linea);
              user = linea.split("::")[0];
              pass = linea.split("::")[1];
              
              if ((user.equals(usuario) && pass.equals(contrasena)))
                  return true;
           }
        }
        catch(Exception e)
        {
           throw e;
           
        }
        finally
        {
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{                    
              if( null != fr )
              {   
                 fr.close();     
              }                  
           }
           catch (Exception e2)
           { 
              e2.printStackTrace();
           }
        }
        return false;
    }
}
