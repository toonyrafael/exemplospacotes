package exemplosinterfaces.equipamentos.multifuncional;

import exemplosinterfaces.equipamentos.copiadora.Copiadora;
import exemplosinterfaces.equipamentos.digitalizadora.Digitalizadora;
import exemplosinterfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora  {

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO PELA MULTIFUNCIONAL");
		
	}

	@Override
	public void copiar() {
		System.out.println("COPIANDO PELA MULTIFUNCIONAL");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO PELA MULTIFUNCIONAL");
		
	}
	

}
