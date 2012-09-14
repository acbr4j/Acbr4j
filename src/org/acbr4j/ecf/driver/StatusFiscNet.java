
package org.acbr4j.ecf.driver;

import java.util.ArrayList;
import java.util.List;

public class StatusFiscNet implements Status {

	public static StatusFiscNet ErroGeralFalRAM = new StatusFiscNet( 1, RELEVANC_ERRO, "N�o foi poss�vel alocar mais mem�ria" );
	
	public static StatusFiscNet ErroGeralPerdaRAM = new StatusFiscNet( 2, RELEVANC_ERRO, "Mem�ria RAM foi corrompida" );
	
	public static StatusFiscNet ErroMFDesconectada = new StatusFiscNet( 1000, RELEVANC_ERRO, "Mem�ria Fiscal foi desconectada" );
	
	public static StatusFiscNet ErroMFLeitura = new StatusFiscNet( 1001, RELEVANC_ERRO, "Erro na leitura na Mem�ria Fiscal" );
	
	public static StatusFiscNet ErroMFApenasLeitura = new StatusFiscNet( 1002, RELEVANC_ERRO, "Mem�ria est� setada apenas para leitura" );
	
	public static StatusFiscNet ErroMFTamRegistro = new StatusFiscNet( 1003, RELEVANC_ERRO, "Registro fora dos padr�es (erro interno)" );
	
	public static StatusFiscNet ErroMFCheia = new StatusFiscNet( 1004, RELEVANC_ERRO, "Mem�ria Fiscal est� lotada" );
	
	public static StatusFiscNet ErroMFCartuchosExcedidos = new StatusFiscNet( 1005, RELEVANC_ERRO, "N�mero m�ximo de cartuchos excedidos" );
	
	public static StatusFiscNet ErroMFJaInicializada = new StatusFiscNet( 1006, RELEVANC_ERRO, "Tentativa de gravar novo modelo de ECF" );
	
	public static StatusFiscNet ErroMFNaoInicializada = new StatusFiscNet( 1007, RELEVANC_ERRO, "Tentativa de grava��o de qualquer dado antes da inicializa��o da Mem�ria Fiscal" );
	
	public static StatusFiscNet ErroMFUsuariosExcedidos = new StatusFiscNet( 1008, RELEVANC_ERRO, "N�mero m�ximo de usu�rios foi atingido" );
	
	public static StatusFiscNet ErroMFIntervencoesExedidas = new StatusFiscNet( 1009, RELEVANC_ERRO, "N�mero m�xiom de interven��es foi atingido" );
	
	public static StatusFiscNet ErroMFVersoesExcedidas = new StatusFiscNet( 1010, RELEVANC_ERRO, "N�mero m�ximo de vers�es foi atingido" );
	
	public static StatusFiscNet ErroMFReducoesExcedidas = new StatusFiscNet( 1011, RELEVANC_ERRO, "N�mero m�xiom de redu��es foi atingido" );
	
	public static StatusFiscNet ErroMFGravacao = new StatusFiscNet( 1012, RELEVANC_ERRO, "Erro na grava��o de registro na mem�ria fiscal" );
	
	public static StatusFiscNet ErroTransactDrvrLeitura = new StatusFiscNet( 2000, RELEVANC_ERRO, "Erro na leitura no dispositivo f�sico" );
	
	public static StatusFiscNet ErroTransactDrvrEscrita = new StatusFiscNet( 2001, RELEVANC_ERRO, "Erro de leitura no dispositivo" );
	
	public static StatusFiscNet ErroTransactDrvrDesconectado = new StatusFiscNet( 2002, RELEVANC_ERRO, "Dispositivo de transa��es foi desconectado" );
	
	public static StatusFiscNet ErroTransactRegInvalido = new StatusFiscNet( 3000, RELEVANC_ERRO, "Tipo de registro a ser gravado inv�lido" );
	
	public static StatusFiscNet ErroTransactCheio = new StatusFiscNet( 3001, RELEVANC_ERRO, "registro de transa��es est� esgotado" );
	
	public static StatusFiscNet ErroTransactTransAberta = new StatusFiscNet( 3002, RELEVANC_ERRO, "Tentativa de abrir nova transa��o com trasa��o j� aberta" );
	
	public static StatusFiscNet ErroTransactTransNaoAberta = new StatusFiscNet( 3003, RELEVANC_ERRO, "Tentativa de fechar uma transa��o que n�o se encontra" );
	
	public static StatusFiscNet ErroContextDrvrLeitura = new StatusFiscNet( 4000, RELEVANC_ERRO, "Erro de leitura de dispositivo f�sico" );
	
	public static StatusFiscNet ErroContextDrvrEscrita = new StatusFiscNet( 4001, RELEVANC_ERRO, "Erro de escrita no dispositivo" );
	
	public static StatusFiscNet ErroContextDrvrDesconectado = new StatusFiscNet( 4002, RELEVANC_ERRO, "Dispositivo de contexto foi desconectado" );
	
	public static StatusFiscNet ErroContextDrvrLeituraAposFim = new StatusFiscNet( 4003, RELEVANC_ERRO, "Leitura ap�s final do arquivo" );
	
	public static StatusFiscNet ErroContextDrvrEscritaAposFim = new StatusFiscNet( 4004, RELEVANC_ERRO, "Escrita ap�s final do arquivo" );
	
	public static StatusFiscNet ErroContextVersaoInvalida = new StatusFiscNet( 5000, RELEVANC_ERRO, "vers�o de contexto fiscal no dispositivo n�o foi reconhecida" );
	
	public static StatusFiscNet ErroContextCRC = new StatusFiscNet( 5001, RELEVANC_ERRO, "CRC do dispositivo est� incorreto" );
	
	public static StatusFiscNet ErroContextLimitesExcedidos = new StatusFiscNet( 5002, RELEVANC_ERRO, "Tentativa de escrita fora da �rea de contexto" );
	
	public static StatusFiscNet ErroRelogioInconsistente = new StatusFiscNet( 6000, RELEVANC_ERRO, "Rel�rio do ECF inconsistente" );
	
	public static StatusFiscNet ErroRelogioDataHoraInvalida = new StatusFiscNet( 6001, RELEVANC_ERRO, "Data/hora informadas n�o est�o consistentes" );
	
	public static StatusFiscNet ErroPrintSemMecanismo = new StatusFiscNet( 7000, RELEVANC_ERRO, "Nenhum mecanismo de impress�o presente" );
	
	public static StatusFiscNet ErroPrintDesconectado = new StatusFiscNet( 7001, RELEVANC_ERRO, "Atual mecanismo de impress�o est� desconectado" );
	
	public static StatusFiscNet ErroPrintCapacidadeInesistente = new StatusFiscNet( 7002, RELEVANC_ERRO, "Mecanismo n�o possui capacidade suficiente para realizar esta opera��o" );
	
	public static StatusFiscNet ErroPrintSemPapel = new StatusFiscNet( 7003, RELEVANC_ERRO, "Impressora est� sem papel para imprimir" );
	
	public static StatusFiscNet ErroPrintFaltouPapel = new StatusFiscNet( 7004, RELEVANC_ERRO, "Faltou papel durante a impress�o do comando" );
	
	public static StatusFiscNet ErroCMDForaDeSequencia = new StatusFiscNet( 8000, RELEVANC_ERRO, "Comando fora de sequ�ncia" );
	
	public static StatusFiscNet ErroCMDCodigoInvalido = new StatusFiscNet( 8001, RELEVANC_ERRO, "C�digo mercadoria n�o v�lido" );
	
	public static StatusFiscNet ErroCMDDescricaoInvalida = new StatusFiscNet( 8002, RELEVANC_ERRO, "Descri��o inv�lida" );
	
	public static StatusFiscNet ErroCMDQuantidadeInvalida = new StatusFiscNet( 8003, RELEVANC_ERRO, "Quantidade n�o inv�lida" );
	
	public static StatusFiscNet ErroCMDAliquotaInvalida = new StatusFiscNet( 8004, RELEVANC_ERRO, "�ndice de al�quota n�o v�lido" );
	
	public static StatusFiscNet ErroCMDAliquotaNaoCarregada = new StatusFiscNet( 8005, RELEVANC_ERRO, "Al�quota n�o caregada" );
	
	public static StatusFiscNet ErroCMDValorInvalido = new StatusFiscNet( 8006, RELEVANC_ERRO, "Valor cont�m caracter inv�lido" );
	
	public static StatusFiscNet ErroCMDMontanteOperacao = new StatusFiscNet( 8007, RELEVANC_ERRO, "Total da opera��o igual a 0(zero)" );
	
	public static StatusFiscNet ErroCMDAliquotaIndisponivel = new StatusFiscNet( 8008, RELEVANC_ERRO, "Al�quota n�o dispon�vel para carga" );
	
	public static StatusFiscNet ErroCMDValorAliquotaInvalido = new StatusFiscNet( 8009, RELEVANC_ERRO, "Valor da al�quota n�o v�lido" );
	
	public static StatusFiscNet ErroCMDTrocaSTAposFechamento = new StatusFiscNet( 8010, RELEVANC_ERRO, "Troca de situra��o tribut�ria somente ap�s Redu��o Z" );
	
	public static StatusFiscNet ErroCMDFormaPagamentoInvalida = new StatusFiscNet( 8011, RELEVANC_ERRO, "�ndice de Meio de Pagamento n�o v�lido" );
	
	public static StatusFiscNet ErroCMDPayIndisponivel = new StatusFiscNet( 8012, RELEVANC_ERRO, "Meio de Pagamento indispon�vel para carga" );
	
	public static StatusFiscNet ErroCMDCupomTotalizadoEmZero = new StatusFiscNet( 8013, RELEVANC_ERRO, "Cupom totalizado em 0(zero)" );
	
	public static StatusFiscNet ErroCMDFomraPagamentoIndefinida = new StatusFiscNet( 8014, RELEVANC_ERRO, "Meio de Pagamento n�o definido" );
	
	public static StatusFiscNet ErroCMDtracaUsuarioAposFechamento = new StatusFiscNet( 8015, RELEVANC_ERRO, "Carga de usu�rio permitido somente ap�s Redu��o Z" );
	
	public static StatusFiscNet ErroCMDSemMovimento = new StatusFiscNet( 8016, RELEVANC_ERRO, "Dia sem movimento" );
	
	public static StatusFiscNet ErroCMDPagamentoIncompleto = new StatusFiscNet( 8017, RELEVANC_ERRO, "Total pago inferior ao total do cupom" );
	
	public static StatusFiscNet ErroCMDGerencialNaoDefinido = new StatusFiscNet( 8018, RELEVANC_ERRO, "Gerencial n�o definido" );
	
	public static StatusFiscNet ErroGerencialInvalido = new StatusFiscNet( 8019, RELEVANC_ERRO, "�ndice de Gerencial fora da faixa" );
	
	public static StatusFiscNet ErroCMDGerencialIndisponivel = new StatusFiscNet( 8020, RELEVANC_ERRO, "Gerencial n�o dispon�vel para carga" );
	
	public static StatusFiscNet ErroCMDNomeGerencialInvalido = new StatusFiscNet( 8021, RELEVANC_ERRO, "Nome do Gerencial inv�lido" );
	
	public static StatusFiscNet ErroCMDNaoHaMaisRelatoriosLivres = new StatusFiscNet( 8022, RELEVANC_ERRO, "Esgotado n�mero de Gerenciais" );
	
	public static StatusFiscNet ErroCMDAcertoHVPermitidoAposZ = new StatusFiscNet( 8023, RELEVANC_ERRO, "Acerto do hor�rio de ver�o somente ap�s a Redu��o Z" );
	
	public static StatusFiscNet ErroCMDHorarioVeraoJaRealizado = new StatusFiscNet( 8024, RELEVANC_ERRO, "J� acertou hor�rio de ver�o" );
	
	public static StatusFiscNet ErroCMDAliquotasIndisponiveis = new StatusFiscNet( 8025, RELEVANC_ERRO, "Sem Al�quotas dispon�veis para carga" );
	
	public static StatusFiscNet ErroCMDItemInexistente = new StatusFiscNet( 8026, RELEVANC_ERRO, "Item n�o vendido no cupom" );
	
	public static StatusFiscNet ErroCMDQtdCancInvalida = new StatusFiscNet( 8027, RELEVANC_ERRO, "Quantidade a ser cancelada maior do que a quantidade vendida" );
	
	public static StatusFiscNet ErroCMDCampoCabecalhoInvalido = new StatusFiscNet( 8028, RELEVANC_ERRO, "Cabe�alho possui campos(s) inv�lido(s)" );
	
	public static StatusFiscNet ErroCMDNomeDepartamentoInvalido = new StatusFiscNet( 8029, RELEVANC_ERRO, "NomeDepartamento n�o v�lido" );
	
	public static StatusFiscNet ErroCMDDepartamentoNaoEncontrado = new StatusFiscNet( 8030, RELEVANC_ERRO, "Departamento n�o encontrado" );
	
	public static StatusFiscNet ErroCMDDepartamentoIndefinido = new StatusFiscNet( 8031, RELEVANC_ERRO, "Departamento n�o definido" );
	
	public static StatusFiscNet ErroCMDFormasPagamentosIndisponiveis = new StatusFiscNet( 8032, RELEVANC_ERRO, "N�o h� Meio de Pagamento dispon�vel" );
	
	public static StatusFiscNet ErroCMDAltPagamentosSoAposZ = new StatusFiscNet( 8033, RELEVANC_ERRO, "Altera��o de Meio de Pagamento somente ap�s a Redu��o Z" );
	
	public static StatusFiscNet ErroCMDNomeNalFiscalInvalido = new StatusFiscNet( 8034, RELEVANC_ERRO, "Nome do Documento N�o Fiscal n�o pode ser vazio" );
	
	public static StatusFiscNet ErroCMDDocsFiscaisIndisponiveis = new StatusFiscNet( 8035, RELEVANC_ERRO, "N�o h� mais Documentos N�o Fiscais dispon�veis" );
	
	public static StatusFiscNet ErroCMDnaoFislcaIndisponivel = new StatusFiscNet( 8036, RELEVANC_ERRO, "Documento N�o Fiscal indispon�vel para carga" );
	
	public static StatusFiscNet ErroCMDReducaoInvalida = new StatusFiscNet( 8037, RELEVANC_ERRO, "N�mero de redu��o inicial inv�lida" );
	
	public static StatusFiscNet ErroCMDCabecalhoJaImpresso = new StatusFiscNet( 8038, RELEVANC_ERRO, "Cabe�alho do documento � foi impresso" );
	
	public static StatusFiscNet ErroCMDLinhasSuplementaresExcedidas = new StatusFiscNet( 8039, RELEVANC_ERRO, "N�mero m�ximo de linhas de propaganda excedidas" );
	
	public static StatusFiscNet ErroHorarioVeraoAtualizado = new StatusFiscNet( 8040, RELEVANC_ERRO, "Rel�gio j� est� no estado desejado" );
	
	public static StatusFiscNet ErroCMDValorAcrescimoInvalido = new StatusFiscNet( 8041, RELEVANC_ERRO, "Valor do acr�scimo inconsistente" );
	
	public static StatusFiscNet ErroCMDNaohaMeiodePagamento = new StatusFiscNet( 8042, RELEVANC_ERRO, "N�o h� meio de pagamento definido" );
	
	public static StatusFiscNet ErroCMDCOOVinculadoInvalido = new StatusFiscNet( 8043, RELEVANC_ERRO, "COO do documento vinculado inv�lido" );
	
	public static StatusFiscNet ErroCMDIndiceItemInvalido = new StatusFiscNet( 8044, RELEVANC_ERRO, "�ndice do item inexistente no contexto" );
	
	public static StatusFiscNet ErroCMDCodigoNaoEncontrado = new StatusFiscNet( 8045, RELEVANC_ERRO, "C�digo de item n�o encontrado no cupom atual" );
	
	public static StatusFiscNet ErroCMDPercentualDescontoInvalido = new StatusFiscNet( 8046, RELEVANC_ERRO, "Percentual do desconto ultrapassou 100%" );
	
	public static StatusFiscNet ErroCMDDescontoItemInvalido = new StatusFiscNet( 8047, RELEVANC_ERRO, "Desconto do item inv�lido" );
	
	public static StatusFiscNet ErroCMDFaltaDefinirValor = new StatusFiscNet( 8048, RELEVANC_ERRO, "Falta definir valor percentual ou absoluto em opera��o de desconto/acr�scimo" );
	
	public static StatusFiscNet ErroCMDItemCancelado = new StatusFiscNet( 8049, RELEVANC_ERRO, "Tentativa de opera��o sobre item cancelado" );
	
	public static StatusFiscNet ErroCMDCancelaAcrDescInvalido = new StatusFiscNet( 8050, RELEVANC_ERRO, "Cancelamento de acr�scimo/desconto inv�lidos" );
	
	public static StatusFiscNet ErroCMDAcrDescInvalido = new StatusFiscNet( 8051, RELEVANC_ERRO, "Opera��o de acr�scimo/desconto inv�lida" );
	
	public static StatusFiscNet ErroCMDNaoHaMaisDepartamentosLivres = new StatusFiscNet( 8052, RELEVANC_ERRO, "N�mero de Departamentos esgotados" );
	
	public static StatusFiscNet ErroCMDIndiceNaoFiscalInvalido = new StatusFiscNet( 8053, RELEVANC_ERRO, "�ndice de Documento N�o Fiscal fora da faixa" );
	
	public static StatusFiscNet ErroCMDTrocaN�oFiscalAposZ = new StatusFiscNet( 8054, RELEVANC_ERRO, "Troca de Documento N�o Fiscal somente ap�s a Redu��o Z" );
	
	public static StatusFiscNet ErroCMDInscricaoInvalida = new StatusFiscNet( 8055, RELEVANC_ERRO, "CNPJ e/ou Inscri��o Estadual inv�lida(s)" );
	
	public static StatusFiscNet ErroCMDVinculadoParametrosInsuficientes = new StatusFiscNet( 8056, RELEVANC_ERRO, "Falta(m) par�mentro(s) no comando de abertura de Comprovante Cr�dito ou D�bito" );
	
	public static StatusFiscNet ErroCMDNaoFiscalIndefinido = new StatusFiscNet( 8057, RELEVANC_ERRO, "C�digo e Nome do Documento N�o Fiscal indefinidos" );
	
	public static StatusFiscNet ErroCMDFaltaAliquotaVenda = new StatusFiscNet( 8058, RELEVANC_ERRO, "Al�quota n�o definida no comando de venda" );
	
	public static StatusFiscNet ErroCMDFaltaMeioPagamento = new StatusFiscNet( 8059, RELEVANC_ERRO, "C�digo e Nome do Meio de Pagamento n�o definidos" );
	
	public static StatusFiscNet ErroCMDFaltaParametro = new StatusFiscNet( 8060, RELEVANC_ERRO, "Par�metro de comando n�o informado" );
	
	public static StatusFiscNet ErroCMDNaoHaDocNaoFiscaisDefinidos = new StatusFiscNet( 8061, RELEVANC_ERRO, "N�o h� Documentos N�o Fiscais definidos" );
	
	public static StatusFiscNet ErroCMDOperacaoJaCancelada = new StatusFiscNet( 8062, RELEVANC_ERRO, "Acr�scimo/Desconto de item j� cancelado" );
	
	public static StatusFiscNet ErroCMDNaohaAcresDescItem = new StatusFiscNet( 8063, RELEVANC_ERRO, "N�o h� acr�scimo/desconto em item" );
	
	public static StatusFiscNet ErroCMDItemAcrescido = new StatusFiscNet( 8064, RELEVANC_ERRO, "Item j� possui acr�scimo" );
	
	public static StatusFiscNet ErroCMDOperSoEmICMS = new StatusFiscNet( 8065, RELEVANC_ERRO, "Opera��o de acr�scimo em item ou subtotal s� � v�lido para ICMS" );
	
	public static StatusFiscNet ErroCMDFaltaInformaValor = new StatusFiscNet( 8066, RELEVANC_ERRO, "Valor do Comprovante Cr�dito ou D�bito n�o informado" );
	
	public static StatusFiscNet ErroCMDCOOInvalido = new StatusFiscNet( 8067, RELEVANC_ERRO, "COO inv�lido" );
	
	public static StatusFiscNet ErroCMDIndiceInvalido = new StatusFiscNet( 8068, RELEVANC_ERRO, "�ndice do Meio de Pagamento no cupom inv�lido" );
	
	public static StatusFiscNet ErroCMDCupomNaoEncontrado = new StatusFiscNet( 8069, RELEVANC_ERRO, "Documento N�o Fiscal n�o encontrado" );
	
	public static StatusFiscNet ErroCMDSequenciaPagamentoNaoEncontrada = new StatusFiscNet( 8070, RELEVANC_ERRO, "Sequ�ncia de pagamento n�o encontrada no cupom" );
	
	public static StatusFiscNet ErroCMDPagamentoNaoPermiteCDC = new StatusFiscNet( 8071, RELEVANC_ERRO, "Meio de Pagamento n�o permite CDC" );
	
	public static StatusFiscNet ErroCMDUltimaFormaPagamentoInv = new StatusFiscNet( 8072, RELEVANC_ERRO, "Valor insuficiente para pagar o cupom" );
	
	public static StatusFiscNet ErroCMDMeioPagamentoNEncontrado = new StatusFiscNet( 8073, RELEVANC_ERRO, "Meio de Pagamento origem ou destino n�o encontrado no �ltimo cupom emitido" );
	
	public static StatusFiscNet ErroCMDValorEstornoInvalido = new StatusFiscNet( 8074, RELEVANC_ERRO, "Valor do estorno n�o pode exceder o valor do pagamento no meio origem" );
	
	public static StatusFiscNet ErroCMDMeiosPagamentoOrigemDestinoIguais = new StatusFiscNet( 8075, RELEVANC_ERRO, "Meios de Pagamento origem e destino devem ser diferentes no estorno" );
	
	public static StatusFiscNet ErroCMDPercentualInvalido = new StatusFiscNet( 8076, RELEVANC_ERRO, "Percentual da al�quota inv�lido" );
	
	public static StatusFiscNet ErroCMDNaoHouveOpSubtotal = new StatusFiscNet( 8077, RELEVANC_ERRO, "N�o houve opera��o em subtotal para ser cancelada" );
	
	public static StatusFiscNet ErroCMDOpSubtotalInvalida = new StatusFiscNet( 8078, RELEVANC_ERRO, "S� � permitida uma opera��o de acr�scimo em suvtotal por cupom" );
	
	public static StatusFiscNet ErroCMDTextoAdicional = new StatusFiscNet( 8079, RELEVANC_ERRO, "Texto adicional do meio de pagamento dever ter no m�ximo 2 linhas" );
	
	public static StatusFiscNet ErroCMDPrecoUnitarioInvalido = new StatusFiscNet( 8080, RELEVANC_ERRO, "Pre�o unit�rio ultrapassou o n�mero m�ximo de d�gitos permitido" );
	
	public static StatusFiscNet ErroCMDDepartamentoInvalido = new StatusFiscNet( 8081, RELEVANC_ERRO, "C�digo do departamento fora da faixa" );
	
	public static StatusFiscNet ErroCDMDescontoInvalido = new StatusFiscNet( 8082, RELEVANC_ERRO, "O valor do desconto n�o pode zerar o valor do cupom ou ser maior que o item" );
	
	public static StatusFiscNet ErroCMDPercentualAcrescimoInvalido = new StatusFiscNet( 8083, RELEVANC_ERRO, "Percentual de acr�scimo n�o pode ser superior a 999,99%" );
	
	public static StatusFiscNet ErroCMDAcrescimoInvalido = new StatusFiscNet( 8084, RELEVANC_ERRO, "Valor do acr�scimo ultrapassa o n�mero m�ximo de digitos permitido (13 d�gitos)" );
	
	public static StatusFiscNet ErroCMDNaoHouveVendaEmICMS = new StatusFiscNet( 8085, RELEVANC_ERRO, "Cupom sem venda em al�quota de ICMS" );
	
	public static StatusFiscNet ErroCMDCancelamentoInvalido = new StatusFiscNet( 8086, RELEVANC_ERRO, "Cancelamento inv�lido" );
	
	public static StatusFiscNet ErroCMDCliche = new StatusFiscNet( 8087, RELEVANC_ERRO, "Texto de cliche do usu�rio dever ter no m�ximo tr�s linhas" );
	
	public static StatusFiscNet ErroCMDNaoHouveVendaNaoFiscal = new StatusFiscNet( 8088, RELEVANC_ERRO, "N�o houve venda de item n�o fiscal" );
	
	public static StatusFiscNet ErroCMDDataInvalida = new StatusFiscNet( 8089, RELEVANC_ERRO, "A data n�o pode ser inferior a data do �ltimo documento emitido" );
	
	public static StatusFiscNet ErroCMDHoraInvalida = new StatusFiscNet( 8090, RELEVANC_ERRO, "A hora informada no comando n�o pode ser inferior ao hor�rio do �ltimo documento" );
	
	public static StatusFiscNet ErroCMDEstorno = new StatusFiscNet( 8091, RELEVANC_ERRO, "Sem fun��o" );
	
	public static StatusFiscNet ErroCMDAcertoRelogio = new StatusFiscNet( 8092, RELEVANC_ERRO, "Estado inv�lido para ajuste de relogio ou hor�rio de ver�o" );
	
	public static StatusFiscNet ErroCMDCDCInvalido = new StatusFiscNet( 8093, RELEVANC_ERRO, "A opera��o de CDC deve preceder as opera��es de estorno de meio de pagamento" );
	
	public static StatusFiscNet ErroSenhaInvalida = new StatusFiscNet( 8094, RELEVANC_ERRO, "Senha inv�lida para inicializa��o do propriet�rio" );
	
	public static StatusFiscNet ErroCMDMecanismoCheque = new StatusFiscNet( 8095, RELEVANC_ERRO, "Erro gerado pelo mecanismo de cheques" );
	
	public static StatusFiscNet ErroFaltaIniciarDia = new StatusFiscNet( 8096, RELEVANC_ERRO, "Comando v�lido somente ap�s a abertura do dia" );
	
	public static StatusFiscNet ErroMFDNenhumCartuchoVazio = new StatusFiscNet( 9000, RELEVANC_ERRO, "N�o foi encontrado nenhum cartucho de dados vazion para ser inicializado" );
	
	public static StatusFiscNet ErroMFDCartuchoInexistente = new StatusFiscNet( 9001, RELEVANC_ERRO, "Cartucho com o n�mero de s�rie informado n�o foi encontrado" );
	
	public static StatusFiscNet ErroMFDNumSerie = new StatusFiscNet( 9002, RELEVANC_ERRO, "N�mero de s�rie do ECF � inv�lido na inicializa��o" );
	
	public static StatusFiscNet ErroMFDCartuchoDesconhecido = new StatusFiscNet( 9003, RELEVANC_ERRO, "Cartucho de MFD desconctado ou com problemas" );
	
	public static StatusFiscNet ErroMFDEscrita = new StatusFiscNet( 9004, RELEVANC_ERRO, "Erro de escrita no dispositivo de MDF" );
	
	public static StatusFiscNet ErroMFDSeek = new StatusFiscNet( 9005, RELEVANC_ERRO, "Erro na tentativa de posicionar ponteiro de leitura" );
	
	public static StatusFiscNet ErroMFDBadBadSector = new StatusFiscNet( 9006, RELEVANC_ERRO, "Endere�� do bad Sector informado � inv�lido" );
	
	public static StatusFiscNet ErroMFDLeitura = new StatusFiscNet( 9007, RELEVANC_ERRO, "Erro de leitura na MFD" );
	
	public static StatusFiscNet ErroMFDLeituraAlemEOF = new StatusFiscNet( 9008, RELEVANC_ERRO, "Tentativa de leitura al�m dos limites da MFD" );
	
	public static StatusFiscNet ErroMFDEsgotada = new StatusFiscNet( 9009, RELEVANC_ERRO, "MFD n�o possui mais espa�o para escrita" );
	
	public static StatusFiscNet ErroMFDLeituraInterrompida = new StatusFiscNet( 9010, RELEVANC_ERRO, "Leitura da MFD serial � interrompida por comando diferente de LeImpressao" );
	
	public static StatusFiscNet ErroBNFEstadoInvalido = new StatusFiscNet( 10000, RELEVANC_ERRO, "Estado inv�lido para registro sendo codificado" );
	
	public static StatusFiscNet ErroBNDParametroInvalido = new StatusFiscNet( 10001, RELEVANC_ERRO, "Inconsist�ncia nos par�mentros lidos no Logger" );
	
	public static StatusFiscNet ErroBNFRegistroInvalido = new StatusFiscNet( 10002, RELEVANC_ERRO, "Registro inv�lido detectado no Logger" );
	
	public static StatusFiscNet ErroBNFErroMFD = new StatusFiscNet( 10003, RELEVANC_ERRO, "Erro interno" );
	
	public static StatusFiscNet ErroProtParamInvalido = new StatusFiscNet( 11000, RELEVANC_ERRO, "Par�metro repassado ao comando � inv�lido" );
	
	public static StatusFiscNet ErroProtParamSintaxe = new StatusFiscNet( 11001, RELEVANC_ERRO, "Erro de sintaxe na lista de par�metros" );
	
	public static StatusFiscNet ErroProtParamValorInvalido = new StatusFiscNet( 11002, RELEVANC_ERRO, "Valor inv�lido para par�metro do comando" );
	
	public static StatusFiscNet ErroProtParamStringInvalido = new StatusFiscNet( 11003, RELEVANC_ERRO, "String cont�m sequ�ncia de caracteres inv�lidos" );
	
	public static StatusFiscNet ErroProtParamRedefinido = new StatusFiscNet( 11004, RELEVANC_ERRO, "Par�metro foi declarado 2 ou mais vezes na lista" );
	
	public static StatusFiscNet ErroProtParamIndefinido = new StatusFiscNet( 11005, RELEVANC_ERRO, "Par�metro obrigat�rio ausente na lista" );
	
	public static StatusFiscNet ErroProtComandoIncexistente = new StatusFiscNet( 11006, RELEVANC_ERRO, "N�o existe o comando no protocolo" );
	
	public static StatusFiscNet ErroProtSequenciaComando = new StatusFiscNet( 11007, RELEVANC_ERRO, "Estado atual n�o permite a execu��o deste comando" );
	
	public static StatusFiscNet ErroProtAborta2aVia = new StatusFiscNet( 11008, RELEVANC_ERRO, "Sinaliza��o indicando que comando aborta a impress�o da segunda via" );
	
	public static StatusFiscNet ErroProtSemRetorno = new StatusFiscNet( 11009, RELEVANC_ERRO, "Sinaliza��o indicando que comando n�o possui retorno" );
	
	public static StatusFiscNet ErroProtTimeout = new StatusFiscNet( 11010, RELEVANC_ERRO, "Tempo de execu��o esgotado" );
	
	public static StatusFiscNet ErroProtNomeRegistrador = new StatusFiscNet( 11011, RELEVANC_ERRO, "Nome de registrador inv�lido" );
	
	public static StatusFiscNet ErroProttipoRegistrador = new StatusFiscNet( 11012, RELEVANC_ERRO, "Tipo de registrador inv�lido" );
	
	public static StatusFiscNet ErroProtSomenteLeitura = new StatusFiscNet( 11013, RELEVANC_ERRO, "Tentativa de escrita em registrador de apenas leitura" );
	
	public static StatusFiscNet ErroProtSomenteEscrita = new StatusFiscNet( 11014, RELEVANC_ERRO, "Tentativa de leitura em registrador de apenas escrita" );
	
	public static StatusFiscNet ErroProtComandoDiferenteAnterior = new StatusFiscNet( 11015, RELEVANC_ERRO, "Comando recebido diferente do anterior no buffer de recep��o" );
	
	public static StatusFiscNet ErroProtFilaCheia = new StatusFiscNet( 11016, RELEVANC_ERRO, "Fila de comando cheia" );
	
	public static StatusFiscNet ErroProtIndiceRegistrador = new StatusFiscNet( 11017, RELEVANC_ERRO, "�ndice de registrador indexado fora dos limites" );
	
	public static StatusFiscNet ErroProtNumEmissoesExcedido = new StatusFiscNet( 11018, RELEVANC_ERRO, "N�mero de emiss�es do Logger foi excedido na Interven��o T�cnica" );
	
	public static StatusFiscNet ErroMathDivisaoPorZero = new StatusFiscNet( 11019, RELEVANC_ERRO, "Divis�o por 0(zero) nas rotinas de BDC" );
	
	public static StatusFiscNet ErroApenasIntTecnica = new StatusFiscNet( 15001, RELEVANC_ERRO, "Comando aceito apenas em modo de Interven��o T�cnica" );
	
	public static StatusFiscNet ErroECFIntTecnica = new StatusFiscNet( 15002, RELEVANC_ERRO, "Comando n�o pode ser executado em modo de Interven��o T�cnica" );
	
	public static StatusFiscNet ErroMFDPresente = new StatusFiscNet( 15003, RELEVANC_ERRO, "J� existe MFD presente neste ECF" );
	
	public static StatusFiscNet ErroSemMFD = new StatusFiscNet( 15004, RELEVANC_ERRO, "N�o existe MFD neste ECF" );
	
	public static StatusFiscNet ErroRAMInconsistente = new StatusFiscNet( 15005, RELEVANC_ERRO, "Mem�ria RAM do ECF n�o esta consistente" );
	
	public static StatusFiscNet ErroMemoriaFiscalDesconectada = new StatusFiscNet( 15006, RELEVANC_ERRO, "Mem�ria fiscal n�o encontrada" );
	
	public static StatusFiscNet ErroDiaFechado = new StatusFiscNet( 15007, RELEVANC_ERRO, "Dia j� fechado" );
	
	public static StatusFiscNet ErroDiaAberto = new StatusFiscNet( 15008, RELEVANC_ERRO, "Dia aberto" );
	
	public static StatusFiscNet ErroZPendente = new StatusFiscNet( 15009, RELEVANC_ERRO, "Falta Redu��o Z" );
	
	public static StatusFiscNet ErroMecanismoNaoConfigurado = new StatusFiscNet( 15010, RELEVANC_ERRO, "Mecanismo impressor n�o selecionado" );
	
	public static StatusFiscNet ErroSemPapel = new StatusFiscNet( 15011, RELEVANC_ERRO, "Sem bobina de papel na esta��o de documento fiscal" );
	
	public static StatusFiscNet ErroDocumentoEncerrado = new StatusFiscNet( 15012, RELEVANC_ERRO, "Tentativa de finalizar documento j� encerrado" );
	
	public static StatusFiscNet ErroSemSinalDTR = new StatusFiscNet( 15013, RELEVANC_ERRO, "N�o h� sinal de DTR" );
	
	public static StatusFiscNet ErroSemInscricoes = new StatusFiscNet( 15014, RELEVANC_ERRO, "Sem inscri��es do usu�rio no ECF" );
	
	public static StatusFiscNet ErroSemCliche = new StatusFiscNet( 15015, RELEVANC_ERRO, "Sem dados do propriet�rio no ECF" );
	
	public static StatusFiscNet ErroEmLinha = new StatusFiscNet( 15016, RELEVANC_ERRO, "ECF encontra-se indevidamente em linha" );
	
	public static StatusFiscNet ErroForaDeLinha = new StatusFiscNet( 15017, RELEVANC_ERRO, "ECF n�o encontra-se em linha para executar o comando" );
	
	public static StatusFiscNet ErroMecanismoBloqueado = new StatusFiscNet( 15018, RELEVANC_ERRO, "Mecanismo est� indispon�vel para impress�o" );

	private String message;
	
	private String messageComplementar;

	private int code;

	private int relevanc;

	private static final List<StatusFiscNet> statusList = new ArrayList<StatusFiscNet>();
	
	
	static {
		statusList.add( ErroGeralFalRAM );
		statusList.add( ErroGeralPerdaRAM );
		statusList.add( ErroMFDesconectada );
		statusList.add( ErroMFLeitura );
		statusList.add( ErroMFApenasLeitura );
		statusList.add( ErroMFTamRegistro );
		statusList.add( ErroMFCheia );
		statusList.add( ErroMFCartuchosExcedidos );
		statusList.add( ErroMFJaInicializada );
		statusList.add( ErroMFNaoInicializada );
		statusList.add( ErroMFUsuariosExcedidos );
		statusList.add( ErroMFIntervencoesExedidas );
		statusList.add( ErroMFVersoesExcedidas );
		statusList.add( ErroMFReducoesExcedidas );
		statusList.add( ErroMFGravacao );
		statusList.add( ErroTransactDrvrLeitura );
		statusList.add( ErroTransactDrvrEscrita );
		statusList.add( ErroTransactDrvrDesconectado );
		statusList.add( ErroTransactRegInvalido );
		statusList.add( ErroTransactCheio );
		statusList.add( ErroTransactTransAberta );
		statusList.add( ErroTransactTransNaoAberta );
		statusList.add( ErroContextDrvrLeitura );
		statusList.add( ErroContextDrvrEscrita );
		statusList.add( ErroContextDrvrDesconectado );
		statusList.add( ErroContextDrvrLeituraAposFim );
		statusList.add( ErroContextDrvrEscritaAposFim );
		statusList.add( ErroContextVersaoInvalida );
		statusList.add( ErroContextCRC );
		statusList.add( ErroContextLimitesExcedidos );
		statusList.add( ErroRelogioInconsistente );
		statusList.add( ErroRelogioDataHoraInvalida );
		statusList.add( ErroPrintSemMecanismo );
		statusList.add( ErroPrintDesconectado );
		statusList.add( ErroPrintCapacidadeInesistente );
		statusList.add( ErroPrintSemPapel );
		statusList.add( ErroPrintFaltouPapel );
		statusList.add( ErroCMDForaDeSequencia );
		statusList.add( ErroCMDCodigoInvalido );
		statusList.add( ErroCMDDescricaoInvalida );
		statusList.add( ErroCMDQuantidadeInvalida );
		statusList.add( ErroCMDAliquotaInvalida );
		statusList.add( ErroCMDAliquotaNaoCarregada );
		statusList.add( ErroCMDValorInvalido );
		statusList.add( ErroCMDMontanteOperacao );
		statusList.add( ErroCMDAliquotaIndisponivel );
		statusList.add( ErroCMDValorAliquotaInvalido );
		statusList.add( ErroCMDTrocaSTAposFechamento );
		statusList.add( ErroCMDFormaPagamentoInvalida );
		statusList.add( ErroCMDPayIndisponivel );
		statusList.add( ErroCMDCupomTotalizadoEmZero );
		statusList.add( ErroCMDFomraPagamentoIndefinida );
		statusList.add( ErroCMDtracaUsuarioAposFechamento );
		statusList.add( ErroCMDSemMovimento );
		statusList.add( ErroCMDPagamentoIncompleto );
		statusList.add( ErroCMDGerencialNaoDefinido );
		statusList.add( ErroGerencialInvalido );
		statusList.add( ErroCMDGerencialIndisponivel );
		statusList.add( ErroCMDNomeGerencialInvalido );
		statusList.add( ErroCMDNaoHaMaisRelatoriosLivres );
		statusList.add( ErroCMDAcertoHVPermitidoAposZ );
		statusList.add( ErroCMDHorarioVeraoJaRealizado );
		statusList.add( ErroCMDAliquotasIndisponiveis );
		statusList.add( ErroCMDItemInexistente );
		statusList.add( ErroCMDQtdCancInvalida );
		statusList.add( ErroCMDCampoCabecalhoInvalido );
		statusList.add( ErroCMDNomeDepartamentoInvalido );
		statusList.add( ErroCMDDepartamentoNaoEncontrado );
		statusList.add( ErroCMDDepartamentoIndefinido );
		statusList.add( ErroCMDFormasPagamentosIndisponiveis );
		statusList.add( ErroCMDAltPagamentosSoAposZ );
		statusList.add( ErroCMDNomeNalFiscalInvalido );
		statusList.add( ErroCMDDocsFiscaisIndisponiveis );
		statusList.add( ErroCMDnaoFislcaIndisponivel );
		statusList.add( ErroCMDReducaoInvalida );
		statusList.add( ErroCMDCabecalhoJaImpresso );
		statusList.add( ErroCMDLinhasSuplementaresExcedidas );
		statusList.add( ErroHorarioVeraoAtualizado );
		statusList.add( ErroCMDValorAcrescimoInvalido );
		statusList.add( ErroCMDNaohaMeiodePagamento );
		statusList.add( ErroCMDCOOVinculadoInvalido );
		statusList.add( ErroCMDIndiceItemInvalido );
		statusList.add( ErroCMDCodigoNaoEncontrado );
		statusList.add( ErroCMDPercentualDescontoInvalido );
		statusList.add( ErroCMDDescontoItemInvalido );
		statusList.add( ErroCMDFaltaDefinirValor );
		statusList.add( ErroCMDItemCancelado );
		statusList.add( ErroCMDCancelaAcrDescInvalido );
		statusList.add( ErroCMDAcrDescInvalido );
		statusList.add( ErroCMDNaoHaMaisDepartamentosLivres );
		statusList.add( ErroCMDIndiceNaoFiscalInvalido );
		statusList.add( ErroCMDTrocaN�oFiscalAposZ );
		statusList.add( ErroCMDInscricaoInvalida );
		statusList.add( ErroCMDVinculadoParametrosInsuficientes );
		statusList.add( ErroCMDNaoFiscalIndefinido );
		statusList.add( ErroCMDFaltaAliquotaVenda );
		statusList.add( ErroCMDFaltaMeioPagamento );
		statusList.add( ErroCMDFaltaParametro );
		statusList.add( ErroCMDNaoHaDocNaoFiscaisDefinidos );
		statusList.add( ErroCMDOperacaoJaCancelada );
		statusList.add( ErroCMDNaohaAcresDescItem );
		statusList.add( ErroCMDItemAcrescido );
		statusList.add( ErroCMDOperSoEmICMS );
		statusList.add( ErroCMDFaltaInformaValor );
		statusList.add( ErroCMDCOOInvalido );
		statusList.add( ErroCMDIndiceInvalido );
		statusList.add( ErroCMDCupomNaoEncontrado );
		statusList.add( ErroCMDSequenciaPagamentoNaoEncontrada );
		statusList.add( ErroCMDPagamentoNaoPermiteCDC );
		statusList.add( ErroCMDUltimaFormaPagamentoInv );
		statusList.add( ErroCMDMeioPagamentoNEncontrado );
		statusList.add( ErroCMDValorEstornoInvalido );
		statusList.add( ErroCMDMeiosPagamentoOrigemDestinoIguais );
		statusList.add( ErroCMDPercentualInvalido );
		statusList.add( ErroCMDNaoHouveOpSubtotal );
		statusList.add( ErroCMDOpSubtotalInvalida );
		statusList.add( ErroCMDTextoAdicional );
		statusList.add( ErroCMDPrecoUnitarioInvalido );
		statusList.add( ErroCMDDepartamentoInvalido );
		statusList.add( ErroCDMDescontoInvalido );
		statusList.add( ErroCMDPercentualAcrescimoInvalido );
		statusList.add( ErroCMDAcrescimoInvalido );
		statusList.add( ErroCMDNaoHouveVendaEmICMS );
		statusList.add( ErroCMDCancelamentoInvalido );
		statusList.add( ErroCMDCliche );
		statusList.add( ErroCMDNaoHouveVendaNaoFiscal );
		statusList.add( ErroCMDDataInvalida );
		statusList.add( ErroCMDHoraInvalida );
		statusList.add( ErroCMDEstorno );
		statusList.add( ErroCMDAcertoRelogio );
		statusList.add( ErroCMDCDCInvalido );
		statusList.add( ErroSenhaInvalida );
		statusList.add( ErroCMDMecanismoCheque );
		statusList.add( ErroFaltaIniciarDia );
		statusList.add( ErroMFDNenhumCartuchoVazio );
		statusList.add( ErroMFDCartuchoInexistente );
		statusList.add( ErroMFDNumSerie );
		statusList.add( ErroMFDCartuchoDesconhecido );
		statusList.add( ErroMFDEscrita );
		statusList.add( ErroMFDSeek );
		statusList.add( ErroMFDBadBadSector );
		statusList.add( ErroMFDLeitura );
		statusList.add( ErroMFDLeituraAlemEOF );
		statusList.add( ErroMFDEsgotada );
		statusList.add( ErroMFDLeituraInterrompida );
		statusList.add( ErroBNFEstadoInvalido );
		statusList.add( ErroBNDParametroInvalido );
		statusList.add( ErroBNFRegistroInvalido );
		statusList.add( ErroBNFErroMFD );
		statusList.add( ErroProtParamInvalido );
		statusList.add( ErroProtParamSintaxe );
		statusList.add( ErroProtParamValorInvalido );
		statusList.add( ErroProtParamStringInvalido );
		statusList.add( ErroProtParamRedefinido );
		statusList.add( ErroProtParamIndefinido );
		statusList.add( ErroProtComandoIncexistente );
		statusList.add( ErroProtSequenciaComando );
		statusList.add( ErroProtAborta2aVia );
		statusList.add( ErroProtSemRetorno );
		statusList.add( ErroProtTimeout );
		statusList.add( ErroProtNomeRegistrador );
		statusList.add( ErroProttipoRegistrador );
		statusList.add( ErroProtSomenteLeitura );
		statusList.add( ErroProtSomenteEscrita );
		statusList.add( ErroProtComandoDiferenteAnterior );
		statusList.add( ErroProtFilaCheia );
		statusList.add( ErroProtIndiceRegistrador );
		statusList.add( ErroProtNumEmissoesExcedido );
		statusList.add( ErroMathDivisaoPorZero );
		statusList.add( ErroApenasIntTecnica );
		statusList.add( ErroECFIntTecnica );
		statusList.add( ErroMFDPresente );
		statusList.add( ErroSemMFD );
		statusList.add( ErroRAMInconsistente );
		statusList.add( ErroMemoriaFiscalDesconectada );
		statusList.add( ErroDiaFechado );
		statusList.add( ErroDiaAberto );
		statusList.add( ErroZPendente );
		statusList.add( ErroMecanismoNaoConfigurado );
		statusList.add( ErroSemPapel );
		statusList.add( ErroDocumentoEncerrado );
		statusList.add( ErroSemSinalDTR );
		statusList.add( ErroSemInscricoes );
		statusList.add( ErroSemCliche );
		statusList.add( ErroEmLinha );
		statusList.add( ErroForaDeLinha );
		statusList.add( ErroMecanismoBloqueado );
	}
	
	public static StatusFiscNet getStatusElginX5( int code, String messageComplementar ) {
		
		StatusFiscNet status = null;
		
		for ( StatusFiscNet sd : statusList ) {
			if ( sd.getCode() == code ) {
				status = sd;
				status.setMessageComplementar( messageComplementar );
				break;
			}
		}
		
		return status;
	}

	public StatusFiscNet( int code, int relevanc, String message ) {

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
		return message + (getMessageComplementar()==null ? "" : (": " + getMessageComplementar()) ) ;
	}
	
	public String getMessageComplementar() {	
		return messageComplementar;
	}
	
	public void setMessageComplementar( String messageComplementar ) {	
		this.messageComplementar = messageComplementar;
	}

	public void setRelevanc( int relevanc ) {	
		this.relevanc = relevanc;
	}

	public int getRelevanc() {
		return relevanc;
	}
}
