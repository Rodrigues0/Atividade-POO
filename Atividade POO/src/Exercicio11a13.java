public class Exercicio11a13 {
    public static void main(String[] args) {

        System.out.println("------------------------- Exercicio 10 RESPONDIDO / COMENTARIOS -------------------------");
        int x = 10;
        if (x == 10) {

        }
        System.out.println(x);
        /*
        Não compila porque o INT X so existia dentro do if, no "SOUT" nao reconhecia
        escopo e a regiao do codigo onde e reconhecido, o int x nao esta dentro do escpo do codio, estava so no escopo do IF
         */


        System.out.println("------------------------- Exercicio 11 (RESPONDIDO / COMENTARIOS-------------------------");
        int a = 10;
        int b = a;
        b = 99;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        a = 10
        b = 99
        o int "valor primitivo" guarda um valo ja o b = a salva o endereco na memoria, ele pula esse endereço
        e mostra o proximo "b = 99"
         */
        System.out.println("------------------------- Exercicio 12 (RESPONDIDO / COMENTARIOS-------------------------");

        Carro c1 = new Carro("Fiat", "Uno", 2020);
        Carro c2 = c1;
        c2.setModelo("Palio");
        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());

        /*
        a) Qual o modelo de c1 e de c2?
            R= os 2 referenciam a PALIO na memoria

        b) Comente explicando: por que alterar c2 mudou c1? O que c1 e c2 compartilham?
            R= Foi declarado c2 é igual a C1, foi criado uma copia do endereço de c1.

        c) Comente explicando: qual a diferença entre o comportamento do exercício 11 (int) e
        deste exercício (Carro)? Use os termos stack e heap na explicação
            R= Stack - é uma pilha onde guarda um valor dentro da stack, (A e B) alterando A nao altera B

            HEAP - memoria maior que guarda Objetos
            no caso dos "CARROS" o c1 e c2 guardao o enderenc,  fazendo REFERENCIA a memoria HEAP
            como os 2 fazem referencia ao mesmo endereço, mudando 1 muda o outro.
         */


        System.out.println("------------------------- Exercicio 13 (RESPONDIDO / COMENTARIOS-------------------------");


        Carro meuCarro = new Carro("VW", "Gol", 2015);
        trocarModelo(meuCarro);
        System.out.println(meuCarro.getModelo());

    }

    public static void trocarModelo(Carro c) {
        c.setModelo("Fusca");
    }

    /*
    a) - Foi impresso Fusca
    b) "MeuCarro" e "c" referencia para o mesmo objeto, quando passamos o "c.setModelo("Fusca") ele vai la na memoria
    e altera o valor.
     */
}
