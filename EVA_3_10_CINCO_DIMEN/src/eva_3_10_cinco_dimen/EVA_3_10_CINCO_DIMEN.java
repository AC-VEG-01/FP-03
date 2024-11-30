/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_10_cinco_dimen;

/**
 *
 * @author herna
 */
public class EVA_3_10_CINCO_DIMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int quintos [][][][][]= new int [1][3][2][5][2];
       
     
        
        for (int i = 0; i < quintos.length; i++) {
            for (int j = 0; j < quintos[i].length; j++) {
                for (int k = 0; k < quintos[i][j].length; k++) {
                    for (int l = 0; l < quintos[i][j][k].length; l++) {
                        for (int m = 0; l < quintos[i][j][k][l].length; l++) {
                       
                         
                          quintos[i][j][k][l][m]=(int)(Math.random()*10);
                            System.out.print("["+ quintos [i][j][k][l][m] + "]");
                         
                        }
                    }
                         
                }
            }
        }
       
    }
    }
    

