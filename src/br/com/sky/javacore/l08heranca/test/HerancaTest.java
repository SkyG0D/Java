package br.com.sky.javacore.l08heranca.test;

import br.com.sky.javacore.l08heranca.classes.Endereco;
import br.com.sky.javacore.l08heranca.classes.Funcionario;
import br.com.sky.javacore.l08heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Silvano");
        Endereco e = new Endereco();
        Funcionario f = new Funcionario("Gabriel");

        System.out.println(e);


        p.setCpf("12345");
        e.setRua("Antônio de barros");
        e.setBairro("Boa vista");
        p.setEnd(e);
        p.print();
        System.out.println("----------------------");
        f.setCpf("54321");
        f.setEnd(e);
        f.setSalario(1000);
        f.print();
    }
}
