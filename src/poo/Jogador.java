package poo;

public class Jogador {
	private String nome;
	private String time;
	private int numeroDaCamisa;
	private String posicao;
	
	// Tipo de visualizações
	// public - publico - visual a todos
	// private - privado - visivel apenas para propria class
	// protected - protegido - visivel para o mesmo pacote
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTime() {
		return time;
	}
	
	public int getNumeroDaCamisa() {
		return numeroDaCamisa;
	}
	
	public void setNumeroDaCamisa(int numeroDaCamisa) {
		this.numeroDaCamisa = numeroDaCamisa;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	public String getPosicao() {
		return posicao;
	}
	
}
