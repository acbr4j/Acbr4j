package org.acbr4j.lcb.test;

import org.acbr4j.lcb.LeitorCB;
import org.acbr4j.lcb.LeitorCBEventos;

public class LcbTest implements LeitorCBEventos {

	public static void main(String[] args){
		LcbTest lcb= new LcbTest();
		
		LeitorCB leitorCB = new LeitorCB();
		leitorCB.setEventos(lcb);
		leitorCB.ativar("COM3");
		leitorCB.isUsarFila();
		leitorCB.setSufixo("\r");
		System.out.println("FIM");	
	}

	@Override
	public void onLeCodigo(String codigoBarra) {
		// TODO Auto-generated method stub
		System.out.println("DIRETO: "+codigoBarra);
		
	}

	@Override
	public void onLeFila(String codigoBarra) {
		// TODO Auto-generated method stub
		System.out.println("FILA: "+codigoBarra);
		
	}
	
}

