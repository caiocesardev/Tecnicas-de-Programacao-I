package SistemaBanco;
import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public Gerente() {}
	
	public Gerente(String nome, String cpf,double salario, int senha, int numeroDeFuncionariosGerenciados) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado.");
			return false;
		}
	}
	
	public boolean alterarSenha(int senhaAtual) {
		if (autentica(senhaAtual)) {
			int novaSenha = Integer.parseInt(JOptionPane.showInputDialog("Informe a nova senha: "));
			int confirmacaoNovaSenha = Integer.parseInt(JOptionPane.showInputDialog("Confirme a nova senha: "));
			
			if(novaSenha == confirmacaoNovaSenha) {
				this.senha = novaSenha;
				JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
			}
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Senha atual incorreta!");
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	
}
