/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_5_metodos_arreglos;

/**
 *
 * @author herna
 */
public class EVA_3_5_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemanas[] = {"lunes", "Martes" ,"Miercoles",
                               "jueves", "Viernes", "Sabado", "domingo"};
        imprimirArreglo(diasSemanas);
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", 
                        "junio", "junio", "Agosto", "Septiembre",
                        "Octrubre", "Noviembre", "diciembre"};
        imprimirArreglo(meses);
        int Billetes[] = {20,50,100,200,500,1000};
        imprimirBilletes(Billetes);
    }
    
    //imprimir arreglo de cadenas
    public static void imprimirArreglo(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
    }
    public static void imprimirBilletes(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++)
            System.out.println(arreglo[i]);
    }
}
