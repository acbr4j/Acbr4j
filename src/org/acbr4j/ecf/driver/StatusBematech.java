
package org.acbr4j.ecf.driver;

public class StatusBematech implements Status {

	public static StatusBematech BEMA_FIM_DE_PAPEL = new StatusBematech( 200, RELEVANC_ERRO, "Fim de papel." );

	public static StatusBematech BEMA_POUCO_PAPEL = new StatusBematech( 201, RELEVANC_ERRO, "Pouco papel." );

	public static StatusBematech BEMA_RELOGIO_ERROR = new StatusBematech( 203, RELEVANC_ERRO, "Erro no rel�gio." );

	public static StatusBematech BEMA_IMPRESSORA_EM_ERRO = new StatusBematech( 204, RELEVANC_ERRO, "Impressora em erro." );

	public static StatusBematech BEMA_NO_ESC = new StatusBematech( 205, RELEVANC_ERRO, "Primeiro dado do comando n�o foi ESC." );

	public static StatusBematech BEMA_NO_COMMAND = new StatusBematech( 206, RELEVANC_ERRO, "Comando inexistente." );

	public static StatusBematech BEMA_CUPOM_FISCAL_ABERTO = new StatusBematech( 207, RELEVANC_ERRO, "Cupom fiscal aberto." );

	public static StatusBematech BEMA_NU_PARAMS_INVALIDO = new StatusBematech( 208, RELEVANC_ERRO, "N�mero de par�metro de CMD inv�lido." );

	public static StatusBematech BEMA_TP_PARAM_INVALIDO = new StatusBematech( 209, RELEVANC_ERRO, "Tipo de par�metro de CMD inv�lido." );

	public static StatusBematech BEMA_OUT_OF_MEMORY = new StatusBematech( 210, RELEVANC_ERRO, "Mem�ria fiscal lotada." );

	public static StatusBematech BEMA_MEMORY_ERROR = new StatusBematech( 211, RELEVANC_ERRO, "Erro na mem�ria RAM CMOS n�o vol�til." );

	public static StatusBematech BEMA_NO_ALIQUOTA = new StatusBematech( 212, RELEVANC_ERRO, "Al�quota n�o programada." );

	public static StatusBematech BEMA_OUT_OF_ALIQUOTA = new StatusBematech( 213, RELEVANC_ERRO, "Capacidade de al�quotas esgotada." );

	public static StatusBematech BEMA_NO_ACESESS_CANCELAMENTO = new StatusBematech( 214, RELEVANC_ERRO, "Cancelamento n�o permitido." );

	public static StatusBematech BEMA_NO_CNPJ_IE = new StatusBematech( 215, RELEVANC_ERRO, "CNPJ/IE do propriet�rio n�o programados." );

	public static StatusBematech BEMA_COMMAND_NO_EXECUTE = new StatusBematech( 216, RELEVANC_ERRO, "Comando n�o executado." );

	public static StatusBematech BEMA_ERRO_COMUNICACAO = new StatusBematech( 0, RELEVANC_ERRO, "Erro de comunica��o f�sica." );

	public static StatusBematech BEMA_PARAMETRO_INVALIDO = new StatusBematech( -2, RELEVANC_ERRO, "Par�metro inv�lido na fun��o." );

	public static StatusBematech BEMA_ALIQUOTA_NAO_PROGRAMADA = new StatusBematech( -3, RELEVANC_ERRO, "Aliquota n�o programada." );

	public static StatusBematech BEMA_ARQ_INI_NAO_ENCONTRADO = new StatusBematech( -4, RELEVANC_ERRO, "O arquivo de inicializa��o n�o encontrado." );

	public static StatusBematech BEMA_ERRO_ABRIR_PORTA = new StatusBematech( -5, RELEVANC_ERRO, "Erro ao abrir a porta de comunica��o." );

	public static StatusBematech BEMA_ERRO_GRAVAR_RETORNO = new StatusBematech( -8, RELEVANC_ERRO, "Erro ao criar ou gravar no arquivo STATUS.TXT ou RETORNO.TXT" );

	public static StatusBematech BEMA_NAO_STATUS_600 = new StatusBematech( -27, RELEVANC_ERRO, "Status da impressora diferente de 6,0,0 (ACK, ST1 e ST2)" );

	public static StatusBematech BEMA_FUNCAO_NAO_COMPATIVEL = new StatusBematech( -30, RELEVANC_ERRO, "Fun��o n�o compat�vel com a impressora YANCO" );

	public static StatusBematech BEMA_FORMA_PAGAMENTO_NAO_FINALIZADA = new StatusBematech( -31, RELEVANC_ERRO, "Forma de pagamento n�o finalizada" );

	private String message;

	private int code;

	private int relevanc;
	

	public StatusBematech( int code, int relevanc, String message ) {

		this.code = code;
		this.relevanc = relevanc;
		this.message = message;
	}

	public void setCode( int code ) {
	
		this.code = code;
	}
	
	public int getCode() {

		return code;
	}

	public void setMessage( String message ) {
	
		this.message = message;
	}

	public String getMessage() {

		return message;
	}

	public void setRelevanc( int relevanc ) {
	
		this.relevanc = relevanc;
	}

	public int getRelevanc() {

		return relevanc;
	}
}
