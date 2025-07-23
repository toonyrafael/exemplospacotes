package escola;

public class Escola {
	public static void main(String[] args) {
			Aluno felipe = new Aluno();
			felipe.setNome("Felipe");
			felipe.setIdade(18);

			Aluno jose = new Aluno();
			jose.setNome("José");
			jose.setIdade(20);

			System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
			System.out.println("O aluno " + jose.getNome() + " tem " + jose.getIdade() + " anos.");
		 
	}
}
