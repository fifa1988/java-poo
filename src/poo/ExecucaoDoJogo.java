package poo;

public class ExecucaoDoJogo {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		
		jogador.setNome("Alison");
		jogador.setNumeroDaCamisa(10);
		jogador.setPosicao("meia");
		jogador.setTime("Vasco");		
		
		System.out.println(jogador.getNome());
		System.out.println(jogador.getNumeroDaCamisa());
		System.out.println(jogador.getPosicao());
		System.out.println(jogador.getTime());
		
	}

}
