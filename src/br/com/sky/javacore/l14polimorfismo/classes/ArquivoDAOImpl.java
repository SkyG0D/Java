package br.com.sky.javacore.l14polimorfismo.classes;

public class ArquivoDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos!");
    }
}
