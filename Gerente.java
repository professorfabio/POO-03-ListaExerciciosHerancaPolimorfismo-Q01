public class Gerente extends Funcionario {
	double salario;
	double bonificacao;
	
	public Gerente(String nome, String sobrenome, double salario, double bonificacao) {
		super(nome, sobrenome);
		this.salario = salario;
		this.bonificacao = bonificacao;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaGanho() {
		return salario + bonificacao;
	}

	@Override
	public String toString() {
		return super.toString() + "Função Gerente [salario=" + salario + ", bonificacao=" + bonificacao + "]";
	}
}