package model;

public class FuncionarioTemporario extends Funcionario{
	
	private int dia;
	private int mes;
	private int ano;
	
	
	// GETTERS SETTERS
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "\n# Funcionario Temporario #"
				+ "\nId: " + this.getId()
				+ "\nNome: " + this.getNome()
				+ "\nSalario: " + this.getSalario()
				+ "\nFim do contrato: "
				+ "\nDia: " + this.getDia()
				+ "\nMes: " + this.getMes()
				+ "\nAno: " + this.getAno();
	}
	
}
