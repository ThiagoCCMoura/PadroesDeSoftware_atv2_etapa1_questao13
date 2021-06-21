package atv2_etapa1_questao13;

public class ImprimeRequisicaoJSON implements Chain{

	private Chain proximoNaChain; 
	
	@Override
	public void setProximo(Chain c) {
		this.proximoNaChain = c;
	}

	@Override
	public void processo(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato()==Formato.JSON) {
			System.out.println("\n############ Formato JSON ############\n");
			System.out.println("{ numero: "+conta.getNumero()+", saldo:"+conta.getSaldo()+" }");
		}
		else {
			proximoNaChain.processo(requisicao, conta);
		}
	}

}
