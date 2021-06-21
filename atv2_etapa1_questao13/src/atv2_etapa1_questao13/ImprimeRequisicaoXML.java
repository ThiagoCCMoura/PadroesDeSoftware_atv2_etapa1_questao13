package atv2_etapa1_questao13;

public class ImprimeRequisicaoXML implements Chain {

private Chain proximoNaChain; 
	
	@Override
	public void setProximo(Chain c) {
		this.proximoNaChain = c;
	}

	@Override
	public void processo(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato()==Formato.XML) {
			System.out.println("\n############ Formato XML ############\n");
			System.out.println("<conta > <numero>"+conta.getNumero()+"</numero> <saldo> "+conta.getSaldo()+"</saldo></conta>");		
		}
		else {
			//proximoNaChain.processo(requisicao);
		}
	}

}
