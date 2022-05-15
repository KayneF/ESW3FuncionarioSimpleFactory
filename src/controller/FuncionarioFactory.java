package controller;

import model.*;

public class FuncionarioFactory {

    public Funcionario contratacao(Funcionario f){
        if(f.getId() == 1){
            FuncionarioIntegral f1 = new FuncionarioIntegral();
            f1.setId(1);
            f1.setNome("Antônio Gavião");
            f1.setSalario(5000);
            f1.setBancoHoras(40);
            return f1;
        }
        else if(f.getId() == 2){
            FuncionarioParcial f2 = new FuncionarioParcial();
            f2.setId(2);
            f2.setNome("Lion");
            f2.setSalario(3000);
            f2.setHoraEntrada(8);
            f2.setHoraSaida(14);
            return f2;
        }
        else if(f.getId() == 3){
            FuncionarioTemporario f3 = new FuncionarioTemporario();
            f3.setId(3);
            f3.setNome("Gaviáion");
            f3.setSalario(1800);
            f3.setDia(5);
            f3.setMes(3);
            f3.setAno(2022);
            return f3;
        }
        else if(f.getId() == 4){
            FuncionarioEstagiario f4 = new FuncionarioEstagiario();
            f4.setId(4);
            f4.setNome("Estagiáion");
            f4.setSalario(1000);
            f4.setInstituicaoParceira("Herbert Richards");
            return f4;
        }
        return null;
    }
}
