package br.edu.cs.poo.ac.ordem.daos;

public class DAOGenerico {
    protected CadastroObjetos cadastroObjetos;
    public DAOGenerico(Class classe) {
        cadastroObjetos = new CadastroObjetos(classe);
    }
}