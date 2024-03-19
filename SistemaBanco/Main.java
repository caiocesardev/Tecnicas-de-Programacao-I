package SistemaBanco;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Nelson","1244214214", 5000);
		Gerente g1 = new Gerente("Caio","421421244124", 5000, 123456, 10);	
		
		Conta cc = new ContaCorrente(f1, 0);
		Conta cl = new ContaLimite(g1, 0, 200);
		
		cc.depositar(350);
		cl.depositar(100);
		
		System.out.println(cl.toString());
	
		cl.transferir(cc, 200);
		
		System.out.println(cc.toString());

	}

}
