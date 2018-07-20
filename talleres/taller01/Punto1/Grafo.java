/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafomatriz;
/**
 *
 * @author dguzman6
 */
public class Grafo {
    private int tamanio;
    private int matriz[][];
    
    public Grafo(int tamanio){ 
                this.tamanio=tamanio;
                matriz=new int[tamanio][tamanio]; 
        }
    
    public void setArco(int fila, int columna){
        matriz[fila][columna]=1;
    }
    
    public void imprimirMatriz(){
        String impresion="";
        for(int i=0;i<matriz.length;i++){
            matriz[i][i]=1;
            for(int j=0;j<matriz.length;j++){
                impresion+=matriz[i][j]+"  ";
            }
            impresion+="\n";
        }
        System.out.print(impresion);
    }
    
}