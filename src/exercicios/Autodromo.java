package exercicios;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("234234234");
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("4234234");
		//z400.ligar();
		
		Veiculo coringa = jeep;
		
		coringa.ligar();
	}
}
