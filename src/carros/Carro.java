package carros;

public class Carro {
	private String nome;
	private Boolean ligado;
	private Boolean destruido;
	private int blindagem;
	private Boolean armamento;
		
	public Carro (String nome) {
		this.nome = nome;
		this.ligado = false;
		this.destruido = false;
		this.blindagem = 0;
		this.armamento = false;
	}

	public Boolean getLigado() {
		return ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

	public Boolean getDestruido() {
		return destruido;
	}

	//public void setDestruido(Boolean destruido) {
		//this.destruido = destruido;
	//}

	public String getNome() {
		return nome;
	}

	public int getBlindagem() {
		return blindagem;
	}

	public void setBlindagem(int blindagem) {
		this.blindagem = blindagem;
	}

	public Boolean getArmamento() {
		return armamento;
	}
		
	public void setArmamento(Boolean armamento) {
		this.armamento = armamento;
	}

	public void sofrerDano(int dano) {
		this.blindagem -= dano;
		if (this.blindagem <= 0) {
			this.blindagem = 0;
			this.ligado = false;
			this.destruido = true;
		}
	}
	public void info() {
		System.out.println("--------------------------------");
		System.out.printf("Nome........:%s\n", this.nome);
		System.out.printf("Ligado......:%s\n", this.ligado ? "Sim" : "N�o");
		System.out.printf("Destruido...:%s\n", this.destruido ? "Sim" : "N�o");
		System.out.printf("Blindagem...:%d\n", this.blindagem);
		System.out.printf("Armamento...:%s\n", this.armamento ? "Sim" : "N�o");
	}
		

}
