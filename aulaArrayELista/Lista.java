package aulaArrayELista;

public class Lista {
    private No inicio; // ESSENCIAL: A lista precisa saber onde começa

    // Letra B - Inserir entre o primeiro e o último (no meio)
    public void inserirNoMeio(Pet pet) {
        No novo = new No(pet, null);
        if (inicio == null || inicio.getProx() == null) {
            No atual = inicio;
            if(inicio == null) { inicio = novo; }
            else { inicio.setProx(novo); }
            return;
        }
        No devagar = inicio;
        No rapido = inicio.getProx();
        while (rapido != null && rapido.getProx() != null) {
            devagar = devagar.getProx();
            rapido = rapido.getProx().getProx();
        }
        novo.setProx(devagar.getProx());
        devagar.setProx(novo);
    }

    // Letra A - Contar nós
    public int contarNos() {
        int contador = 0;
        No temp = inicio;
        while (temp != null) {
            contador++;
            temp = temp.getProx();
        }
        return contador;
    }

    // Letra C - Circular e Exibir
    public void transformarEmCircular() {
        if (inicio == null) return;
        No temp = inicio;
        while (temp.getProx() != null) {
            temp = temp.getProx();
        }
        temp.setProx(inicio);
    }

    public void exibirCircular() {
        if (inicio == null) return;
        No e = inicio;
        do {
            System.out.println(e.getPet());
            e = e.getProx();
        } while (e != null && e != inicio);
    }

    // Método extra para ajudar a inserir o primeiro
    public void inserirInicio(Pet p) {
        inicio = new No(p, inicio);
    }
}