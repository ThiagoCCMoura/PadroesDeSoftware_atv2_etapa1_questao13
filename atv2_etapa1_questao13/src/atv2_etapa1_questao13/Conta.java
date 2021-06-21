package atv2_etapa1_questao13;

public class Conta {
	
	int numero;
	double saldo;
	
	public Conta (int numero, double saldo) {
		this.numero = numero;
		this.saldo =saldo;
	}

	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
