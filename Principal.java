import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList <Funcionario> funcionarios = new ArrayList <Funcionario>();
		
		String sn = JOptionPane.showInputDialog("Cadastrar Funcionario (S/N)? ");
        
        while(!sn.equals("N")) {
        	
        	String tipo = JOptionPane.showInputDialog("Tipo do Funcionário (1-Gerente,2-Administrador,3-Comissionado,4-Horista:");
        	String nome = JOptionPane.showInputDialog("Nome do Funcionário:");
        	String sobrenome = JOptionPane.showInputDialog("Sobrenome do Funcionário:");
        	double salario = 0;
        	
        	if (Integer.parseInt(tipo) != 4) {
        		salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do Funcionario:"));
        	}
        	
        	switch (Integer.parseInt(tipo)) {
        	case (1):
        		double bonificacao = Double.parseDouble(JOptionPane.showInputDialog("Bonificacao do Gerente:"));
        		funcionarios.add(new Gerente(nome,sobrenome,salario,bonificacao));
        	    break;
        	case (2):
        		funcionarios.add(new Administrador(nome,sobrenome,salario));
        	    break;
        	case (3):
        		double vendas = Double.parseDouble(JOptionPane.showInputDialog("Total das vendas do Comissionado:"));
        	    double comissao = Double.parseDouble(JOptionPane.showInputDialog("Percentual de comissão do Comissionado:"));
        		funcionarios.add(new Comissionado(nome,sobrenome,salario,vendas,comissao));
        	    break;
        	case (4):
        		double horas = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas:"));
        	    double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da Hora:"));
        		funcionarios.add(new Horista(nome,sobrenome,horas,valor));
        	    break;
        	}
        	
        	sn = JOptionPane.showInputDialog("Cadastrar outro Funcionario (S/N)? ");
        	
        }
    
        for(int i = 1; i < funcionarios.size() ;i++ ){
        	
            JOptionPane.showMessageDialog(null,  funcionarios.get(i).toString() + 
            		"\n Total de Ganhos mensais: " + funcionarios.get(i).calculaGanho() );
           } 
      
	}

}
