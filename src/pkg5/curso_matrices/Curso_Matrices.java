/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.curso_matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 */
public class Curso_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        int matriz[][], nFilas, nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de columnas: "));
        
        matriz = new int [nFilas][nColumnas];
        
        for(int indexFilas=0;indexFilas<nFilas;indexFilas++){
            for(int indexColumnas=0;indexColumnas<nColumnas;indexColumnas++){
                System.out.print("Matriz ["+indexFilas+"] ["+indexColumnas+"]: ");
                matriz[indexFilas][indexColumnas]=input.nextInt();
            }
        }
        
        System.out.println("***MOSTRANDO RESULTADO***");
        for(int indexFilas=0;indexFilas<nFilas;indexFilas++){
            for(int indexColumnas=0;indexColumnas<nColumnas;indexColumnas++){
                System.out.print(matriz[indexFilas][indexColumnas]);
            }
            System.out.println("");
        }
    }
    
}
