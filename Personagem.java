public abstract class Personagem {
	protected String nome;
	private int estamina;
	private int qtdMoedas;
	private int qtdVidas;
	protected int velocidade;

	//Método Construtor
	public Personagem() {
		this.estamina = 100;
		this.qtdMoedas = 0;
		this.qtdVidas = 1;
		this.velocidade = 10;
	}
	
	//Métodos getters
	private String getNome() {
		return this.nome;
	}
	
	private int getEstamina() {
		return this.estamina;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	
	//Métodos setters	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setEstamina(int estamina) {
		this.estamina = estamina;
	}
	
	public void setVelocidade(int vel)  {
		this.velocidade = vel;
	}
		

	//Métodos Abstratos
	public void status() {
		System.out.println("-----------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Estamina: " + this.getEstamina());
		System.out.println("Vida: " + this.qtdVidas);
		System.out.println("Moedas: " + this.qtdMoedas);
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("-----------------------");
	}

	public void perderEstamina() {
		this.estamina = this.estamina - 10;
		if (this.estamina < 0) {
			this.estamina = 0;
		}
	}
	
	public void ganharEstamina() {
		this.estamina = this.estamina + 5;
		if (this.estamina > 100) {
			this.estamina = 100;
		}
	}
	
	public void coletarMoedas() {
		this.qtdMoedas++;
		if (this.qtdMoedas % 10 == 0) {
			this.qtdVidas++;
		}
	}
	
	public void revigorar() {
		this.estamina = 100;
	}
	
	public void morrer() {
		this.estamina = 0;
		this.qtdVidas -= 1;
		if (this.qtdVidas < 0) {
			this.qtdVidas = 0;
		} else {
			this.revigorar();
		}
	}

}
