package org.acbr4j.lcb;

public interface LeitorCBEventos {

	 /**
     * Le os c�digos que vieram da porta serial.
     */
    public void onLeCodigo(String codigoBarra);
    
    /**
     * Le os c�digos que est�o em uma fila.
     */
    public void onLeFila(String codigoBarra);
	
}
