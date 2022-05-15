package view;

import controller.Contrato;
import controller.FuncionarioFactory;
import model.Funcionario;
import model.FuncionarioIntegral;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new FuncionarioIntegral();
        f1.setId(1);
//        f1.setId(2);
//        f1.setId(3);
//        f1.setId(4);

        FuncionarioFactory factory = new FuncionarioFactory();
        Contrato contrato = new Contrato();
        Funcionario contratoFuncionario = factory.contratacao(f1);
        factory.contratacao(contratoFuncionario);

        contrato.iniciarContratacao(contratoFuncionario);
        System.out.println(contratoFuncionario.toString());
    }
}
