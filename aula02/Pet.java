package aula02;

//Classe Pet
public class Pet {
    private String nome, raca;
    private float peso;
    private int id;

    // questão 2 -
    private static int cont = 1;

    public Pet() {
    }

    public Pet(String nome, String raca, float peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        id = cont++;
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

    @Override
    public String toString(){
        return "Nome: " + nome + " Raça: " + raca + " Peso: " + peso + "KG Id: " + id;
    }

}






















