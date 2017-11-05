package br.com.bankteste.Convert;

import br.com.bankteste.entity.Relogio;
import br.com.bankteste.entity.RelogioPK;

public class RelogioConvert {
	
public static Relogio convertToEntity(int horas, int minuto) {
	
	Relogio relogio = new Relogio();
	RelogioPK relogioPK = new RelogioPK(horas,minuto);
	relogio.setIdentificador(relogioPK);
	
	return relogio;
}
}
