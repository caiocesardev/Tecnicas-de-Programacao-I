package exercicio12;

public class Empregado {
	protected String nome;
	protected float salario;
	
	public Empregado(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	@Override
    public String toString() {
        return "Nome do empregado= " + nome +
        		", salario= " + salario;
    }

}
