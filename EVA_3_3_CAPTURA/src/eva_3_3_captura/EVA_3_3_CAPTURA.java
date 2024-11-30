/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_3_captura;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA_3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = capturarTexto("Introduce tu nombre:");
        String apellido = capturarTexto("Introduce tu apellido:");
        int edad = capturarEnteros("Introduce tu edad:");
        double salario  = capturarDoubles("introduce tu salario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("edad: " + edad);
        System.out.println("Salario " + salario);
    }
    //CAPTURAR TEXTO
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;  
    }
    //METODOS DE CAPTURA ENTEROS (LO USAREMOS PARA LA EDAD)
    public static int capturarEnteros(String mensaje){
        Scanner captu = new Scanner(System.in);
        int valor = captu.nextInt();
        System.out.println(mensaje);
        return valor;
    }    
    //METODOS DE CAPTURAR DOUBLES (CAPTURAR EL SALARIO)
    public static int capturarEnteros(String mensaje){
        Scanner captu = new Scanner (System. in);
        System.out.println(mensaje);
        int valor = captu.nextInt();
        return valor;
    
    }

}
    

