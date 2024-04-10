package exercicio12;

public class Gerente extends Empregado {
	private String departamento;

	public Gerente(String nome, float salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Departamento: " + departamento;
	}

}
