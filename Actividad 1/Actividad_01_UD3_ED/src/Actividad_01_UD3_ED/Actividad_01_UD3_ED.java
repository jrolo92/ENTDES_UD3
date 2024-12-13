/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_01_UD3_ED;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ana
 */
public class Actividad_01_UD3_ED 
{
    private static byte[] bufer = new byte[1000];
    private static String nombreArchivo = "fichero.dat";
    private static FileInputStream entradaFlujo = null;
    private static BufferedInputStream entradaBufer = null;

    public static void inicializarArchivos() throws FileNotFoundException
    {
        entradaFlujo = new FileInputStream(nombreArchivo);
        entradaBufer = new BufferedInputStream(entradaFlujo);
    }
    
    public static int mostrarTextoArchivos() throws IOException
    {
        int total = 0;
        int nRead = 0;
        while((nRead = entradaFlujo.read(bufer)) != -1) 
        {
            System.out.println(new String(bufer));
            total += nRead;
        }
        
        return total;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        try 
        {
            inicializarArchivos();
            
            int total = mostrarTextoArchivos();           

            System.out.println("\nLeídos " + total + " bytes");
        }
        catch(IOException ex) 
        {
            System.out.println("Error -> " + ex.toString());                
        }
        finally 
        {
            try 
            {
                if( entradaBufer != null && entradaFlujo != null )
                {
                    entradaFlujo.close();
                    entradaBufer.close();
                }                
            } 
            catch (IOException ex) 
            {
                System.out.println("Error al cerrar el fichero -> " + ex.toString());
            }
        }
    }
    
}
