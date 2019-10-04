/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.curso_matrices;

/**
 *
 * @author Paulina Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de
 * forma que los elementos de la diagonal principal sean 1 y el resto 0;
 */
public class E4_IdentityMatrix {

    public static void main(String args[]) {

        int matrix[][], sizeSeven = 7, numberOne = 1;

        matrix = new int[sizeSeven][sizeSeven];

        for (int indexRow = 0, indexColumn = 0; indexRow < sizeSeven && indexColumn < sizeSeven; indexRow++, indexColumn++) {
            matrix[indexRow][indexColumn] = numberOne;
        }

        System.out.println("***SHOWING RESULT***");
        for (int indexRow = 0; indexRow < sizeSeven; indexRow++) {
            for (int indexColumns = 0; indexColumns < sizeSeven; indexColumns++) {
                System.out.print(matrix[indexRow][indexColumns] + " ");
            }
            System.out.println("");
        }
    }

}
