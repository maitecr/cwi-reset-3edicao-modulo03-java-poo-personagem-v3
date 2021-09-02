public class CriarPersonagens {

	public static void main(String[] args) {
		Knuckles knuckles = new Knuckles();
		knuckles.setNome("Knuckles");
		knuckles.coletarEsmeraldas();
		knuckles.planar();
		
		
		Sonic sonic = new Sonic();
		sonic.setNome("Sonic");
		sonic.coletarAneis();
		sonic.entrarTails();
		sonic.status();
		
		Tails tails = new Tails();
		tails.setNome("Tails");
		tails.colecJS();
		tails.colecJS();
		tails.status();
	}

}
