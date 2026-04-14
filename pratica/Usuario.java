package pratica;

public class Usuario {

    private String nome;
    private int idade;
    private float peso;
    private int id;

    private static int contador = 0;

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String nome, float peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.id = contador + 1;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", peso: " + peso + "e Id: " + id;
    }

}
