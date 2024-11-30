/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_2_valor_retorno;

/**
 *
 * @author herna
 */
public class EVA_3_2_Valor_Retorno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NECESITAMOS RECUPERAR EL VALOR, PARA HACER ALGO CON EL.
        int resu;
        resu = sumarDosNumeros(5, 10);
        System.out.println("Resultado = " + resu);
        //segundo alternativa, solo lo necesitas una vez
        System.out.println("resultado= " + sumarDosNumeros(100,200));
        
        //NO LES INTERESA EL RESULTADO
         sumarDosNumeros(100, 200);//EL RESULTADO DE SE PIERDE
    }
    
    public static int sumarDosNumeros(int num1, int num2){
        //si es int siempre se agrega return
        int suma;
        suma = num1 + num2;
        return suma;
    } 
    
}
