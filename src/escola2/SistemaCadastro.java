package escola2;


public class SistemaCadastro {
	public static void main(String[] args) {
		
		Pessoa marcos = new Pessoa("Marcos", "123");
	
		marcos.setEndereco("RUA DAS MARIAS");
	
	
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
