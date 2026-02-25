package aula02;

public class Principal {

    public static void main(String[] args) {
        Array array = new Array();

        Pet pet1 = new Pet("Mel", "SRD", 13.1F, 1);
        Pet pet2 = new Pet("Gaia", "SRD", 15.2F, 1);

        //Chamadas dos métodos
        array.inserir(pet1);
        array.inserir(pet2);

        array.exibir();
    }
}
