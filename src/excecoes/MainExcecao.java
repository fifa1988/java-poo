package excecoes;

import poo.Jogador;

public class MainExcecao {
	public static void main(String[] args) {
		try {
			Jogador jogador = new Jogador();
			if(jogador == null) {
				throw new NullPointerException("O objeto est� nulo");
			}
			if(jogador.getNome() == null) {
				throw new ValidaNomeException("Nome do jogado est� nulo");
			}
			throw new Exception("Erro geral");
		} catch (ValidaNomeException e) {
			System.out.println("Mensagem de erro: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Ocorreu um erro nullPointException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro geral: " + e);
		} finally {
			System.out.println("Aqui � execu��o final do try catch");
			System.out.println("Finalizando o sistema");
		}	
	}
}
