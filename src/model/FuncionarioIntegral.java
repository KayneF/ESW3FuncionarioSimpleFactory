package model;

public class FuncionarioIntegral extends Funcionario {

	private int bancoHoras;

	
	// GETTERS SETTERS
	public int getBancoHoras() {
		return bancoHoras;
	}
	public void setBancoHoras(int bancoHoras) {
		this.bancoHoras = bancoHoras;
	}
	
	public String toString() {
		return "\n# Funcionario Tempo Integral #"
				+ "\nId: " + this.getId()
				+ "\nNome: " + this.getNome()
				+ "\nSalario: " + this.getSalario()
				+ "\nBando de Horas: " + this.getBancoHoras();
	}
}
