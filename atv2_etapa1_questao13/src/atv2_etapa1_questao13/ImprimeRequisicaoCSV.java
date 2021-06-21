package atv2_etapa1_questao13;

public class ImprimeRequisicaoCSV implements Chain{
	
	private Chain proximoNaChain; 
	
	@Override
	public void setProximo(Chain c) {
		this.proximoNaChain = c;
	}

	@Override
	public void processo(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato()==Formato.CSV) {
			System.out.println("\n############ Formato CSV ############\n");
			System.out.println(conta.getNumero()+"%"+conta.getSaldo());
		}
		else {
			proximoNaChain.processo(requisicao, conta);
		}
	}
	
}
