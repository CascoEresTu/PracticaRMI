/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarmi;

import java.io.File;

/**
 *
 * @author k_k_r
 */
public class Archivo {
    public File archivo;
    public String texto;
    public boolean tipo; //archivo o directorio, true or false 

    public Archivo(File archivo, String texto, boolean tipo) {
        this.archivo = archivo;
        this.texto = texto;
        this.tipo = tipo;
     }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public String Datos(){
        if(this.isTipo()){
            return "Archivo: /" + archivo.getName() + "/ \n Path: /" + archivo.getAbsolutePath() + "/ \nTexto: /" + texto + "/ \n";
        }else{
            return "Directorio: /" + archivo.getName() + "/ \n Path: /" + archivo.getAbsolutePath() + "/ \nTexto: /" + texto + "/ \n";
        }
            
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return archivo.getName();
    }
    
}
