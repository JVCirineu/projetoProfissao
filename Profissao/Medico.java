package Profissao;

public class Medico extends Funcionario{
	private int crm;
	public Medico(String nome, String matricula, double salario, String telefone, String endereco, String dataNasc,
			int crm) {
		super(nome, matricula, salario, telefone, endereco, dataNasc);
		this.crm = crm;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}



}
