public abstract class Funcionario {
    String nome;
    String sobrenome;
    
    public Funcionario(String nome, String sobrenome) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public abstract double calculaGanho();
    
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + " " + sobrenome + "]\n";
    }
}