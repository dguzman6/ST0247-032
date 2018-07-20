/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafolista;
import java.util.ArrayList;
/**
 *
 * @author dguzman6
 */
public class Grafo {
    private int tamanio;
    private ArrayList<ArrayList<Integer>> lista;
    
    public Grafo(int tamanio){ 
        this.lista = new ArrayList<>();
                this.tamanio=tamanio;
                lista=new ArrayList<>();
                defaultlist();
        }
    
    ArrayList<Integer> temp = new ArrayList<Integer>();
    
    private void defaultlist(){
        for(int i=0;i<tamanio;i++){
        lista.add(i, temp);
        }
    }
    
    
    
    
    public void setArco(int fila){
        lista.add(fila,temp);
        temp.clear();
        
    }
    
    public void setTemp(int i){
        temp.add(i);
    }
    
    public void imprimirLista(){
        String impresion="";
        for(int i=0;i<=lista.size();i++){
            for(int j=0;j<=lista.get(i).size();j++){
                System.out.println(lista.size());
                System.out.println(lista.get(i).size());
                impresion+=lista.get(i).get(j)+"  ";
            }
            impresion+="\n";
        }
    }
        
}
    
    
    
    
    
         


