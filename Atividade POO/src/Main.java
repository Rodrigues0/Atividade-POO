import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carro> listaCarro = new ArrayList<>();

        System.out.println("----------------------------Exercicio 01 ---------------------------- ");


        Carro carro1 = new Carro("Mustang", "Dark Horse", 1985);
        listaCarro.add(carro1);
        carro1.exibir();

        System.out.println("Marca: " + carro1.getMarca() + " | Modelo: " + carro1.getModelo() + " | Ano: " + carro1.getAno());

        Carro carro2 = new Carro("Ferrari", "Spider", 2026);
        listaCarro.add(carro2);
        carro2.exibir();

        System.out.println("Marca: " + carro2.getMarca() + " | Modelo: " + carro2.getModelo() + " | Ano: " + carro2.getAno());

        //-----------------------------------------------------------------------

        System.out.println("----------------------------Exercicio 02 ---------------------------- ");

        Carro carro3 = new Carro("Lamborghini", "Urus", 2020);
        listaCarro.add(carro3);
        carro3.exibir(); // devolve o valor

        System.out.println("O 3º carro adicionado tem " + carro3.idadeCarro() + " anos de fabricado");
        //devolve uma ação
        //-----------------------------------------------------------------------

        System.out.println("----------------------------Exercicio 03 ---------------------------- ");
        for(Carro carro : listaCarro){
        carro.exibir();
        }

        System.out.println("----------------------------Exercicio 04 (FEITO USANDO ENCAPSULAMENTO)---------------------------- ");

        System.out.println("----------------------------Exercicio 05 (FEITO USANDO CONSTRUTOR) ");
        /*
        Construtor é mais ágil, pois já faz uma pre-definição dos atributos
        Já o get e o set, é preciso colocar o set no atributo, depois chamar no get.
        */


        System.out.println("----------------------------Exercicio 06 -----------------------------");
        Carro carro4 = new Carro();
        carro4.exibir();

        // como criei um constutor e passei os atributos como "Desconhecido e 0" printa os valores colocados.

        System.out.println("----------------------------Exercicio 07 -----------------------------");

        Carro carro5 = new Carro("Ford", "Focus", 2019);
        carro5.exibir();

        System.out.println("Total de carros Cadastrados: " + Carro.totalCarro);
        /* um atributo normal em cada classe, pertence excluisvamente aquele Objeto
           Ja o STATIC ele pertence a Classe, engloba todos os Objetos.
        */

        System.out.println("----------------------------Exercicio 08 - FEITO (COMENTADO)-----------------------------");
        /*
        nao da certo porque static quer dizer a classe toda, ele consegue saber quantos carros foram criados
        mas nao sabe o modelo, marca e ano, pois esses atributos é do objeto. DA ERRO DE COMPILAÇÃO.
         */
        System.out.println("----------------------------Exercicio 09 -----------------------------");

        Carro carro6 = new Carro("Wolkswagem", "Fusca", 1883);
        carro6.exibir();

    }


}