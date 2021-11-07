package lista;

public class Vetor {

	public static void main(String[] args) {
		
		String[] listaDeNomes = new String[5];
		
		listaDeNomes[0] = "Ariel";
		
		listaDeNomes[4] = "Alison";
		
		listaDeNomes[2] = "Rafael";
		
		listaDeNomes[1] = "Carol";
		
		listaDeNomes[3] = "July";		
		
		
		for (int i = 0; i < listaDeNomes.length; i++) {
			String valor = listaDeNomes[i];
			System.out.println(valor);			
		}
		
		System.out.println("------------");
		
		for (String valor : listaDeNomes) {
			System.out.println(valor);	
		}
		
		System.out.println("------INTEIROS------");
		
		int[] listaDeNumero = new int[3];
		
		listaDeNumero[0] = 10;
		
		listaDeNumero[1] = 20;
		
		listaDeNumero[2] = 30;
		
		for (int i = 0; i < listaDeNumero.length; i++) {
			int valor = listaDeNumero[i];
			System.out.println(valor);			
		}
		
		System.out.println("------------");
		
		for (int valor : listaDeNumero) {
			System.out.println(valor);	
		}

	}

}
