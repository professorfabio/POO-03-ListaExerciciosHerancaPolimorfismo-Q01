public class Comissionado extends Funcionario {

    double salario;
    double vendas;
    double comissao;
        
    public Comissionado(String nome, String sobrenome, double salario, double vendas, double comissao) {
        super(nome, sobrenome);
        this.salario = salario;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calculaGanho() {
        return salario + (vendas * comissao/100);
    }

    @Override
    public String toString() {
        return super.toString() + "Função Comissionado [salario=" + salario + ", vendas=" + vendas + ", comissao=" + comissao + "]";
    }
}