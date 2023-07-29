/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author salomon.ramirez
 */
public class modelo {

    public static boolean guardarArchivos(LinkedList<Cliente> listaC) {
        boolean t = false;
        try {
            String nombreArchivo = "clientes.txt";
            
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            
            for (Cliente objE : listaC) {
                writer.write(objE.toString() + "\n");

            }
            writer.close();
            fileWriter.close();
            t = true;

        } catch (IOException e) {
            System.out.println(e.toString());
            

        }

        return t;

    }

}
