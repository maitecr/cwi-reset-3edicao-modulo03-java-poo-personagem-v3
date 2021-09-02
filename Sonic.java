public class Sonic extends Personagem {
	private int anel;
	private String tails = "Tails";
	
	public void coletarAneis() {
		this.anel++;
		if (this.anel % 2 == 0) {
			this.setVelocidade(this.velocidade * 5);
		}
	}
	
	public void entrarTails() {
		if (this.anel >= 10) {
			System.out.println(this.tails +" veio em sua ajuda e você pode voar com ele por 1min!");
		}
	}
	
	public int getAnel() {
		return this.anel;
	}
	
	public void setAnel() {
		this.anel = anel;
	}
	
}
