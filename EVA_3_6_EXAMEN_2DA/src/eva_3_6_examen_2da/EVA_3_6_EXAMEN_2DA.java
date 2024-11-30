/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_6_examen_2da;

/**
 *
 * @author herna
 */
public class EVA_3_6_EXAMEN_2DA {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERAS = 3;
        
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        int jugadaUsu;
        int jugadaComp;
        int resuJuegada;
        do{
            juegadaUsu = capturaJugada("Intoduce tu jugada (1-PIEDRA, 2-PAPEL, 3-TIJERAS, 0-SALIR):"O);{
            jugadaComp = generarJugadaComp();
            resuJugada = evaluarJugadas(jugadaUsu, jugadaComp);
       }while(jugadaUsu != 0);//mientras no quiera salir (opcion 0)
       
    }
    //PEDIR LOS DATOS AL USUARIO
    public static int capturarJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captu.nextInt();
        return resu;                
    }
    //GENERAR JUGADA DE LA COMPUTADORA
    public static int generarJugadaComp(){
        int resu;
        double valor = Math.random();
        if((valor >= o) && (valor < 0.3))
            resu = 1; //PIERDA
        else if((valor >= 0.3) && (valor < 0.6))
            resu = 2;//PAPEL
        else
            resu = 3;//TIJERA
        return resu;
    }
    
    //EVALUAR JUGADAS: 0-EMPATE, 1-GANO, 2-PERDIO
    public static int evaluarJugadas(int jugadaU, int jugada){
        //9 POSIBLES COMBINACIONES
        int resu;
        if((jugadaU == PIERDA) && (jugada == PIEDRA))
            resu = EMPATE;
        else if((jugadaU == PIEDRA) && (jugadaC == PAPEL))
            resu = PIERDE;
        else if((jugadaU == PIEDRA) && (jugadaC == TIJERA))
            resu = GANA;
        else if((jugadaU == PAPEL) && (jugadaC == PIEDRA))
            resu = GANA;
        else if((jugadaU == PAPEL) && (jugadaC == PAPEL))
            resu = EMPATE;
        else if((jugadaU == PAPEL) && (jugadaC == TIJERA))
            resu = PIERDE;
        else if((jugadaU == TIJERA) && (jugadaC == PIEDRA))
            resu = PIERDE;
        else if((jugadaU == TIJERA) && (jugadaC == PAPEL))
            resu = GANA;
        else
            resu = EMPATE;
        return resu;
    }
}
