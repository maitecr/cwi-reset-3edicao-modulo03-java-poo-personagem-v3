
public abstract class Personagem {
	protected String nome;
	protected double altura;
	private int estamina;
	private int qtdMoedas;
	private int qtdVidas;
	protected double velocidade;

	//Método Construtor
	public Personagem(String nome, double altura, double velocidade) {
		this.nome = nome;
		this.altura = altura;
		this.velocidade = velocidade;
		this.estamina = 100;
		this.qtdMoedas = 0;
		this.qtdVidas = 1;
	}
	
	public abstract void correr();
	public abstract void saltar();
	public abstract void obstaculo(double obstaculo);
	
	//Métodos getters
	private String getNome() {
		return this.nome;
	}
	
	private int getEstamina() {
		return this.estamina;
	}
	
	public double getVelocidade() {
		return this.velocidade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	
	//Métodos setters	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setEstamina(int estamina) {
		this.estamina = estamina;
	}
	
	public void setVelocidade(double vel)  {
		this.velocidade = vel;
	}
	
	public void getAltura(double altura) {
		this.altura = altura;
	}
		

	//Métodos Abstratos
	public void status() {
		System.out.println("-----------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Altura: " + this.getAltura() );
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
