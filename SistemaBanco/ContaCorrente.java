package SistemaBanco;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		
	}

	public ContaCorrente(Funcionario titular, double saldo) {
		super(titular, saldo);
		
	}

	@Override
	public String toString() {
		return "ContaCorrente [getTitular()=" + getTitular() + ", getSaldo()=" + getSaldo() + ", getClass()="
				+ getClass() + "]";
	}

}
