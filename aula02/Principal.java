package aula02;

public class Principal {

    public static void main(String[] args) {
        Array array = new Array();

        Pet pet1 = new Pet("Mel", "SRD", 13.1F);
        Pet pet2 = new Pet("Gaia", "SRD", 15.2F);
        Pet pet3=new Pet("SRD","Julie",15);
        Pet pet4 = new Pet("Mel", "SRD", 13.1F);


        //Chamadas dos métodos
        array.inserir(pet1);
        array.inserir(pet2);
        array.inserir(pet3);
        array.inserir(pet4);


        array.exibir();

        int indice = array.pesquisar(2);

        if (indice >= 0){
            System.out.println("Foi encontrado");
        }
        else{
            System.out.println("Não foi encontrado");
        }
    }
}
