package aula03;

// Importe as classes do outro pacote se necessário

public class Principal {

    public static void main(String[] args) {
        // --- PARTE 1: ARRAY ---
        Array array = new Array();

        Pet pet1 = new Pet("Mel", "SRD", 13.1F, 2);
        Pet pet2 = new Pet("Gaia", "SRD", 15.2F, 3);
        Pet pet3 = new Pet("Julie", "SRD", 15, 4);
        Pet pet4 = new Pet("Mel", "SRD", 13.1F, 10);

        array.inserir(pet1);
        array.inserir(pet2);
        array.inserir(pet3);
        array.inserir(pet4);

        System.out.println("--- Exibindo Array ---");
        array.exibir();

//        // Testando a busca Binária
//        int idBuscado = 3;
//        Pet encontrado = array.buscaBinaria(idBuscado, 0, array.getContador() - 1);
//
//        if (encontrado != null) {
//            System.out.println("\nPet encontrado no Array: " + encontrado.getNome());
//        }
//
//        // Ordenar por nome e exibir
//        System.out.println("\nOrdenando por nome...");
//        array.ordenarPorNome();
//        array.exibir();

        // Exercício 2
        System.out.println("\n--- Testando Lista Ligada ---");
        Lista listaPet = new Lista(); // Use a classe Lista que criamos acima

        // Inserindo os primeiros para poder inserir no meio depois
        listaPet.inserirInicio(new Pet("Rex", "Pastor", 30.0F, 7));
        listaPet.inserirInicio(new Pet("Bidu", "Schnauzer", 8.0F, 5));

        // b) Inserir entre eles
        listaPet.inserirNoMeio(new Pet("Intermediario", "SRD", 5.0F, 1));

        // a) Contar
        System.out.println("Total de nós: " + listaPet.contarNos());

        // c) Circular
        listaPet.transformarEmCircular();
        listaPet.exibirCircular();


    }
}