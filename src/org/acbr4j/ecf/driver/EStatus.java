
package org.acbr4j.ecf.driver;

public enum EStatus {
	
	RETORNO_OK( 0, "RETORNO_OK" ),
	IMPRESSORA_OK( 100, "Impressora OK" ),
	RETORNO_INDEFINIDO( 101, "Retorno indefinido: " ),

	// Status da impressora Bematech...
	BEMA_FIM_DE_PAPEL( 200, "Fim de papel." ),
    BEMA_POUCO_PAPEL( 201, "Pouco papel." ),
    BEMA_RELOGIO_ERROR( 203, "Erro no rel�gio." ),
    BEMA_IMPRESSORA_EM_ERRO( 204, "Impressora em erro." ),
    BEMA_NO_ESC( 205, "Primeiro dado do comando n�o foi ESC." ),
    BEMA_NO_COMMAND( 206, "Comando inexistente." ),
    BEMA_CUPOM_FISCAL_ABERTO( 207, "Cupom fiscal aberto." ),
    BEMA_NU_PARAMS_INVALIDO( 208, "N�mero de par�metro de CMD inv�lido." ),
    BEMA_TP_PARAM_INVALIDO( 209, "Tipo de par�metro de CMD inv�lido." ),
    BEMA_OUT_OF_MEMORY( 210, "Mem�ria fiscal lotada." ),
    BEMA_MEMORY_ERROR( 211, "Erro na mem�ria RAM CMOS n�o vol�til." ),
    BEMA_NO_ALIQUOTA( 212, "Al�quota n�o programada." ),
    BEMA_OUT_OF_ALIQUOTA( 213, "Capacidade de al�quotas esgotada." ),
    BEMA_NO_ACESESS_CANCELAMENTO( 214, "Cancelamento n�o permitido." ),
    BEMA_NO_CNPJ_IE( 215, "CNPJ/IE do propriet�rio n�o programados." ),
    BEMA_COMMAND_NO_EXECUTE( 216, "Comando n�o executado." ),
    
	BEMA_ERRO_COMUNICACAO( 0, "Erro de comunica��o f�sica." ),
	BEMA_PARAMETRO_INVALIDO( -2, "Par�metro inv�lido na fun��o." ),
	BEMA_ALIQUOTA_NAO_PROGRAMADA( -3, "Aliquota n�o programada." ),
	BEMA_ARQ_INI_NAO_ENCONTRADO( -4, "O arquivo de inicializa��o n�o encontrado." ),
	BEMA_ERRO_ABRIR_PORTA( -5, "Erro ao abrir a porta de comunica��o." ),
	BEMA_ERRO_GRAVAR_RETORNO( -8, "Erro ao criar ou gravar no arquivo STATUS.TXT ou RETORNO.TXT" ),
	BEMA_NAO_STATUS_600( -27, "Status da impressora diferente de 6,0,0 (ACK, ST1 e ST2)" ),
	BEMA_FUNCAO_NAO_COMPATIVEL( -30, "Fun��o n�o compat�vel com a impressora YANCO" ),
	BEMA_FORMA_PAGAMENTO_NAO_FINALIZADA( -31, "Forma de pagamento n�o finalizada" ),
	
	// Status da impressra daruma;	
	DARUMA_ERROR_N1( -1, "Comando n�o implementado pelo driver de comunica��o." ),
	DARUMA_ERROR_01( 1, "Comando habilitado somente em modo manuten��o." ),
	DARUMA_ERROR_02( 2, "Falha na grava��o da Mem�ria Fiscal." ),
	DARUMA_ERROR_03( 3, "Capaciadade de Mem�ria Fiscal esgotada." ),
	DARUMA_ERROR_04( 4, "Data fornecida n�o coincide com a data interna da IF." ),
	DARUMA_ERROR_05( 5, "Impressora Fiscal bloqueada por erro fiscal." ),
	DARUMA_ERROR_06( 6, "Erro no campo de controle da Mem�ria Fiscal." ),
	DARUMA_ERROR_07( 7, "Existem uma mem�ria fiscal instalada." ),
	DARUMA_ERROR_08( 8, "Senha incorreta." ),
	DARUMA_ERROR_09( 9, "Comando habilitado somente em modo opera��o." ),
	DARUMA_ERROR_10( 10, "Documento aberto." ),
	DARUMA_ERROR_11( 11, "Documento n�o aberto." ),
	DARUMA_ERROR_12( 12, "N�o a documento a cancelar." ),
	DARUMA_ERROR_13( 13, "Campo n�merico com valores inv�lidos." ),
	DARUMA_ERROR_14( 14, "Capacidade m�xima da mem�ria foi atingida." ),
	DARUMA_ERROR_15( 15, "Item solicitado n�o foi encontrado." ),
	DARUMA_ERROR_16( 16, "Erro na sintaxe do comando." ),
	DARUMA_ERROR_17( 17, "Overflow nos c�uculos internos." ),
	DARUMA_ERROR_18( 18, "Al�quota de inposto n�o definida para o totalizador selecionado." ),
	DARUMA_ERROR_19( 19, "Mem�ria fiscal vazia." ),
	DARUMA_ERROR_20( 20, "Nenhum campo requer atualiza��o." ),
	DARUMA_ERROR_21( 21, "Repita o comando de Redu��o Z." ),
	DARUMA_ERROR_22( 22, "Redu��o Z do dia j� foi executada." ),
	DARUMA_ERROR_23( 23, "Redu��o Z pendente." ),
	DARUMA_ERROR_24( 24, "Valor de desconto ou acr�cimo inv�lido." ),
	DARUMA_ERROR_25( 25, "Caracteres n�o estamp�veis foram encontrados." ),
	DARUMA_ERROR_26( 26, "Comando n�o pode ser executado." ),
	DARUMA_ERROR_27( 27, "Opera��o abortada." ),
	DARUMA_ERROR_28( 28, "Campo n�merico em zero n�o permitido." ),
	DARUMA_ERROR_29( 29, "Documento anterior n�o foi cupom fiscal." ),
	DARUMA_ERROR_30( 30, "Foi selecionado um documento n�o fiscal inv�lido ou n�o programando." ),
	DARUMA_ERROR_31( 31, "N�o pode autenticar." ),
	DARUMA_ERROR_32( 32, "Desconto de INSS n�o habilitado" ),
	DARUMA_ERROR_33( 33, "Emita comprovantes n�o fiscais vinculados pendentes." ),
	DARUMA_ERROR_34( 34, "Impressora fiscal bloqueada por erro fiscal." ),
	DARUMA_ERROR_35( 35, "Rel�gio interno inoperante." ),
	DARUMA_ERROR_36( 36, "Vers�o do firmware gravada na MF n�o coincide ccom a esperada." ),
	DARUMA_ERROR_38( 38, "Foi selecionada uma forma de pagamento inv�lida." ),
	DARUMA_ERROR_39( 39, "Erro na sequencia de fechamento do documento." ),
	DARUMA_ERROR_40( 40, "J� foi emitido algum documento ap�s a ult�ma redu��o Z." ),
	DARUMA_ERROR_41( 41, "Data/Hora fornecida � anterior a �ltima gravada na Mem�ria Fiscal." ),
	DARUMA_ERROR_42( 42, "Leitura X do in�cio do dia ainda n�o foi emitida." ),
	DARUMA_ERROR_43( 43, "N�o pode mais emitir CNF Vinculado solicitado." ),
	DARUMA_ERROR_44( 44, "Forma de pagamento j� definida." ),
	DARUMA_ERROR_45( 45, "Campo em brando ou contendo caracter de controle." ),
	DARUMA_ERROR_47( 47, "Nenhum perif�rico homologado conectado a porta auxiliar." ),
	DARUMA_ERROR_48( 48, "Valor do estorno superior ao total acumulado nesta forma de pagamento." ),
	DARUMA_ERROR_49( 49, "Forma de pagamento a ser estornada n�o foi encontrada na mem�ria." ),
	DARUMA_ERROR_50( 50, "Impressora sem papel." ),
	DARUMA_ERROR_61( 61, "Opera��o interrompida por falta de energia el�trica." ),
	DARUMA_ERROR_70( 71, "Falha na comunida��o com o m�dulo impressor." ),
	DARUMA_ERROR_80( 81, "Perif�rico conectado a porta auxiliar n�o homologado." ),
	DARUMA_ERROR_81( 82, "Banco n�o cadastrado." ),
	DARUMA_ERROR_82( 83, "Nada a imprimir." ),
	DARUMA_ERROR_83( 84, "Extenso n�o cabe no cheque." ),
	DARUMA_ERROR_84( 85, "Leitor de CMC-7 n�o instalado." ),
	DARUMA_ERROR_86( 86, "N�o h� mais mem�ria para o cadastro de bancos." ),
	DARUMA_ERROR_87( 87, "Impress�o no verso somento ap�s a impress�o da frente do cheque." ),
	DARUMA_ERROR_88( 88, "Valor inv�lido para o cheque." ),	
	DARUMA_WARNING_01( 1001, "Near End foi detectado." ),
	DARUMA_WARNING_02( 1002, "Execute redu��o Z." ),
	DARUMA_WARNING_04( 1004, "Queda de energia." ),
	DARUMA_WARNING_10( 1010, "Bateria interna requer substitui��o." ),
	DARUMA_WARNING_20( 1020, "Opera��o habilitada somente em MIT." ),
	DARUMA_STATUS_S1_B3_0( 2130, 3, "Gaveta fechada." ),
	DARUMA_STATUS_S1_B3_1( 2131, 3, "Gaveta aberta." ),
	DARUMA_STATUS_S1_B1_0( 2110, 3, "Tampa fechada." ),
	DARUMA_STATUS_S1_B1_1( 2111, 1, "Tampa aberta." ),
	DARUMA_STATUS_S1_B0_0( 2100, 1, "Modo bobina n�o selecionado." ),
	DARUMA_STATUS_S1_B0_1( 2101, 3, "Selecionado modo bobina." ),	
	DARUMA_STATUS_S2_B3_0( 2230, 3, "Slip n�o selecionado." ),
	DARUMA_STATUS_S2_B3_1( 2231, 3, "Slip presente." ),
	DARUMA_STATUS_S2_B2_0( 2222, 1, "Sem documento em posi��o de autentica��o." ),
	DARUMA_STATUS_S2_B2_1( 2220, 2, "Documento posicionado para autentica��o." ),
	DARUMA_STATUS_S2_B1_0( 2210, 3, "Papel presente." ),
	DARUMA_STATUS_S2_B1_1( 2211, 1, "Fim da bobina de papel." ),
	DARUMA_STATUS_S2_B0_0( 2200, 3, "Bobina de papel OK." ),
	DARUMA_STATUS_S2_B0_1( 2201, 2, "Near end detectado." ),	
	DARUMA_STATUS_S3_B3_0( 2330, 2, "Modo manuten��o." ),
	DARUMA_STATUS_S3_B3_1( 2331, 3, "Modo opera��o." ),
	DARUMA_STATUS_S3_B2_0( 2320, 3, "Estrape de opera��o fechado." ),
	DARUMA_STATUS_S3_B2_1( 2321, 3, "Estrape de opera��o aberto." ),
	DARUMA_STATUS_S3_B1_0( 2310, 3, "Impressora operacional." ),
	DARUMA_STATUS_S3_B1_1( 2311, 1, "Impressora com erro Fiscal(Bloqueada)." ),
	DARUMA_STATUS_S3_B0_0( 2300, 3, "Impressora On Line." ),
	DARUMA_STATUS_S3_B0_1( 2301, 2, "Impressora Off Line." ),
	DARUMA_STATUS_S4_B2_0( 2420, 3, "Impress�o em opera��o." ),
	DARUMA_STATUS_S4_B2_1( 2421, 1, "Redu��o Z de hoje j� emitido." ),
	DARUMA_STATUS_S4_B1_0( 2410, 1, "Leitura X do in�cio do dia ainda n�o emitida." ),
	DARUMA_STATUS_S4_B1_1( 2411, 1, "Leitura X do in�cio do dia j� emitida." ),
	DARUMA_STATUS_S4_B0_0( 2400, 3, "Pode configurar a IF." ),
	DARUMA_STATUS_S4_B0_1( 2401, 1, "Emitiu algum documento ap�s a redu��o Z." ),
	DARUMA_STATUS_S5_B3_0( 2530, 3, "Modo normal." ),
	DARUMA_STATUS_S5_B3_1( 2531, 2, "Modo treinamento." ),
	DARUMA_STATUS_S5_B2_0( 2520, 3, "MF presente." ),
	DARUMA_STATUS_S5_B2_1( 2521, 3, "MF ausente ou n�o inicializada." ),
	DARUMA_STATUS_S5_B1_0( 2510, 3, "Buffer de comunica��o n�o vazio." ),
	DARUMA_STATUS_S5_B1_1( 2511, 3, "Buffer de coumunica��o vazio." ),
	DARUMA_STATUS_S5_B0_0( 2500, 3, "Impress�o em andamento." ),
	DARUMA_STATUS_S5_B0_1( 2501, 3, "Impress�o encerrada." ),
	DARUMA_STATUS_S6_B3_0( 2630, 3, "N�o imprimindo slip." ),
	DARUMA_STATUS_S6_B3_1( 2631, 3, "Imprimindo slip." ),
	DARUMA_STATUS_S6_B2_0( 2620, 1, "N�o autenticado." ),
	DARUMA_STATUS_S6_B2_1( 2621, 3, "Autenticado." ),
	DARUMA_STATUS_S7_B3_0( 2730, 1, "Falha de energia." ),
	DARUMA_STATUS_S7_B3_1( 2731, 3, "VAC superior a 90V." ),
	DARUMA_STATUS_S7_B2_0( 2720, 3, "Substitua bateria do RTC." ),
	DARUMA_STATUS_S7_B2_1( 2721, 3, "Bateria OK." ),
	DARUMA_STATUS_S7_B0_0( 2700, 3, "MF de 1M Bytes." ),
	DARUMA_STATUS_S7_B0_1( 2701, 3, "MF de 512K Bytes." ),
	DARUMA_STATUS_S9_B3_0( 2930, 3, "Checksum da MF atualizado." ),
	DARUMA_STATUS_S9_B3_1( 2931, 3, "Atualizando checksum da MF." ),
	DARUMA_STATUS_S9_B0_0( 2900, 3, "Totalizador fiscais OK." ),
	DARUMA_STATUS_S9_B0_1( 2901, 1, "Erro de consist�ncia nos totalizadores fiscais." ),
	DARUMA_STATUS_S10_B3_0( 21030, 3, "MF Ok." ),
	DARUMA_STATUS_S10_B3_1( 21031, 1, "Erro na leitura da MF ou MF substituida." ),
	DARUMA_STATUS_S10_B2_0( 21020, 3, "Grava��o da MF Ok." ),
	DARUMA_STATUS_S10_B2_1( 21021, 1, "Erro na grava��o da MF." ),
	DARUMA_STATUS_S10_B1_0( 21010, 3, "Rel�gio interno Ok." ),
	DARUMA_STATUS_S10_B1_1( 21011, 1, "Erro no rel�gio interno." ),
	DARUMA_STATUS_S10_B0_0( 21000, 3, "Clich� do propriet�rio Ok." ),
	DARUMA_STATUS_S10_B0_1( 21001, 3, "Clich� do proriet�rio danificado." );
	

	private String message;
	private int code;
	private int relevanc;
	

	EStatus( final int code, final String message ) {
		this.code = code;
		this.message = message;
	}
	
	EStatus( final int code, final int relevanc, final String message ) {
		this.code = code;
		this.message = message;
		this.relevanc = relevanc;
	}
	
	public void setMessage( final String arg ) {
		this.message = arg;
	}

	public String getMessage() {
		return this.message;
	}

	public int getCode() {
		return this.code;
	}
	
	public int getRelevanc() {
		return this.relevanc;
	}
}
