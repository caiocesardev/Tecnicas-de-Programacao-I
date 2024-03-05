package Aula3;

// fica pra proxima aula fazer o array list de conta

public class Conta {
    public int numConta;
    public Cliente titular = new Cliente();
    public double saldo;
    
    // metodo construtor
    public Conta() {}
    public Conta(int id, double saldo) {
    	this.numConta= id;
    	this.saldo= saldo;
    	
    }

    public String exibirDados() {
        return ("Titular: " + this.titular.nome + "\nConta: " + this.numConta
                + "\nSaldo: R$ " + String.format("%.2f", this.exibirSaldo()));
    }

    public double exibirSaldo() {
        return this.saldo;
    }

    public boolean realizarSaque(double valorSaque) {
        if (valorSaque > this.saldo) {
            return false;
        } else {
            this.saldo -= valorSaque;
            return true;
        }
    }

    public void realizarDeposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public boolean realizarTransferencia(Conta contaDestino, double valorTransferencia) {
        if (valorTransferencia > this.saldo) {            
            return false;
        } else {
            this.realizarSaque(valorTransferencia);
            contaDestino.realizarDeposito(valorTransferencia);
            return true;
        }
    }


	@Override
	public String toString() {
		return("\n Numero: "+this.numConta+"Saldo: R$"+this.saldo);
	}
	
}
