public class Sonic extends Personagem {
	private Tails tails;

public Sonic(String nome, double altura, double velocidade) {
	super(nome, altura, velocidade);
}
	
	public void entrarTails(Tails tails) {
		this.tails = tails;
	}
	
	public void voarTails() {
		if (this.tails != null) {
			System.out.println("Está voando com Tails!");
		} else {
			System.out.println("Tails não chegou!");
		}
	}


	@Override
	public void correr() {
		this.velocidade = this.velocidade + (this.velocidade * 0.75f);		
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
