package org.acbr4j.lcb;

public interface LeitorCBEventos {

	 /**
     * Le os códigos que vieram da porta serial.
     */
    public void onLeCodigo(String codigoBarra);
    
    /**
     * Le os códigos que estão em uma fila.
     */
    public void onLeFila(String codigoBarra);
	
}
