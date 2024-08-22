/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vasquez_mario_biarrayy;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Vasquez_Mario_BiArrayy{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        int matriz[][];
        int sumadiagonalprincipal=0;
        int sumadiagonalsecundaria=0;

        int numerofilas, numerocolumnas;

        System.out.println("Ingrese filas: ");
        numerofilas = lea.nextInt();
      

        matriz = new int[numerofilas][numerofilas];

        for (int fila = 0; fila < numerofilas; fila++) {
            for (int filas = 0; filas < numerofilas; filas++) {
                matriz[fila][filas] = 10 + random.nextInt(99);

            }

        }

        System.out.println("\n La matriz es: ");
          for (int fila = 0; fila < numerofilas; fila++) {
            for (int filas = 0; filas < numerofilas; filas++) {
                System.out.print("["+matriz[fila][filas]+"]");

            }
            System.out.println(" ");

        }
          for(int suma=0;suma<numerofilas;suma++){
              sumadiagonalprincipal += matriz [suma][suma];
              sumadiagonalsecundaria += matriz[suma][numerofilas - 1-suma];
              
          }
          System.out.println("Suma  diagonal principal: " + sumadiagonalprincipal);
        System.out.println("Suma diagonal secundaria: " + sumadiagonalsecundaria);

    }

}
