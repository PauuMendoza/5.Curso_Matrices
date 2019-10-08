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
 * @author Paulina Ejercicio 5: Crear y cargar una matriz de tamaño n x m,
 * mostrar la suma de cada fila y cada columna.
 *
 * - (countRow se asegura de haber pasado por todas las columnas/filas y solo sobre
 * esa condicion muestra el resultado de la suma)
 */
public class E5_SumRowColumn {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int matrix[][], nRows, nColumns;

        nRows = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of rows: "));
        nColumns = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of columns: "));

        matrix = new int[nRows][nColumns];

        System.out.println("***ENTER THE DATA***");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print("Matrix [" + indexRow + "][" + indexColumn + "]: ");
                matrix[indexRow][indexColumn] = input.nextInt();
            }
        }

        System.out.println("");

        System.out.println("**SHOW RESULT**");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumns = 0; indexColumns < nColumns; indexColumns++) {
                System.out.print(matrix[indexRow][indexColumns] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        int addRows = 0;//add of rows
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            addRows = 0;
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                addRows += matrix[indexRow][indexColumn];
            }
            System.out.println("The add of the row :[" + indexRow + "] is: " + addRows);
        }

        System.out.println("");

        int addColumns = 0;//add of columns
        for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
            addColumns = 0;
            for (int indexRow = 0; indexRow < nRows; indexRow++) {
                addColumns += matrix[indexRow][indexColumn];
            }
            System.out.println("The add of the columns :[" + indexColumn + "] is: " + addColumns);

        }
    }

}
