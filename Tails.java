public class Tails extends Personagem {
	private int jetshoes = 0;
	
public Tails (String nome, double altura, double velocidade) {
	super(nome, altura, velocidade);
}
	
	public void colecJS() {
		this.jetshoes++;
		if (this.jetshoes % 2 == 0) {
			this.velocidade = this.velocidade * 2.0f;
			System.out.println("Agora, " + this.nome + " aumentou sua velocidade e pode voar!");
		}
	}

	@Override
	public void correr() {
		this.velocidade = this.velocidade + (this.velocidade * 0.10f);
	}
	
	@Override
	public void saltar() {
		System.out.println(this.nome + " está saltando " + this.altura * 0.5);
	}
	
	
	@Override
	public void obstaculo(double obstaculo) {
		System.out.println("Altura do obstáculo: " + obstaculo);
		System.out.println(this.nome + " pulou uma altura de " + obstaculo * 1.5);
	}
	
}
