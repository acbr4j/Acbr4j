package org.acbr4j.ecf.test;

import org.acbr4j.ecf.app.ControllerECF;
import org.acbr4j.ecf.driver.ECFSweda;


public class SwedaTest {

	
	public static void main(String args[]){
		ControllerECF ecf = new ControllerECF("br.com.otomatix.ecf.driver.ECFSweda", "COM4");
		ecf.leituraX();
		//ECFSweda sweda = new ECFSweda("COM4");
		//sweda.leituraX();
		//sweda.reducaoZ();
		//sweda.aberturaDeCupom("101.962.688-77");
		//sweda.vendaItem("3,000", "7891203010056", "2,59", "UN", "T7,00%","PAO DE FORMA PANCO 500G");
		//sweda.efetuaFormaPagamento("1", 18.56f, "");
		//sweda.finalizaFechamentoCupom("VOLTE SEMPRE");
		//sweda.cancelaCupom();
		//sweda.resultNumeroCupom();
		//sweda.resultFormasDePagamento();
		//sweda.relatorioGerencial("Fechamento");
	}
	
}
