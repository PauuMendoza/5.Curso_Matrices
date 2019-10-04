/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.curso_matrices;

/**
 *
 * @author Paulina
 */
public class NewClass {
    
    public static void main(String args[]){
        
        int matriz[][]={{10,11,12},{20,21,22},{30,32,33}};
                
                for(int row=0;row<matriz.length;row++){
                    System.out.print(matriz[row][0]+",");
                }
                System.out.println("\n");
                
                for(int column=0;column<matriz.length;column++){
                    System.out.println(matriz[0][column]);
                }
    }
    
}
