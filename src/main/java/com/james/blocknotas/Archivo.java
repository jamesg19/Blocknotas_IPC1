/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.james.blocknotas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author James Gramajo 
 */
public class Archivo {
    //String ruta="C:\\Users\\james\\Desktop\\ARCHIVO.txt";
    String RUTA;
    String rutaB="C:\\Users\\james\\Desktop\\HOLA.txt";
    public String abrirArchivo(String ruta){
        String texto="";
        RUTA=ruta;
        try{
            File archivo=new File(ruta);
            FileReader lector=new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String linea;
            while((linea=buffer.readLine()) !=null ){
                texto+=linea+"\n";
            }
            buffer.close();
            lector.close();
            System.out.println(texto);
        }catch(IOException error){
            System.out.println(error);
        }
        return texto;
    }
    
    public void guardarArchivo(String texto){
        try{
            File archivo=new File(RUTA);
            FileWriter escritor=new FileWriter(archivo,false);
            BufferedWriter buffer= new BufferedWriter(escritor);
            buffer.write(texto);
            
            buffer.close();
            escritor.close();
            System.out.println("El archivo ha sido guardado");
            
        }catch(IOException error){
            
            System.out.println(error);
        }
    }

    
    public void crearArchivo(){
        try{
        RUTA=rutaB;
        FileWriter archivo=new FileWriter(rutaB);
        archivo.write("");
        archivo.close();
            System.out.println("El archivo ha sido creado");
        
        } catch(IOException error){
            System.out.println(error);
        }
        
    }
}
