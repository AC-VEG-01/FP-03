/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_8_arreglos_multi;

/**
 *
 * @author herna
 */
public class EVA_3_8_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] cubo = new int[10][10][10];
        //LLENADO
        System.out.println(cubo.length);
        System.out.println(cubo[1].length);
        System.out.println(cubo[0][0].length);
        for (int i = 0; i < cubo.length; i++) {//1er DIM
            for (int j = 0; j < cubo.length; j++) {//2DA DIM
                for (int k = 0; k < cubo[i][j].length; k++) {//3ER DIM
                    cubo[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
        //IMPRIMIR LOS VALORES
        for (int i = 0; i < cubo.length; i++) {//1er DIM
            for (int j = 0; j < cubo.length; j++) {//2DA DIM
                for (int k = 0; k < cubo[i][j].length; k++) {//3ER DIM
                     System.out.print("[" + cubo[i][j][k] + "]");
    }
    
}
