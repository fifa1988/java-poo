package entradaDadosUsuario;

import java.util.Scanner;

public class CapturaDeDadosUsuario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(CapturaDeDadosUsuario.calculo(2, 2));
		
		String nome = scanner.next();
		System.out.println("Escreva s ou n para imprimir o nome");
		System.out.println("O nome do usuario e:" + nome);
		int usuarioId = scanner.nextInt();
		System.out.println("O id do usuario e :" + usuarioId);
		float valor = scanner.nextFloat(); // Digitar virgula em vez de ponto ex: 10,5
		float valor2 = 10.5f;
		double valorDouble = scanner.nextDouble(); // Digitar virgula em vez de ponto ex: 10,5
		double valorDouble2 = 10.3;
		System.out.println("O valpera"
				+ "or :" + valor);
		boolean verdadeiroFalso = scanner.nextBoolean(); // true ou false
		System.out.println("O condicao verdadeira ou falsa :" + verdadeiroFalso);
	}
	
	
	public static int calculo(int val, int val2) {
		return val+val2;
	}

}
