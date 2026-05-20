package Aula_ED_Lista_Duplamente_Ligada.src;

public class Produto {

    private String nome;
    private String categoria;
    private float preco;
    private int id;
    private static int cont = 1;

    public Produto(int id){
        this.id = id;
    }

    public Produto(String nome, String categoria, float preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.id= cont++;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
}
