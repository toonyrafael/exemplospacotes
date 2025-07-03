package exemplosinterfaces.estabelecimento;

import exemplosinterfaces.equipamentos.copiadora.Copiadora;
import exemplosinterfaces.equipamentos.digitalizadora.Digitalizadora;
import exemplosinterfaces.equipamentos.impressora.Deskjet;
import exemplosinterfaces.equipamentos.impressora.Impressora;
import exemplosinterfaces.equipamentos.impressora.Laserjet;
import exemplosinterfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
