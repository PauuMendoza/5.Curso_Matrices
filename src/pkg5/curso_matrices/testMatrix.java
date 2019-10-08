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
 * TRES EJERCICIOS DE PRACTICA PROPUESTOS POR DAVID PARA LA PRACTICA DE IMPRESION DE MATRICES
 */
public class testMatrix {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int matrixOne[][], matrixTWO[][], matrixTHREE[][], nRows, nColumns;

        nRows = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de filas: "));
        nColumns = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de columnas: "));

        ///EJEMPLO 1, Llenar e imprimir matriz FILA-COLUMNA como normalmente se hace
        matrixOne = new int[nRows][nColumns];
/*
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print("Matriz [" + indexRow + "] [" + indexColumn + "]: ");
                matrixOne[indexRow][indexColumn] = input.nextInt();
            }
        }

        System.out.println("***RESULT***");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print(matrixOne[indexRow][indexColumn]);
            }
            System.out.println("");
        }
*/
        matrixTWO = new int[nRows][nColumns];//EJEMPLO 2, Llenar e imprimir matriz pero Intercabiar columna x fila
/*
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print("Matriz [" + indexRow + "] [" + indexColumn + "]: ");
                matrixTWO[indexRow][indexColumn] = input.nextInt();
            }
        }

        System.out.println("***RESULT***");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print(matrixTWO[indexColumn][indexRow]);
            }
            System.out.println("");

        }
*/
        matrixTHREE = new int[nRows][nColumns];
/*
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print("Matriz [" + indexRow + "] [" + indexColumn + "]: ");
                matrixTHREE[indexRow][indexColumn] = input.nextInt();
            }
        }

        System.out.println("***RESULT***");
        for (int indexRow = nRows - 1; indexRow >= 0; indexRow--) {
            for (int indexColumn = nColumns - 1; indexColumn >= 0; indexColumn--) {
                System.out.print(matrixTHREE[indexRow][indexColumn]);

            }
            System.out.println("");

        }
*/
    }
}
