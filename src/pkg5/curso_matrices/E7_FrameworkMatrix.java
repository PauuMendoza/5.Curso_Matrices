/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.curso_matrices;

/**
 *
 * @author Paulina Ejercicio 7: Crear una matriz "marco" de tamaño 5x5: todos
 * sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrarla.
 */
public class E7_FrameworkMatrix {

    public static void main(String args[]) {

        int sizeFive = 5;
        int zero = 0, four = 4, one = 1;//constantes

        int matrix[][] = new int[sizeFive][sizeFive];

        for (int indexRow = 0; indexRow < sizeFive; indexRow++) {
            for (int indexColumn = 0; indexColumn < sizeFive; indexColumn++) {
                if (indexRow == zero || indexRow == four) {
                    matrix[indexRow][indexColumn] = one;
                    matrix[indexColumn][indexRow] = one;
                }
            }
        }

        System.out.println("***SHOW RESULT***");
        for (int indexRow = 0; indexRow < sizeFive; indexRow++) {
            for (int indexColumn = 0; indexColumn < sizeFive; indexColumn++) {
                System.out.print(matrix[indexRow][indexColumn] + " ");
            }
            System.out.println(" ");
        }
    }
}
