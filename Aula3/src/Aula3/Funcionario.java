package Aula3;

public class Funcionario {
    public int codFunc;
    public String nome;
    public String rg;
    public String departamento;
    public double salario;
    public Data dataEntrada;
    public boolean estanaempresa;
    
    public Funcionario() {}
    public Funcionario(String nome, String depto, String rg) {
    	this.nome= nome;
    	this.departamento= depto;
    	this.rg= rg;
 
    }
    
    
   public void recebeAumento(double aumento) {
       this.salario+= aumento;
   }
   public double calculaGanhoAnual() {
       return this.salario*12;
   }
   public void demite(){
       this.estanaempresa=false;
   }
   
   @Override
   public String toString() {
   return("\n Funcionario: "+this.nome+ " RG: "+this.rg+" Departamento"+this.departamento);
	}
}

