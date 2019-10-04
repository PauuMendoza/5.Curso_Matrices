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
public class testMatrix {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int matrixOne[][], matrixTWO[][] , nFilas, nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de columnas: "));
        
        ///LLENAR Y MOSTRAR 2*3, EJEMPLO 1, FILA-COLUMNA
         matrixOne = new int [nFilas][nColumnas];
        
        /*
        for(int indexFilas=0;indexFilas<nFilas;indexFilas++){
            for(int indexColumnas=0;indexColumnas<nColumnas;indexColumnas++){
                System.out.print("Matriz ["+indexFilas+"] ["+indexColumnas+"]: ");
                matrixOne[indexFilas][indexColumnas]=input.nextInt();
            }
        }
        
        for(int row=0;row<nFilas;row++){
            for(int col=0;col<nColumnas;col++){
                System.out.print(matrixOne[row][col]);
            }
            System.out.println("");
        }*/
        
        matrixTWO = new int [nFilas][nColumnas];
        
         for(int indexFilas=0;indexFilas<nFilas;indexFilas++){
            for(int indexColumnas=0;indexColumnas<nColumnas;indexColumnas++){
                System.out.print("Matriz ["+indexFilas+"] ["+indexColumnas+"]: ");
                matrixTWO[indexFilas][indexColumnas]=input.nextInt();
            }
        }
         
         for(int row=0;row<nFilas;row++){
            for(int col=0;col<nColumnas;col++){
                System.out.print(matrixTWO[col][row]);
            }
            System.out.println("");
         
         }
        
    }
}
