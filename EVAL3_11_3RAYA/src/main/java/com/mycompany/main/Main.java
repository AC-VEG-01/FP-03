/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author angel
 */

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char jugadorActual = 'X';
        char[][] tablero = new char[3][3];
        boolean juego = true;

       
        for (int i = 0; i < 3; i++) {
            Arrays.fill(tablero[i], ' ');
        }

     
        iniciarJuego(tablero, jugadorActual, sc);
    }

    public static void imprimirtablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
            if (i < 2) {
                System.out.println("------------");
            }
        }
    }

  
    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
       
        return true;
    }

    
    public static boolean buscarGanador(char[][] tablero, char jugadorActual) {
        for (int i = 0; i < 3; i++) {
          
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual)
                return true;
            
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)
                return true;
        }

        return (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual);
    }

   
    public static boolean jugadaCorrecta(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3;
    }

   
    public static boolean posicionVacia(char[][] tablero, int fila, int columna) {
        return tablero[fila][columna] == ' ';
    }

    
    public static void iniciarJuego(char[][] tablero, char jugadorActual, Scanner sc) {
        boolean juego = true;

        do {
         
            System.out.println("3 en raya");
            imprimirtablero(tablero);

            System.out.println("Jugador " + jugadorActual + ", ingresa la fila (0-2):");
            int fila = sc.nextInt();
            System.out.println("Jugador " + jugadorActual + ", ingresa la columna (0-2):");
            int columna = sc.nextInt();

        
            if (!jugadaCorrecta(tablero, fila, columna)) {
                System.out.println("Posición no válida. Debe ser entre 0 y 2.");
                continue;
            }

            
            if (!posicionVacia(tablero, fila, columna)) {
                System.out.println("Posición ocupada. Elige otra.");
                continue;
            }

         
            tablero[fila][columna] = jugadorActual;

            if (buscarGanador(tablero, jugadorActual)) {
           
                imprimirtablero(tablero);
                System.out.println("");
                     System.out.println("El jugador " + jugadorActual + " ha ganado!");
                juego = false;
            }
     
            else if (tableroLleno(tablero)) {
              
                imprimirtablero(tablero);
                  System.out.println("");
                  System.out.println("Empate!.");
                juego = false;
            }

            
            if (juego) {
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }

        } while (juego);
    }
}

