/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarmi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author k_k_r
 */
public class Middleware extends UnicastRemoteObject implements Service {

    /*  
    TODO:
        ArrayList clientes = new ArrayList(); // Creo que tendremos varias instancias de clientes en un arraylist, para poder desmontarlas
        String name; // para identificar de manera mas sencilla al cliente y al servidor
        Cliente // creo que esta sera cada invocacion del GUI del cliente.
     */
    public String name;

    public Middleware(String name) throws RemoteException {
        this.name = "Servidor";
    }

    public Middleware(String name, Object cliente) throws RemoteException {
        this.name = "Servidor";
        //this.cliente = cliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void CrearArchivo(File archivo, boolean tipo) throws RemoteException, IOException {
        File temp = PathServer(archivo);
        if (tipo) {
            temp.getParentFile().mkdirs();
            temp.createNewFile();
        } else {
            temp.mkdirs();
        }
    }

    @Override
    public void EditarArchivo(File archivo, String Texto) throws RemoteException {
        try {
            Files.write(Paths.get(archivo.getAbsolutePath()), Texto.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void EliminarArchivo(File archivo, boolean tipo) throws RemoteException {
        File temp = PathServer(archivo);
        this.eliminarDirectorios(temp);

    }

    @Override
    public DefaultTreeModel CargarDirectorio() throws RemoteException {
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(new Archivo(new File("RootServer"), "", false));
        cargarArbol("RootServer", raiz);
        return new DefaultTreeModel(raiz);

    }

    @Override
    public void Desmontar(String cliente) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public File PathServer(File archivo) {
        String path = archivo.getName();
        File parent = archivo;

        /* 
        while (true) {
            parent = parent.getParentFile();
            if (parent.getName().equals("RootServer")) {
                break;
            }            
        } */
        while (!parent.getName().equals("RootServer")) {
            parent = parent.getParentFile();
        }

        path = parent.getName() + "/" + path;
        return new File(path);
    }

    public void cargarArbol(String directorio, DefaultMutableTreeNode node) {
        File raiz = new File(directorio);
        File[] lista = raiz.listFiles();
        Archivo temp;

        for (File file : lista) {
            String nombre = file.getName();
            if (file.isFile()) {
                String texto = leerArchivo(file.getAbsolutePath());
                temp = new Archivo(file, texto, true);
                node.add(new DefaultMutableTreeNode(temp));
            } else if (file.isDirectory()) {
                temp = new Archivo(file, "", false);
                DefaultMutableTreeNode subDirectorio = new DefaultMutableTreeNode(temp);
                File subFile = new File(raiz.getAbsolutePath(), nombre);
                cargarArbol(subFile.getAbsolutePath(), subDirectorio);
                node.add(subDirectorio);
            }
        }
    }

    public void eliminarDirectorios(File root) {
        File[] allContents = root.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                eliminarDirectorios(file);
            }
        }
        root.delete();
    }

    private String leerArchivo(String nombreArchivo) {
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(Paths.get(nombreArchivo)));
        } catch (IOException e) {
            System.out.println(e);
        }
        return texto;
    }

}
