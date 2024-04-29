public class Administrador extends Funcionario {
	
	double salario;

	public Administrador(String nome, String sobrenome, double salario) {
		super(nome, sobrenome);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaGanho() {
		return salario;
	}

	@Override
	public String toString() {
		return super.toString() + "Função Administrador [salario=" + salario + "]";
	}
}