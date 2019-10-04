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
 * @author Paulina Ejercicio 1: Crear y cargar una matriz de tamaño n x m y
 * decir si es simètrica o no.
 */
public class E1_SymmetricMatrix {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int matrix[][], nRows, nColumns, count = 0;
        nRows = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of ranks: "));
        nColumns = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of colums: "));

        if (nRows != nColumns) {
            JOptionPane.showMessageDialog(null, "The matrix is ​​not symmetric");
        }

        matrix = new int[nRows][nColumns];

        System.out.println("***ENTER THE DATA***");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print("Matrix [" + indexRow + "][" + indexColumn + "]: ");
                matrix[indexRow][indexColumn] = input.nextInt();
            }
        }

        //COMPARING MATRIX POSITIONS
        for (int row = 0; row < nRows; row++) {
            for (int column = 0; column < nColumns; column++) {
                if (matrix[row][column] == matrix[column][row]) {
                    count++;
                }
            }
        }

        if (count == matrix.length+1) {
            JOptionPane.showMessageDialog(null, "THE MATRIX IS SYMMETRIC!!!");
        } else {
            JOptionPane.showMessageDialog(null, "THE MATRIX IS NOT SYMMETRIC :/");
        }

    }
}
