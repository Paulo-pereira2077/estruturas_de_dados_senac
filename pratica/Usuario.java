package pratica;

public class Usuario {

    private String nome;
    private Integer idade;
    private Float peso;
    private float salario;
    private int id;


    private static int contador = 1;

    public Usuario(int id) {

        this.id = id;
    }

    public Usuario(String nome, Float peso, Integer idade, float salario) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.salario = salario;
        this.id = contador ++;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade +
                ", peso: " + peso + "kg,  " + "Salario: " + salario + " e Id: " + id;
    }

}
