
package org.acbr4j.ecf.test;

import java.util.Date;

import org.acbr4j.comm.Serial;
import org.acbr4j.ecf.driver.ECFBematech;
import org.acbr4j.ecf.driver.ECFFiscNet;
import org.acbr4j.ecf.driver.STResult;


public class Teste {

	private Teste() {

		System.out.println( "teste" );
	}

	/**
	 * @param args
	 */
	@SuppressWarnings( "deprecation" )
	public static void main( final String[] args ) {

		final ECFFiscNet ecf = new ECFFiscNet( Serial.COM3 );

		Date data = new Date();
		System.out.println( "Inicio --> " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() );

		 ecf.leituraX();

		 //ecf.programaUnidadeMedida("KG");
		 //ecf.aumentaDescItem("Caneta 0123456789" );

		 STResult r= ecf.vendaItem("0000000000001", "Caneta ", "FF", 'U',1f, 0.12f,'A', 0f);
		 System.out.println(r.getMessages());

		 //ecf.vendaItemTresCasas("0000000000001", "Caneta ", "FF", 1f, 0.125f, 0f);

		 //ecf.vendaItemDepartamento("FF", 15.001f, 1f, 0.001f, 0.001f, 3, "UN", "0000000000001", "Caneta");

		 //ecf.iniciaFechamentoCupom(ECFBematech.DESCONTO_PERC,0);
		 //ecf.efetuaFormaPagamento("01",15,"to testando...");
		 //ecf.finalizaFechamentoCupom("Volte sempre!!!");
		
		//ecf.cancelaCupom();

		//ecf.leituraX();
		//ecf.reducaoZ();

		// ecf.autenticacaoDeDocumento();

		// ecf.programaFormaPagamento("Cartao Credito ");// 2
		// ecf.programaFormaPagamento("A vista ");// 3

		// ecf.comprovanteNFiscalNVinculado("SU",100,"");

		data = new Date();
		System.out.println( "Fim -----> " + data.getHours() + ":" + data.getMinutes() + ":" + data.getSeconds() );

		System.exit( 0 );
	}

}
