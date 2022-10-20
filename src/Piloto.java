/*
* Classe Piloto
*Atributos:
- nome : int
- idade : String
- sexo : Enum
- equipe : String
*Métodos:
+ "Construtor"
+ set... (alterar atributos da Classe - "Modificadores")
+ get... (retorna valores dos atributos da Classe - "Acessores")
*
* */

public class Piloto {
    private String nome;
    private int idade;
    private String equipe;
    private Sexo sexo;


    public Piloto(String nome, int idade, Sexo sexo, String equipe) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Piloto {" + '\n' +
                "Nome: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Sexo: " + sexo + '\n' +
                "Equipe: " + equipe + '\n' +
                '}';
    }
}
