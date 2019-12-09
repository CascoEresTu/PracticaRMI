/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarmi;

import java.io.File;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author k_k_r
 */
public interface Service extends Remote {
    void CrearArchivo(File archivo, boolean tipo) throws RemoteException, IOException;
    void EditarArchivo(File archivo, String Texto) throws RemoteException;
    void EliminarArchivo(File archivo, boolean tipo) throws RemoteException;
    DefaultTreeModel CargarDirectorio() throws RemoteException;
    void Desmontar(String cliente)throws RemoteException;
    
    /*
        void enviarCambios()
        void AlertaArchivoEditado();
        void NuevoCliente();
    */
}
