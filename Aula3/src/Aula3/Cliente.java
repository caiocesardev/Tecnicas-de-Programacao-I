package Aula3;

public class Cliente {
	public String idCliente;
	public String nome;
	public String endereco;
	public String cpf;
	
	public Cliente () {}
	public Cliente(String nome, String cpf) {
		this.nome= nome;
		this.cpf= cpf;
	}
	
	// sobreposição
	@Override
	public String toString() {
		return ("\n Nome: "+this.nome +"CPF: "+this.cpf);
		
	}
	
	
}
	
	
	
