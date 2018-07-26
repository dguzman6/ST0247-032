/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2enclase;



import java.util.ArrayList;

/**
 * Clase en la cual se implementan los metodos del Taller de Clase #2
 * 
 * @author Mauricio Toro, Mateo Agudelo
 */
public class Taller2 {

	public static ArrayList<String> combinations(String s) {
            ArrayList<String> list = new ArrayList<>();
            combinations("",s,list);
            return list;
	}

	// recomendacion
	private static void combinations(String pre, String pos, ArrayList<String> list) {
		if(pos.length()==0){
                    list.add(pre);
                    //list.add(pos); se pierde la rama derecha
                }
                String temp=pre + Character.toString(pos.charAt(0));
                String tempos=pos.substring(1,pos.length());
                  
                    combinations(temp,tempos,list);
                    combinations(pre,tempos,list);
	}
        
        
	public static ArrayList<String> permutations(String s) {
		ArrayList<String> list = new ArrayList<>();
                permutations("",s,list);
                return list;
	}

	// recomendacion
	private static void permutations(String pre, String pos, ArrayList<String> list) {         
                if(pos.length()==0){
                    list.add(pre);
                    
                }
                
        }
        
       




	/*public static void imprimirTablero(int[] tablero) {
		int n = tablero.length;
		System.out.print("    ");
		for (int i = 0; i < n; ++i)
			System.out.print(i + " ");
		System.out.println("\n");
		for (int i = 0; i < n; ++i) {
			System.out.print(i + "   ");
			for (int j = 0; j < n; ++j)
				System.out.print((tablero[i] == j ? "Q" : "#") + " ");
			System.out.println();
		}
		System.out.println();
	}

	public static boolean esValido(int[] tablero) {
		// complete...
	}

	public static int queens(int n) {
		// complete...
	}*/

}
