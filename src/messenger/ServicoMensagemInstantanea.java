package messenger;

public class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem");
		salvarHistoricoMensagem();
		
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem");
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
