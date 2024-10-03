package Dados;

import javax.xml.catalog.GroupEntry.PreferType;

public class Pessoa {
    
    private String nome;
    private String telefone;
    private int idade;

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String noome){
        this.nome = nome;
    }

    public Pessoa() {
        idade = 0;
        nome = "";
        telefone = "";
    }

    public Pessoa(String nom, String tel, int id) {
        nome = nom;
        telefone = tel;
        idade = id;
    }
    
    public boolean testeIdade(int idade) {
        
        if (idade >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public String mostrarDados() {
        String retorno = "Nome: " + nome + " Idade: " + idade + " Telefone: " + telefone;
        return retorno;
    }
    public Pessoa(Pessoa nova){
        this.nome = nova.nome;
        this.idade = nova.idade;
        this.telefone = nova.telefone;
    }
}



