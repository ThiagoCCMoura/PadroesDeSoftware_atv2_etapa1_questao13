package atv2_etapa1_questao13;

public interface Chain {
	
	public abstract void setProximo (Chain proximoNaChain);
	public abstract void processo (Requisicao requisicao, Conta conta);
}
