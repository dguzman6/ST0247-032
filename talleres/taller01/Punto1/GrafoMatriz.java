/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafomatriz;
import java.util.Scanner;
/**
 *
 * @author dguzman6
 */
public class GrafoMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de nodos");
        int tamanio;
        do{
        tamanio = sc.nextInt();
        }while(tamanio<1);
        Grafo grafo = new Grafo(tamanio);
        int bandera=0;
        int conexion;
        int temp;
                
            for(int i=0;i<tamanio;i++){
            temp=i+1;
            System.out.println("El nodo nro "+temp+" tiene aristas? 1.Si   Otro.NO");
            bandera = sc.nextInt();
            while(bandera==1){
                System.out.println("Con que nodo (maximo "+tamanio+")");
                do{
                conexion=sc.nextInt();
                }while(conexion<0||conexion>tamanio);
                conexion-=1;
                grafo.setArco(i, conexion);
                System.out.println("Contiene otra conexion? 1.Si   Otro.NO");
                bandera=sc.nextInt();
            }
            System.out.println("conexion(es) con el nodo completadas");
        }
        System.out.println("Creacion Completa");
        //impresion de la matriz
        System.out.println("Esta es la matriz resultante");
        grafo.imprimirMatriz();
    }
    
}
