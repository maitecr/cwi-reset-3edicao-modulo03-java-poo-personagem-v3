public class Tails extends Personagem {
	private int jetshoes = 0;
	
	public void colecJS() {
		this.jetshoes++;
		if (this.jetshoes % 2 == 0) {
			this.setVelocidade(this.velocidade * 2);
			System.out.println("Agora, " + this.nome + " aumentou sua velocidade e pode voar!");
		}
	}
}
