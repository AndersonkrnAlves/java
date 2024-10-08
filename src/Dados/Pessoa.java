package Dados;

public class Pessoa {
    
    public String nome;
    public String telefone;
    public int idade;

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
    public Pessoa(Pessoa nova){
        this.nome = nova.nome;
        this.idade = nova.idade;
        this.telefone = nova.telefone;
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
}


