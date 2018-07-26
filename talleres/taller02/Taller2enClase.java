/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2enclase;

import java.util.ArrayList;

/**
 *
 * @author dguzm
 */
public class Taller2enClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Taller2 t = new Taller2();
        ArrayList<String> list = new ArrayList<>();
        //ejecucion punto 1
        list=t.combinations("hola");
        
        System.out.print(list.toString());
    }
    
}
