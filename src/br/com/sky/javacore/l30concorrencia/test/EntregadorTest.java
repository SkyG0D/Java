package br.com.sky.javacore.l30concorrencia.test;

import br.com.sky.javacore.l30concorrencia.classes.Entregador;
import br.com.sky.javacore.l30concorrencia.classes.ListaMembros;

import javax.swing.*;

public class EntregadorTest {

    public static void main(String[] args) {
        ListaMembros listaMembros = new ListaMembros();
        Thread t1 = new Thread(new Entregador(listaMembros), "Entregador1");
        Thread t2 = new Thread(new Entregador(listaMembros), "Entregador2");
        t1.start();
        t2.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Digite o email do membro");
            if (email == null || email.isEmpty()) {
                listaMembros.fecharLista();
                break;
            }
            listaMembros.adicionarEmailMembro(email);
        }
    }

}
