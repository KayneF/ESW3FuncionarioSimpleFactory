package model;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;

	
	// GETTERS SETTERS
	public int getId() {
		return id;
	}
	public void setId(int idString) {
		this.id = idString;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "\n# Funcionario #"
				+ "\nId: " + this.getId()
				+ "\nNome: " + this.getNome()
				+ "\nSalario: " + this.getSalario();
	}
}
