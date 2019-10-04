/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.curso_matrices;

import java.util.Scanner;

/**
 *
 * @author Paulina Ejercicio 3: Crear y cargar una matriz de tamaño 3x3,
 * trasponerla y mostrarla.
 */
public class E3_TransposeMatrix {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int matrix[][], nRows = 3, nColumns = 3;

        matrix = new int[nRows][nColumns];

        System.out.println("**ENTER THE DATA**");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print("Matrix [" + indexRow + "][" + indexColumn + "]: ");
                matrix[indexRow][indexColumn] = input.nextInt();
            }
        }

        System.out.println("**ORIGINAL MATRIX**");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print(matrix[indexRow][indexColumn] + " ");
            }
            System.out.println("");
        }

        System.out.println("**TRANSPOSE MATRIX**");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print(matrix[indexColumn][indexRow] + " ");
            }
            System.out.println("");
        }
    }

}
