package Profissao;

public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("José","1559",1.500,"(15)99666-7895",
				"rua dos bobos","15/10/1996");
		System.out.println("---Funcionário---");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Endereço: " + funcionario.getEndereco());
		System.out.println("Data Nascimento: " + funcionario.getDataNasc());

		Administrador administrador = new Administrador("João","1668",2.500,
				"(11)99601-8998","Rua Limeira", "11/08/2000",15551);
		System.out.println("\n---ADMINISTRADOR---");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Matrícula: " + administrador.getMatricula());
		System.out.println("Salário: " + administrador.getSalario());
		System.out.println("Telefone: " + administrador.getTelefone());
		System.out.println("Endereço: " + administrador.getEndereco());
		System.out.println("Data Nascimento: " + administrador.getDataNasc());
		System.out.println("CRA: " + administrador.getCra());

		Engenheiro engenheiro = new Engenheiro("Gustavo", "5896", 9.000, "(15)99666-3396", 
				"Rua Airton Barbosa","18/08/1996",0600362321);
		System.out.println("\n---ENGENHEIRO---");
		System.out.println("Nome: " + engenheiro.getNome());
		System.out.println("Matrícula: " + engenheiro.getMatricula());
		System.out.println("Salário: " + engenheiro.getSalario());
		System.out.println("Telefone: " + engenheiro.getTelefone());
		System.out.println("Endereço: " + engenheiro.getEndereco());
		System.out.println("Data Nascimento: " + engenheiro.getDataNasc());
		System.out.println("numCrea: " + engenheiro.getNumCrea());

		Medico medico = new Medico("Pedro","1581", 10.000,"(15)99601-9888","Rua José Oze",
				"04/03/2007", 34023);
		System.out.println("\n---MÉDICO---");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Matrícula: " + medico.getMatricula());
		System.out.println("Salário: " + medico.getSalario());
		System.out.println("Telefone: " + medico.getTelefone());
		System.out.println("Endereço: " + medico.getEndereco());
		System.out.println("Data Nascimento: " + medico.getDataNasc());
		System.out.println("CRA: " + medico.getCrm());


	}
}
