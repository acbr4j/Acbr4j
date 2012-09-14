
package org.acbr4j.ecf.driver;

import java.util.ArrayList;
import java.util.List;

public class StatusSweda implements Status {

	
	public static final StatusSweda SWEDA_ERROR_1 = new StatusSweda( 1, RELEVANC_ERRO, "Erro na Interpreta��o da Resposta do ECF." );
	public static final StatusSweda SWEDA_ERROR_002 = new StatusSweda( 1, RELEVANC_ERRO, "Documento j� Cancelado." );
	public static final StatusSweda SWEDA_ERROR_003 = new StatusSweda( 1, RELEVANC_ERRO, "Documento j� foi Totalmente Pago." );
	
	/*
    -1 : Result := 'Erro na Interpreta��o da Resposta do ECF' ;

    0 : Result := '' ;



  004 : Result := 'Documento ainda n�o foi Totalmente Pago' ;

  005 : Result := 'Documento j� foi Totalizado' ;

  006 : Result := 'Item Inv�lido' ;

  007 : Result := 'Item Cancelado' ;

  008 : Result := 'Total apurado igual a Zero' ;

  009 : Result := 'Acr�scimo j� aplicado sobre este Item' ;

  010 : Result := 'N�o h� Acr�scimo sobre este Item' ;

  011 : Result := 'Desconto j� aplicado sobre este Item' ;

  012 : Result := 'N�o h� Desconto sobre este Item' ;

  013 : Result := 'Valor de Desconto superior ao Total do Item' ;

  014 : Result := 'Acr�scimo j� aplicado em Subtotal' ;

  015 : Result := 'N�o h� Acr�scimo aplicado no Subtotal' ;

  016 : Result := 'Desconto j� aplicado em Subtotal' ;

  017 : Result := 'N�o h� Desconto aplicado no Subtotal' ;

  018 : Result := 'Valor de Desconto superior ao Total do Documento' ;

  019 : Result := 'Meio de Pagamento n�o programado' ;

  020 : Result := 'Atingido Limite de Itens por Cupom' ;

  021 : Result := 'Al�quota de Imposto n�o programada' ;

  022 : Result := 'Altera��o de Estilo de Fonte n�o permitida nesse comando' ;

  023 : Result := 'Erro na Sintaxe do Comando Enviado' ;

  025 : Result := 'Informado Valor Nulo' ;

  027 : Result := 'Data com formato inv�lido' ;

  028 : Result := 'Hora com formato inv�lido' ;

  029 : Result := 'Comando n�o reconhecido' ;

  030 : Result := 'Tabela Cheia' ;

  031 : Result := 'Faixa Informada � Inv�lida' ;

  032 : Result := 'Tentativa de registro em um mesmo comprovante de '+

                   'opera��es n�o fiscais cadastradas com sinais distintos' ;

  033 : Result := 'Informado Sinal Inv�lido' ;

  034 : Result := 'Excedida capacidade de pagamento por meio de CCD' ;

  035 : Result := 'Opera��o de TEF informada pelo comando de abertura do comprovante n�o encontrada' ;

  036 : Result := 'Classifica��o do meio de pagamento inv�lida' ;

  037 : Result := 'T�tulo informado na abertura de Relat�rio Gerencial n�o encontrado' ;

  040 : Result := 'Mensagem: Abertura do Movimento' ;

  041 : Result := 'Denomina��o informada no Registro de Opera��o n�o fiscal n�o encontrada ' ;

  042 : Result := 'Valor total do Item excedido' ;

  043 : Result := 'Valor do estorno excede a soma dos pagamentos registrados no meio indicado' ;

  044 : Result := 'Valor efetivado � insuficiente para o pagamento!' ;

  050 : Result := 'Campo de Descri��o n�o informado' ;

  058 : Result := 'Comando ou opera��o inv�lida!' ;

  060 : Result := '� necess�ria a emiss�o do documento de Redu��o Z!' ;

  061 : Result := 'O ECF est� em Modo de Interven��o T�cnica!';

  062 : Result := 'O ECF est� inativo!';

  067 : Result := 'Permitida uma �nica reimpress�o!';

  068 : Result := 'Erro f�sico de grava��o na mem�ria fiscal!';

  074 : Result := 'Ejetando folha solta...';

  080 : Result := 'Esgotamento de Dispositivo: Mem�ria Fiscal';

  087 : Result := 'Leiaute de cheque n�o programado!';

  092 : Result := 'J� emitida a 2� via!';

  093 : Result := 'Excede o limite de 24 parcelas!';

  094 : Result := 'Informado n�mero incorreto da parcela!';

  095 : Result := 'Informado valor unit�rio inv�lido!';

  096 : Result := 'N�o foram estornados os Comprovantes de Cr�dito ou D�bito emitidos!';

  098 : Result := 'Processando...';

  099 : Result := 'Confirme';

  103 : Result := 'Inserir a frente para preenchimento!';

  104 : Result := 'Inserir o verso para preenchimento!';

  105 : Result := 'Inserir o cheque para preenchimento!';

  109 : Result := 'Inserir cheque.';

  110 : Result := 'Resultado de leitura MICR-CMC7';

  111 : Result := 'Resultado de leitura MICR-E13B';

  112 : Result := 'N�o foi detectado nenhum caracter!';

  113 : Result := 'Um dos caracteres n�o foi reconhecido!';

  114 : Result := 'As dimens�es do cheque est�o fora das especifica��es! ';

  115 : Result := 'Erro na impressora durante o processamento!';

  116 : Result := 'A tampa foi aberta durante a leitura!';

  117 : Result := 'Fonte inv�lida!';

  120 : Result := 'Erro de grava��o no dispositivo de mem�ria de fita-detalhe!';

  121 : Result := 'Erro mec�nico na impressora!';

  122 : Result := 'Erro na guilhotina!';

  123 : Result := 'Erro recuper�vel!';

  124 : Result := 'Tampa Aberta' ;

  125 : Result := 'Sem Papel' ;

  126 : Result := 'Avan�ando Papel' ;

  127 : Result := 'Substituir Bobina' ;

  128 : Result := 'Falha de comunica��o com o mecanismo de impress�o!';

  130 : Result := 'N�o emitida redu��o Z!';

  131 : Result := 'Totalizador desabilitado!';

  132 : Result := 'Esgotamento de Dispositivo: Mem�ria de Fita-Detalhe';

  133 : Result := 'O ECF est� emitindo a Redu��o Z para entrada em Interven��o T�cnica...';

  134 : Result := 'Transmiss�o de leitura via porta de comunica��o serial abortada';

  135 : Result := 'J� emitido o Cupom Adicional!';

  136 : Result := 'Indicado CDC Inv�lido';

  139 : Result := 'A cabe�a de impress�o t�rmica est� levantada!';

  140 : Result := 'Status da cabe�a de impress�o t�rmica: Temperatura elevada!';

  141 : Result := 'Status da cabe�a de impress�o t�rmica: Tens�o inadequada!';

  142 : Result := 'Informado c�digo de barras Inv�lido!';

  148 : Result := 'Quantidade inv�lida!';

  149 : Result := 'Desconto sobre servi�o desabilitado';

  151 : Result := 'Diverg�ncia de rel�gio!';

  156 : Result := 'Fun��o MICR n�o dispon�vel!';

  157 : Result := 'Fun��o de preenchimento de cheques n�o dispon�vel!';

  159 : Result := 'Preenchendo...';

  160 : Result := 'N�o h� acr�scimo ou desconto aplicado sobre o item';

  161 : Result := 'N�o h� acr�scimo ou desconto aplicado sobre o subtotal';

  162 : Result := 'N�o cancelado a opera��o de acr�scimo aplicada sobre o item ap�s o desconto';

  163 : Result := 'N�o cancelado a opera��o de desconto aplicada sobre o item ap�s o acr�scimo';

  164 : Result := 'N�o cancelado a opera��o de acr�scimo aplicada sobre o subotal ap�s o desconto';

  165 : Result := 'N�o cancelado a opera��o de desconto aplicada sobre o subotal ap�s o acr�scimo';

  166 : Result := 'O mecanismo de impress�o detectado n�o pertence a este modelo de ECF';

  170 : Result := 'C�digo de barras n�o dispon�vel!';

  171 : Result := 'Erro MICR: Falha de acionamento do leitor!';

  172 : Result := 'Mensagem: preenchimento de cheque conclu�do!';

  187 : Result := 'Identificar-se!';

  193 : Result := 'Falha de comunica��o na transmiss�o das informa��es' ;

  195 : Result := 'Enviar imagem';

  196 : Result := 'Dimens�es inv�lidas!';

  197 : Result := 'Falha no envio da imagem!';

  198 : Result := 'Processando....';

  200 : Result := 'Efetuando leitura MICR...';

  201 : Result := 'Pre�o unit�rio inv�lido!';

  202 : Result := 'J� foi impressa a identifica��o do consumidor!';

  203 : Result := 'Erro no formato do logotipo!';

  204 : Result := 'Fun��o de autentica��o n�o dispon�vel!';

  205 : Result := 'Autentica��o cancelada!';

  206 : Result := 'Inserir documento!';

  207 : Result := 'Autenticando...';

  208 : Result := 'Limitado a 5 autentica��es!';

  209 : Result := 'Erro nos par�metros do comando de repeti��o';

  215 : Result := 'Centavos n�o habilitados!';

  216 : Result := 'A data est� avan�ada em mais de 30 dias em rela��o ao '+

                  '�ltimo documento emitido pelo '+

                  'ECF. Envie o comando de programa��o do rel�gio para verifica��o.';

  217 : Result := 'Preparando a impress�o da fita-detalhe...';

  220 : Result := 'Mensagem de progress�o durante a emiss�o da Redu��o Z!';

  24,38,39,45..47,65,66,69..73,75..79,81..86,88..91,97,100..102,106,118,119,

  129,137,138,145..147,150,152..155,158,173..183,185,186,188..191,199,210,

  219,221,225,230,235..237,241,242,244..248

      : Result := 'Chamar Assist�ncia T�cnica' ;

  243 : Result := 'Redu��o n�o encontrada!' ;

  249 : Result := 'Totalizadores de ISSQN desabilitados, Inscri��o Municipal n�o programada!' ;

  250 : Result := 'Totalizadores de ICMS desabilitados, CNPJ n�o programado!' ;


	
	
	
	

	public static final StatusSweda SWEDA_ERROR_01 = new StatusSweda( 1, RELEVANC_ERRO, "Comando habilitado somente em modo manuten��o." );

	public static final StatusSweda SWEDA_ERROR_02 = new StatusSweda( 2, RELEVANC_ERRO, "Falha na grava��o da Mem�ria Fiscal." );

	public static final StatusSweda SWEDA_ERROR_03 = new StatusSweda( 3, RELEVANC_ERRO, "Capaciadade de Mem�ria Fiscal esgotada." );

	public static final StatusSweda SWEDA_ERROR_04 = new StatusSweda( 4, RELEVANC_ERRO, "Data fornecida n�o coincide com a data interna da IF." );

	public static final StatusSweda SWEDA_ERROR_05 = new StatusSweda( 5, RELEVANC_ERRO, "Impressora Fiscal bloqueada por erro fiscal." );

	public static final StatusSweda SWEDA_ERROR_06 = new StatusSweda( 6, RELEVANC_ERRO, "Erro no campo de controle da Mem�ria Fiscal." );

	public static final StatusSweda SWEDA_ERROR_07 = new StatusSweda( 7, RELEVANC_ERRO, "Existem uma mem�ria fiscal instalada." );

	public static final StatusSweda SWEDA_ERROR_08 = new StatusSweda( 8, RELEVANC_ERRO, "Senha incorreta." );

	public static final StatusSweda SWEDA_ERROR_09 = new StatusSweda( 9, RELEVANC_ERRO, "Comando habilitado somente em modo opera��o." );

	public static final StatusSweda SWEDA_ERROR_10 = new StatusSweda( 10, RELEVANC_ERRO, "Documento aberto." );

	public static final StatusSweda SWEDA_ERROR_11 = new StatusSweda( 11, RELEVANC_ERRO, "Documento n�o aberto." );

	public static final StatusSweda SWEDA_ERROR_12 = new StatusSweda( 12, RELEVANC_ERRO, "N�o a documento a cancelar." );

	public static final StatusSweda SWEDA_ERROR_13 = new StatusSweda( 13, RELEVANC_ERRO, "Campo n�merico com valores inv�lidos." );

	public static final StatusSweda SWEDA_ERROR_14 = new StatusSweda( 14, RELEVANC_ERRO, "Capacidade m�xima da mem�ria foi atingida." );

	public static final StatusSweda SWEDA_ERROR_15 = new StatusSweda( 15, RELEVANC_ERRO, "Item solicitado n�o foi encontrado." );

	public static final StatusSweda SWEDA_ERROR_16 = new StatusSweda( 16, RELEVANC_ERRO, "Erro na sintaxe do comando." );

	public static final StatusSweda SWEDA_ERROR_17 = new StatusSweda( 17, RELEVANC_ERRO, "Overflow nos c�uculos internos." );

	public static final StatusSweda SWEDA_ERROR_18 = new StatusSweda( 18, RELEVANC_ERRO, "Al�quota de inposto n�o definida para o totalizador selecionado." );

	public static final StatusSweda SWEDA_ERROR_19 = new StatusSweda( 19, RELEVANC_ERRO, "Mem�ria fiscal vazia." );

	public static final StatusSweda SWEDA_ERROR_20 = new StatusSweda( 20, RELEVANC_ERRO, "Nenhum campo requer atualiza��o." );

	public static final StatusSweda SWEDA_ERROR_21 = new StatusSweda( 21, RELEVANC_ERRO, "Repita o comando de Redu��o Z." );

	public static final StatusSweda SWEDA_ERROR_22 = new StatusSweda( 22, RELEVANC_ERRO, "Redu��o Z do dia j� foi executada." );

	public static final StatusSweda SWEDA_ERROR_23 = new StatusSweda( 23, RELEVANC_ERRO, "Redu��o Z pendente." );

	public static final StatusSweda SWEDA_ERROR_24 = new StatusSweda( 24, RELEVANC_ERRO, "Valor de desconto ou acr�cimo inv�lido." );

	public static final StatusSweda SWEDA_ERROR_25 = new StatusSweda( 25, RELEVANC_ERRO, "Caracteres n�o estamp�veis foram encontrados." );

	public static final StatusSweda SWEDA_ERROR_26 = new StatusSweda( 26, RELEVANC_ERRO, "Comando n�o pode ser executado." );

	public static final StatusSweda SWEDA_ERROR_27 = new StatusSweda( 27, RELEVANC_ERRO, "Opera��o abortada." );

	public static final StatusSweda SWEDA_ERROR_28 = new StatusSweda( 28, RELEVANC_ERRO, "Campo n�merico em zero n�o permitido." );

	public static final StatusSweda SWEDA_ERROR_29 = new StatusSweda( 29, RELEVANC_ERRO, "Documento anterior n�o foi cupom fiscal." );

	public static final StatusSweda SWEDA_ERROR_30 = new StatusSweda( 30, RELEVANC_ERRO, "Foi selecionado um documento n�o fiscal inv�lido ou n�o programando." );

	public static final StatusSweda SWEDA_ERROR_31 = new StatusSweda( 31, RELEVANC_ERRO, "N�o pode autenticar." );

	public static final StatusSweda SWEDA_ERROR_32 = new StatusSweda( 32, RELEVANC_ERRO, "Desconto de INSS n�o habilitado" );

	public static final StatusSweda SWEDA_ERROR_33 = new StatusSweda( 33, RELEVANC_ERRO, "Emita comprovantes n�o fiscais vinculados pendentes." );

	public static final StatusSweda SWEDA_ERROR_34 = new StatusSweda( 34, RELEVANC_ERRO, "Impressora fiscal bloqueada por erro fiscal." );

	public static final StatusSweda SWEDA_ERROR_35 = new StatusSweda( 35, RELEVANC_ERRO, "Rel�gio interno inoperante." );

	public static final StatusSweda SWEDA_ERROR_36 = new StatusSweda( 36, RELEVANC_ERRO, "Vers�o do firmware gravada na MF n�o coincide ccom a esperada." );

	public static final StatusSweda SWEDA_ERROR_38 = new StatusSweda( 38, RELEVANC_ERRO, "Foi selecionada uma forma de pagamento inv�lida." );

	public static final StatusSweda SWEDA_ERROR_39 = new StatusSweda( 39, RELEVANC_ERRO, "Erro na sequencia de fechamento do documento." );

	public static final StatusSweda SWEDA_ERROR_40 = new StatusSweda( 40, RELEVANC_ERRO, "J� foi emitido algum documento ap�s a ult�ma redu��o Z." );

	public static final StatusSweda SWEDA_ERROR_41 = new StatusSweda( 41, RELEVANC_ERRO, "Data/Hora fornecida � anterior a �ltima gravada na Mem�ria Fiscal." );

	public static final StatusSweda SWEDA_ERROR_42 = new StatusSweda( 42, RELEVANC_ERRO, "Leitura X do in�cio do dia ainda n�o foi emitida." );

	public static final StatusSweda SWEDA_ERROR_43 = new StatusSweda( 43, RELEVANC_ERRO, "N�o pode mais emitir CNF Vinculado solicitado." );

	public static final StatusSweda SWEDA_ERROR_44 = new StatusSweda( 44, RELEVANC_ERRO, "Forma de pagamento j� definida." );

	public static final StatusSweda SWEDA_ERROR_45 = new StatusSweda( 45, RELEVANC_ERRO, "Campo em brando ou contendo caracter de controle." );

	public static final StatusSweda SWEDA_ERROR_47 = new StatusSweda( 47, RELEVANC_ERRO, "Nenhum perif�rico homologado conectado a porta auxiliar." );

	public static final StatusSweda SWEDA_ERROR_48 = new StatusSweda( 48, RELEVANC_ERRO, "Valor do estorno superior ao total acumulado nesta forma de pagamento." );

	public static final StatusSweda SWEDA_ERROR_49 = new StatusSweda( 49, RELEVANC_ERRO, "Forma de pagamento a ser estornada n�o foi encontrada na mem�ria." );

	public static final StatusSweda SWEDA_ERROR_50 = new StatusSweda( 50, RELEVANC_ERRO, "Impressora sem papel." );

	public static final StatusSweda SWEDA_ERROR_61 = new StatusSweda( 61, RELEVANC_ERRO, "Opera��o interrompida por falta de energia el�trica." );

	public static final StatusSweda SWEDA_ERROR_70 = new StatusSweda( 71, RELEVANC_ERRO, "Falha na comunida��o com o m�dulo impressor." );

	public static final StatusSweda SWEDA_ERROR_80 = new StatusSweda( 81, RELEVANC_ERRO, "Perif�rico conectado a porta auxiliar n�o homologado." );

	public static final StatusSweda SWEDA_ERROR_81 = new StatusSweda( 82, RELEVANC_ERRO, "Banco n�o cadastrado." );

	public static final StatusSweda SWEDA_ERROR_82 = new StatusSweda( 83, RELEVANC_ERRO, "Nada a imprimir." );

	public static final StatusSweda SWEDA_ERROR_83 = new StatusSweda( 84, RELEVANC_ERRO, "Extenso n�o cabe no cheque." );

	public static final StatusSweda SWEDA_ERROR_84 = new StatusSweda( 85, RELEVANC_ERRO, "Leitor de CMC-7 n�o instalado." );

	public static final StatusSweda SWEDA_ERROR_86 = new StatusSweda( 86, RELEVANC_ERRO, "N�o h� mais mem�ria para o cadastro de bancos." );

	public static final StatusSweda SWEDA_ERROR_87 = new StatusSweda( 87, RELEVANC_ERRO, "Impress�o no verso somento ap�s a impress�o da frente do cheque." );

	public static final StatusSweda SWEDA_ERROR_88 = new StatusSweda( 88, RELEVANC_ERRO, "Valor inv�lido para o cheque." );

	public static final StatusSweda DARUMA_WARNING_01 = new StatusSweda( 1001, RELEVANC_WARNING, "Near End foi detectado." );

	public static final StatusSweda DARUMA_WARNING_02 = new StatusSweda( 1002, RELEVANC_WARNING, "Execute redu��o Z." );

	public static final StatusSweda DARUMA_WARNING_04 = new StatusSweda( 1004, RELEVANC_WARNING, "Queda de energia." );

	public static final StatusSweda DARUMA_WARNING_10 = new StatusSweda( 1010, RELEVANC_WARNING, "Bateria interna requer substitui��o." );

	public static final StatusSweda DARUMA_WARNING_20 = new StatusSweda( 1020, RELEVANC_WARNING, "Opera��o habilitada somente em MIT." );

	public static final StatusSweda DARUMA_STATUS_S1_B3_0 = new StatusSweda( 2130, RELEVANC_MESSAGE, "Gaveta fechada." );

	public static final StatusSweda DARUMA_STATUS_S1_B3_1 = new StatusSweda( 2131, RELEVANC_MESSAGE, "Gaveta aberta." );

	public static final StatusSweda DARUMA_STATUS_S1_B1_0 = new StatusSweda( 2110, RELEVANC_MESSAGE, "Tampa fechada." );

	public static final StatusSweda DARUMA_STATUS_S1_B1_1 = new StatusSweda( 2111, RELEVANC_ERRO, "Tampa aberta." );

	public static final StatusSweda DARUMA_STATUS_S1_B0_0 = new StatusSweda( 2100, RELEVANC_ERRO, "Modo bobina n�o selecionado." );

	public static final StatusSweda DARUMA_STATUS_S1_B0_1 = new StatusSweda( 2101, RELEVANC_MESSAGE, "Selecionado modo bobina." );

	public static final StatusSweda DARUMA_STATUS_S2_B3_0 = new StatusSweda( 2230, RELEVANC_MESSAGE, "Slip n�o selecionado." );

	public static final StatusSweda DARUMA_STATUS_S2_B3_1 = new StatusSweda( 2231, RELEVANC_MESSAGE, "Slip presente." );

	public static final StatusSweda DARUMA_STATUS_S2_B2_0 = new StatusSweda( 2222, RELEVANC_ERRO, "Sem documento em posi��o de autentica��o." );

	public static final StatusSweda DARUMA_STATUS_S2_B2_1 = new StatusSweda( 2220, RELEVANC_WARNING, "Documento posicionado para autentica��o." );

	public static final StatusSweda DARUMA_STATUS_S2_B1_0 = new StatusSweda( 2210, RELEVANC_MESSAGE, "Papel presente." );

	public static final StatusSweda DARUMA_STATUS_S2_B1_1 = new StatusSweda( 2211, RELEVANC_ERRO, "Fim da bobina de papel." );

	public static final StatusSweda DARUMA_STATUS_S2_B0_0 = new StatusSweda( 2200, RELEVANC_MESSAGE, "Bobina de papel OK." );

	public static final StatusSweda DARUMA_STATUS_S2_B0_1 = new StatusSweda( 2201, RELEVANC_WARNING, "Near end detectado." );

	public static final StatusSweda DARUMA_STATUS_S3_B3_0 = new StatusSweda( 2330, RELEVANC_WARNING, "Modo manuten��o." );

	public static final StatusSweda DARUMA_STATUS_S3_B3_1 = new StatusSweda( 2331, RELEVANC_MESSAGE, "Modo opera��o." );

	public static final StatusSweda DARUMA_STATUS_S3_B2_0 = new StatusSweda( 2320, RELEVANC_MESSAGE, "Estrape de opera��o fechado." );

	public static final StatusSweda DARUMA_STATUS_S3_B2_1 = new StatusSweda( 2321, RELEVANC_MESSAGE, "Estrape de opera��o aberto." );

	public static final StatusSweda DARUMA_STATUS_S3_B1_0 = new StatusSweda( 2310, RELEVANC_MESSAGE, "Impressora operacional." );

	public static final StatusSweda DARUMA_STATUS_S3_B1_1 = new StatusSweda( 2311, RELEVANC_ERRO, "Impressora com erro Fiscal = new StatusDaruma(Bloqueada)." );

	public static final StatusSweda DARUMA_STATUS_S3_B0_0 = new StatusSweda( 2300, RELEVANC_MESSAGE, "Impressora On Line." );

	public static final StatusSweda DARUMA_STATUS_S3_B0_1 = new StatusSweda( 2301, RELEVANC_WARNING, "Impressora Off Line." );

	public static final StatusSweda DARUMA_STATUS_S4_B2_0 = new StatusSweda( 2420, RELEVANC_MESSAGE, "Impress�o em opera��o." );

	public static final StatusSweda DARUMA_STATUS_S4_B2_1 = new StatusSweda( 2421, RELEVANC_ERRO, "Redu��o Z de hoje j� emitido." );

	public static final StatusSweda DARUMA_STATUS_S4_B1_0 = new StatusSweda( 2410, RELEVANC_ERRO, "Leitura X do in�cio do dia ainda n�o emitida." );

	public static final StatusSweda DARUMA_STATUS_S4_B1_1 = new StatusSweda( 2411, RELEVANC_ERRO, "Leitura X do in�cio do dia j� emitida." );

	public static final StatusSweda DARUMA_STATUS_S4_B0_0 = new StatusSweda( 2400, RELEVANC_MESSAGE, "Pode configurar a IF." );

	public static final StatusSweda DARUMA_STATUS_S4_B0_1 = new StatusSweda( 2401, RELEVANC_ERRO, "Emitiu algum documento ap�s a redu��o Z." );

	public static final StatusSweda DARUMA_STATUS_S5_B3_0 = new StatusSweda( 2530, RELEVANC_MESSAGE, "Modo normal." );

	public static final StatusSweda DARUMA_STATUS_S5_B3_1 = new StatusSweda( 2531, RELEVANC_WARNING, "Modo treinamento." );

	public static final StatusSweda DARUMA_STATUS_S5_B2_0 = new StatusSweda( 2520, RELEVANC_MESSAGE, "MF presente." );

	public static final StatusSweda DARUMA_STATUS_S5_B2_1 = new StatusSweda( 2521, RELEVANC_MESSAGE, "MF ausente ou n�o inicializada." );

	public static final StatusSweda DARUMA_STATUS_S5_B1_0 = new StatusSweda( 2510, RELEVANC_MESSAGE, "Buffer de comunica��o n�o vazio." );

	public static final StatusSweda DARUMA_STATUS_S5_B1_1 = new StatusSweda( 2511, RELEVANC_MESSAGE, "Buffer de coumunica��o vazio." );

	public static final StatusSweda DARUMA_STATUS_S5_B0_0 = new StatusSweda( 2500, RELEVANC_MESSAGE, "Impress�o em andamento." );

	public static final StatusSweda DARUMA_STATUS_S5_B0_1 = new StatusSweda( 2501, RELEVANC_MESSAGE, "Impress�o encerrada." );

	public static final StatusSweda DARUMA_STATUS_S6_B3_0 = new StatusSweda( 2630, RELEVANC_MESSAGE, "N�o imprimindo slip." );

	public static final StatusSweda DARUMA_STATUS_S6_B3_1 = new StatusSweda( 2631, RELEVANC_MESSAGE, "Imprimindo slip." );

	public static final StatusSweda DARUMA_STATUS_S6_B2_0 = new StatusSweda( 2620, RELEVANC_ERRO, "N�o autenticado." );

	public static final StatusSweda DARUMA_STATUS_S6_B2_1 = new StatusSweda( 2621, RELEVANC_MESSAGE, "Autenticado." );

	public static final StatusSweda DARUMA_STATUS_S7_B3_0 = new StatusSweda( 2730, RELEVANC_ERRO, "Falha de energia." );

	public static final StatusSweda DARUMA_STATUS_S7_B3_1 = new StatusSweda( 2731, RELEVANC_MESSAGE, "VAC superior a 90V." );

	public static final StatusSweda DARUMA_STATUS_S7_B2_0 = new StatusSweda( 2720, RELEVANC_MESSAGE, "Substitua bateria do RTC." );

	public static final StatusSweda DARUMA_STATUS_S7_B2_1 = new StatusSweda( 2721, RELEVANC_MESSAGE, "Bateria OK." );

	public static final StatusSweda DARUMA_STATUS_S7_B0_0 = new StatusSweda( 2700, RELEVANC_MESSAGE, "MF de 1M Bytes." );

	public static final StatusSweda DARUMA_STATUS_S7_B0_1 = new StatusSweda( 2701, RELEVANC_MESSAGE, "MF de 512K Bytes." );

	public static final StatusSweda DARUMA_STATUS_S9_B3_0 = new StatusSweda( 2930, RELEVANC_MESSAGE, "Checksum da MF atualizado." );

	public static final StatusSweda DARUMA_STATUS_S9_B3_1 = new StatusSweda( 2931, RELEVANC_MESSAGE, "Atualizando checksum da MF." );

	public static final StatusSweda DARUMA_STATUS_S9_B0_0 = new StatusSweda( 2900, RELEVANC_MESSAGE, "Totalizador fiscais OK." );

	public static final StatusSweda DARUMA_STATUS_S9_B0_1 = new StatusSweda( 2901, RELEVANC_ERRO, "Erro de consist�ncia nos totalizadores fiscais." );

	public static final StatusSweda DARUMA_STATUS_S10_B3_0 = new StatusSweda( 21030, RELEVANC_MESSAGE, "MF Ok." );

	public static final StatusSweda DARUMA_STATUS_S10_B3_1 = new StatusSweda( 21031, RELEVANC_ERRO, "Erro na leitura da MF ou MF substituida." );

	public static final StatusSweda DARUMA_STATUS_S10_B2_0 = new StatusSweda( 21020, RELEVANC_MESSAGE, "Grava��o da MF Ok." );

	public static final StatusSweda DARUMA_STATUS_S10_B2_1 = new StatusSweda( 21021, RELEVANC_ERRO, "Erro na grava��o da MF." );

	public static final StatusSweda DARUMA_STATUS_S10_B1_0 = new StatusSweda( 21010, RELEVANC_MESSAGE, "Rel�gio interno Ok." );

	public static final StatusSweda DARUMA_STATUS_S10_B1_1 = new StatusSweda( 21011, RELEVANC_ERRO, "Erro no rel�gio interno." );

	public static final StatusSweda DARUMA_STATUS_S10_B0_0 = new StatusSweda( 21000, RELEVANC_MESSAGE, "Clich� do propriet�rio Ok." );

	public static final StatusSweda DARUMA_STATUS_S10_B0_1 = new StatusSweda( 21001, RELEVANC_MESSAGE, "Clich� do proriet�rio danificado." );
	*/
	
	private static final List<StatusSweda> statusList = new ArrayList<StatusSweda>();

	private String message;

	private int code;

	private int relevanc;
	
	
	static {
		
		statusList.add( SWEDA_ERROR_1 );
		statusList.add( SWEDA_ERROR_002 );
		statusList.add( SWEDA_ERROR_003 );
		/*
		statusList.add( SWEDA_ERROR_04 );
		statusList.add( SWEDA_ERROR_05 );
		statusList.add( SWEDA_ERROR_06 );
		statusList.add( SWEDA_ERROR_07 );
		statusList.add( SWEDA_ERROR_08 );
		statusList.add( SWEDA_ERROR_09 );
		statusList.add( SWEDA_ERROR_10 );
		statusList.add( SWEDA_ERROR_11 );
		statusList.add( SWEDA_ERROR_12 );
		statusList.add( SWEDA_ERROR_13 );
		statusList.add( SWEDA_ERROR_14 );
		statusList.add( SWEDA_ERROR_15 );
		statusList.add( SWEDA_ERROR_16 );
		statusList.add( SWEDA_ERROR_17 );
		statusList.add( SWEDA_ERROR_18 );
		statusList.add( SWEDA_ERROR_19 );
		statusList.add( SWEDA_ERROR_20 );
		statusList.add( SWEDA_ERROR_21 );
		statusList.add( SWEDA_ERROR_22 );
		statusList.add( SWEDA_ERROR_23 );
		statusList.add( SWEDA_ERROR_24 );
		statusList.add( SWEDA_ERROR_25 );
		statusList.add( SWEDA_ERROR_26 );
		statusList.add( SWEDA_ERROR_27 );
		statusList.add( SWEDA_ERROR_28 );
		statusList.add( SWEDA_ERROR_29 );
		statusList.add( SWEDA_ERROR_30 );
		statusList.add( SWEDA_ERROR_31 );
		statusList.add( SWEDA_ERROR_32 );
		statusList.add( SWEDA_ERROR_33 );
		statusList.add( SWEDA_ERROR_34 );
		statusList.add( SWEDA_ERROR_35 );
		statusList.add( SWEDA_ERROR_36 );
		statusList.add( SWEDA_ERROR_38 );
		statusList.add( SWEDA_ERROR_39 );
		statusList.add( SWEDA_ERROR_40 );
		statusList.add( SWEDA_ERROR_41 );
		statusList.add( SWEDA_ERROR_42 );
		statusList.add( SWEDA_ERROR_43 );
		statusList.add( SWEDA_ERROR_44 );
		statusList.add( SWEDA_ERROR_45 );
		statusList.add( SWEDA_ERROR_47 );
		statusList.add( SWEDA_ERROR_48 );
		statusList.add( SWEDA_ERROR_49 );
		statusList.add( SWEDA_ERROR_50 );
		statusList.add( SWEDA_ERROR_61 );
		statusList.add( SWEDA_ERROR_70 );
		statusList.add( SWEDA_ERROR_80 );
		statusList.add( SWEDA_ERROR_81 );
		statusList.add( SWEDA_ERROR_82 );
		statusList.add( SWEDA_ERROR_83 );
		statusList.add( SWEDA_ERROR_84 );
		statusList.add( SWEDA_ERROR_86 );
		statusList.add( SWEDA_ERROR_87 );
		statusList.add( SWEDA_ERROR_88 );
		statusList.add( DARUMA_WARNING_01 );
		statusList.add( DARUMA_WARNING_02 );
		statusList.add( DARUMA_WARNING_04 );
		statusList.add( DARUMA_WARNING_10 );
		statusList.add( DARUMA_WARNING_20 );
		statusList.add( DARUMA_STATUS_S1_B3_0 );
		statusList.add( DARUMA_STATUS_S1_B3_1 );
		statusList.add( DARUMA_STATUS_S1_B1_0 );
		statusList.add( DARUMA_STATUS_S1_B1_1 );
		statusList.add( DARUMA_STATUS_S1_B0_0 );
		statusList.add( DARUMA_STATUS_S1_B0_1 );
		statusList.add( DARUMA_STATUS_S2_B3_0 );
		statusList.add( DARUMA_STATUS_S2_B3_1 );
		statusList.add( DARUMA_STATUS_S2_B2_0 );
		statusList.add( DARUMA_STATUS_S2_B2_1 );
		statusList.add( DARUMA_STATUS_S2_B1_0 );
		statusList.add( DARUMA_STATUS_S2_B1_1 );
		statusList.add( DARUMA_STATUS_S2_B0_0 );
		statusList.add( DARUMA_STATUS_S2_B0_1 );
		statusList.add( DARUMA_STATUS_S3_B3_0 );
		statusList.add( DARUMA_STATUS_S3_B3_1 );
		statusList.add( DARUMA_STATUS_S3_B2_0 );
		statusList.add( DARUMA_STATUS_S3_B2_1 );
		statusList.add( DARUMA_STATUS_S3_B1_0 );
		statusList.add( DARUMA_STATUS_S3_B1_1 );
		statusList.add( DARUMA_STATUS_S3_B0_0 );
		statusList.add( DARUMA_STATUS_S3_B0_1 );
		statusList.add( DARUMA_STATUS_S4_B2_0 );
		statusList.add( DARUMA_STATUS_S4_B2_1 );
		statusList.add( DARUMA_STATUS_S4_B1_0 );
		statusList.add( DARUMA_STATUS_S4_B1_1 );
		statusList.add( DARUMA_STATUS_S4_B0_0 );
		statusList.add( DARUMA_STATUS_S4_B0_1 );
		statusList.add( DARUMA_STATUS_S5_B3_0 );
		statusList.add( DARUMA_STATUS_S5_B3_1 );
		statusList.add( DARUMA_STATUS_S5_B2_0 );
		statusList.add( DARUMA_STATUS_S5_B2_1 );
		statusList.add( DARUMA_STATUS_S5_B1_0 );
		statusList.add( DARUMA_STATUS_S5_B1_1 );
		statusList.add( DARUMA_STATUS_S5_B0_0 );
		statusList.add( DARUMA_STATUS_S5_B0_1 );
		statusList.add( DARUMA_STATUS_S6_B3_0 );
		statusList.add( DARUMA_STATUS_S6_B3_1 );
		statusList.add( DARUMA_STATUS_S6_B2_0 );
		statusList.add( DARUMA_STATUS_S6_B2_1 );
		statusList.add( DARUMA_STATUS_S7_B3_0 );
		statusList.add( DARUMA_STATUS_S7_B3_1 );
		statusList.add( DARUMA_STATUS_S7_B2_0 );
		statusList.add( DARUMA_STATUS_S7_B2_1 );
		statusList.add( DARUMA_STATUS_S7_B0_0 );
		statusList.add( DARUMA_STATUS_S7_B0_1 );
		statusList.add( DARUMA_STATUS_S9_B3_0 );
		statusList.add( DARUMA_STATUS_S9_B3_1 );
		statusList.add( DARUMA_STATUS_S9_B0_0 );
		statusList.add( DARUMA_STATUS_S9_B0_1 );
		statusList.add( DARUMA_STATUS_S10_B3_0 );
		statusList.add( DARUMA_STATUS_S10_B3_1 );
		statusList.add( DARUMA_STATUS_S10_B2_0 );
		statusList.add( DARUMA_STATUS_S10_B2_1 );
		statusList.add( DARUMA_STATUS_S10_B1_0 );
		statusList.add( DARUMA_STATUS_S10_B1_1 );
		statusList.add( DARUMA_STATUS_S10_B0_0 );
		statusList.add( DARUMA_STATUS_S10_B0_1 );
		*/
	}
	
	public static StatusSweda getStatusDaruma( int code ) {
		
		StatusSweda statusDaruma = null;
		
		for ( StatusSweda sd : statusList ) {
			if ( sd.getCode() == code ) {
				statusDaruma = sd;
				break;
			}
		}
		
		return statusDaruma;
	}
	

	public StatusSweda( int code, int relevanc, String message ) {

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
