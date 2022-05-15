package model;

public class FuncionarioParcial extends Funcionario{

	private int horaEntrada;
	private int horaSaida;
	
	
	// GETTERS SETTERS
	public int getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public int getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	public String toString() {
		return "\n# Funcionario Tempo Parcial #"
				+ "\nId: " + this.getId()
				+ "\nNome: " + this.getNome()
				+ "\nSalario: " + this.getSalario()
				+ "\nHora de entrada: " + this.getHoraEntrada()
				+ "\nHora de saída: " + this.getHoraSaida();
	}
	
}
