package org.acbr4j.lcb;



import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

import java.util.ArrayList;
import java.util.List;

import org.acbr4j.comm.AbstractPort;
import org.acbr4j.comm.CtrlPort;
import org.acbr4j.comm.SerialParams;



public class LeitorCB implements SerialPortEventListener{
	
	private int intervalo = 0;
	private boolean usarFila = false;
	private int filaMaxItens = 100;
	private String ultimoCodigo = "";
	private String ultimaLeitura = "";
	private String prefixoAExcluir = "";
	private String sufixo = "";
	private String sufixoAExcluir = "";
	private List<String> fila =  new ArrayList<String>();
	
	private AbstractPort port = null;
	private LeitorCBEventos eventos = null;
	private SerialParams serialParams = new SerialParams();

	public LeitorCB(){
		super();
		defaultValues();
	}
	
	public LeitorCB(final int com){
		this(AbstractPort.convPorta(com));
	}
	
	public LeitorCB(final String com){
		super();
		ativar(com);
		defaultValues();
	}
	
    private void defaultValues() {
        this.prefixoAExcluir = "";
        this.sufixo = "";
        this.sufixoAExcluir = "";
        this.filaMaxItens = 100;
        this.intervalo = 200;
    }
	
	public boolean isUsarFila() {
		return usarFila;
	}

	public int getFilaMaxItens() {
		return filaMaxItens;
	}

	public void setFilaMaxItens(int filaMaxItens) {
		this.filaMaxItens = filaMaxItens;
	}

	public String getUltimoCodigo() {
		return ultimoCodigo;
	}

	public String getUltimaLeitura() {
		return ultimaLeitura;
	}

	public void setUltimaLeitura(String ultimaLeitura) {
		this.ultimaLeitura = ultimaLeitura;
	}

	public String getPrefixoAExcluir() {
		return prefixoAExcluir;
	}

	public void setPrefixoAExcluir(String prefixoAExcluir) {
		this.prefixoAExcluir = prefixoAExcluir;
	}

	public String getSufixo() {
		return sufixo;
	}

	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}

	public String getSufixoAExcluir() {
		return sufixoAExcluir;
	}

	public void setSufixoAExcluir(String sufixoAExcluir) {
		this.sufixoAExcluir = sufixoAExcluir;
	}

	public LeitorCBEventos getEventos() {
		return eventos;
	}

	public void setEventos(LeitorCBEventos eventos) {
		this.eventos = eventos;
	}

	public SerialParams getSerialParams() {
		return serialParams;
	}

	public void setSerialParams(SerialParams serialParams) {
		this.serialParams = serialParams;
	}
	
	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}
	
    public List<String> getFila() {
		return fila;
	}
	
    
	public boolean ativar( final String portstr) {
		return ativar( AbstractPort.convPorta( portstr ));	
	}
    


	public boolean ativar( final int com ) {
		boolean result = CtrlPort.getInstance().isActive();
		if ( !result ) {
			result = CtrlPort.getInstance().activePort( com, serialParams, this );
		}

		return result;
	}
	
	public void setUsarFila(boolean usarFila) {
		if(usarFila){
			if(sufixo == null || sufixo.equals("") )
				throw new IllegalArgumentException("É necessário definir um Sufixo " +
                "para manipular Filas. Exemplo: \\r");
			
			fila = new ArrayList<String>();
			if(filaMaxItens == 0)
				filaMaxItens = 100;
		}else
			fila = null;
		
		this.usarFila = usarFila;
	}
	
	public void setUltimoCodigo(String ultimoCodigo) {
		this.ultimoCodigo = ultimoCodigo;
        
        if ((prefixoAExcluir != null) && (prefixoAExcluir.length() > 0)){
            if(this.ultimoCodigo.startsWith(prefixoAExcluir)){
                this.ultimoCodigo = this.ultimoCodigo.substring(prefixoAExcluir.length(),this.ultimoCodigo.length());
            }
        }
        
        if ((sufixoAExcluir != null) && (sufixoAExcluir.length() > 0)){
            if(ultimoCodigo.endsWith(sufixoAExcluir)){
                int pos = this.ultimoCodigo.indexOf(sufixoAExcluir);
                this.ultimoCodigo = this.ultimoCodigo.substring(0, pos);
            }
        }
	}
	
	public void serialEvent(SerialPortEvent portEvent) {
        switch (portEvent.getEventType()) {
            case SerialPortEvent.DATA_AVAILABLE:
            	 int newData = 0;
                 int excluir = 0;
                 StringBuffer inputBuffer = new StringBuffer();
                 while (newData != -1) {
                	 try {
    					newData = CtrlPort.getInstance().getInput().read();
                         if (newData == -1) 
                             break;
                         if ((getSufixo().length() > 0) &&
                                 (getSufixo().charAt(0) == (char) newData)) {
                             excluir = getSufixo().length() - 1;
                             inputBuffer.append(getSufixo());
                             leSerial(new String(inputBuffer));
                             inputBuffer.delete(0,inputBuffer.length());
                             
                         } else {
                             
                             if (excluir > 0) {
                                 --excluir;
                             } else {
                                 inputBuffer.append((char) newData);
                             }
                         }
                	 } catch (Exception e) {
 						// TODO Auto-generated catch block
 						e.printStackTrace();
 					}
                 }
                 if (inputBuffer.length() > 0)
                     leSerial(new String(inputBuffer));
                 
              break;
        }
	}
        
    private void leSerial(String dado){
    	setUltimaLeitura(dado);
            
    	if (isUsarFila())
    		addFila(dado);
            
    	if (getEventos() != null) {
    		setUltimoCodigo(dado);
    		eventos.onLeCodigo(getUltimoCodigo());
    	}
	}
    
    public void addFila(String dado){
        if (fila.size() == getFilaMaxItens()){
            fila.remove(0);
        }
        fila.add(dado);
    }
    
    public String lerFila(){
        String leitura = null;
        
        if (getFila().size() > 0){
            leitura = (String) getFila().get(0);
            getFila().remove(0);
            
            this.ultimoCodigo = leitura;
            
            if (eventos != null)
                eventos.onLeFila(getUltimoCodigo());
        }
        return leitura;
    }
    
}
