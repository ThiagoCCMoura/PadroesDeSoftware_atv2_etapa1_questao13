package atv2_etapa1_questao13;

public class Teste {

	public static void main(String[] args) {
		
		Chain chain1 = new ImprimeRequisicaoJSON();
		Chain chain2 = new ImprimeRequisicaoXML();
		Chain chain3 = new ImprimeRequisicaoCSV();
		chain1.setProximo(chain2);
		chain2.setProximo(chain3);
		
		
		Conta c1 = new Conta(1111, 11.11);
		Conta c2 = new Conta(2222, 22.22);
		Conta c3 = new Conta(3333, 33.33);
		
		Requisicao r1 = new Requisicao(Formato.JSON);
		Requisicao r2 = new Requisicao(Formato.XML); 		
		Requisicao r3 = new Requisicao(Formato.CSV);
		
		chain1.processo(r2, c1);
		
		
		
		
	}

}
