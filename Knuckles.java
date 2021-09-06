public class Knuckles extends Personagem {
		private int esmeralda = 0;
		
public Knuckles (String nome, double altura, double velocidade) {
	super(nome, altura, velocidade);
}

		public void coletarEsmeraldas() {
			this.esmeralda++;
		}
		
		public void planar() {
			if (this.esmeralda >= 7) {
				System.out.println("Knuckles está planando!");
			} else {
				System.out.println("Não coletou esmeraldas o suficiente!");
			}
		}
		
		public int getEsmeralda() {
			return this.esmeralda;
		}
		
		public void setEsmeralda(int esmeralda) {
			this.esmeralda = esmeralda;
		}


		@Override
		public void correr() {
			this.velocidade = this.velocidade + (this.velocidade * 0.50f);		
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
