package exercicio12;

public class TesteEmpregados {


	public static void main(String[] args) {
		Gerente gerente = new Gerente("Nelson Firmino", (float) 8500.0, "Gerente de Vendas");
		System.out.println(gerente);
	
		Vendedor vendedor = new Vendedor("Peterson Carvalho", (float) 4000.0, 0.2);
		System.out.println(vendedor);
	}

}
