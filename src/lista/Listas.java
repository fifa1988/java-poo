package lista;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		
		ArrayList<String> listaDeString = new ArrayList<String>();
		listaDeString.add("Ariel");
		listaDeString.add("Alison");
		
		for (int i = 0; i < listaDeString.size(); i++) {
			String string = listaDeString.get(i);
			System.out.println(string);
		}
		
		for (String nome : listaDeString) {
			System.out.println(nome);
		}
		
		System.out.println("----lista de inteiros----");
		
		ArrayList<Integer> listaDeInt = new ArrayList<Integer>();
		listaDeInt.add(1);
		listaDeInt.add(10);
		
		for (Integer valor : listaDeInt) {
			System.out.println(valor);
		}
	}
}
