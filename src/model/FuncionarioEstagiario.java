package model;

public class FuncionarioEstagiario extends Funcionario{

    private String instituicaoParceira;


    public String getInstituicaoParceira() {
        return instituicaoParceira;
    }
    public void setInstituicaoParceira(String instituicaoParceira) {
        this.instituicaoParceira = instituicaoParceira;
    }

    @Override
    public String toString() {
        return "\n# Funcionario Tempo Integral #"
                + "\nId: " + this.getId()
                + "\nNome: " + this.getNome()
                + "\nSalario: " + this.getSalario()
                + "\nInstituição Parceira: " + this.getInstituicaoParceira();
    }
}
