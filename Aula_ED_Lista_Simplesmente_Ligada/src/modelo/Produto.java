package modelo;

public class Produto {

    private String nome;
    private float preco;
    private int id;
    private static int cont = 1;

    public Produto(int id){

        this.id= id;
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        this.id= cont++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }



    public String toString(){

        return "Produto{" + "Nome: " + nome + "; Preço: " + String.format("%.2f", preco) + "; Id: " + id + "; Conta: "+"}";
    }
}
