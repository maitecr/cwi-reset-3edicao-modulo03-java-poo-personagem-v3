
public class CriarPersonagens {

	public static void main(String[] args) {
		Tails tails = new Tails("Tails", 0.98, 40.0);
		Knuckles knuckles = new Knuckles("Knuckles", 1.2, 60.0);
		Sonic sonic = new Sonic("Sonic", 1.1, 80.0);
		
		tails.saltar();
		sonic.saltar();
		knuckles.saltar();
		
		tails.obstaculo(1.2);
		sonic.obstaculo(2.3);
		knuckles.obstaculo(0.98);
		
		
		sonic.status();
		sonic.correr();
		sonic.status();
		sonic.entrarTails(tails);
		sonic.voarTails();
		sonic.entrarTails(null);
		sonic.voarTails();	
		
	}

}
