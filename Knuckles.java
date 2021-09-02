public class Knuckles extends Personagem {
		private int esmeralda = 0;
		

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
}
