package exercicio12;

public class Vendedor extends Empregado {
	private double percentualComissao;

	public Vendedor(String nome, float salario, double percentualComissao) {
		super(nome, salario);
		this.percentualComissao = percentualComissao;
	}
	
	public double calcularSalario() {
		return salario + (salario * percentualComissao);
	}
	
	@Override
	public String toString() {
		return "Nome do vendedor=" + nome +
                ", salário sem comissão=" + salario +
                ", salário com comissão=" + calcularSalario() +
                ", percentual de comissão=" + (percentualComissao * 100) + "%";
	}

}
