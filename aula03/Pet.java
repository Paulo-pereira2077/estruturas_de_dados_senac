package aula03;

//Classe Pet
public class Pet {
    private String nome, raca;
    private float peso;
    private int id;
    private int idade;

    // questão 2 -
    private static int cont = 1;

    public Pet() {
    }

    public Pet(String nome, String raca, float peso, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
        id = cont++; // é um incremento pós fixado
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " Raça: " + raca + " Peso: " + peso + "KG, " + "Id: " + id + "e Idade: " + idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }
}






















