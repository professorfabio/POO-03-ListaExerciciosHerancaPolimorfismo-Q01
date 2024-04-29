public class Horista extends Funcionario {
	
	double hora;
	double valor;
	
	public Horista(String nome, String sobrenome, double hora, double valor) {
		super(nome, sobrenome);
		this.hora = hora;
		this.valor = valor;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calculaGanho() {
		return hora * valor;
	}
	@Override
	public String toString() {
		return super.toString() + "Função Horista [hora=" + hora + ", valor=" + valor + "]";
	}

}