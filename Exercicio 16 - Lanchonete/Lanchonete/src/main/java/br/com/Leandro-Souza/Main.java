package br.com.diegoalves;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo Seu Jorge");
        List<Lanche> listaLanches = new ArrayList<Lanche>();
        List<Pedidos> listaPedidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Lanche lanche = new Lanche();
        boolean controle = true;


        do {
            System.out.println("Escolha uma opção do Menu");
            System.out.println("1 - Cadastrar lanche");
            System.out.println("2 - Registrar pedido");
            System.out.println("3 - Consultar quantidade pedidos feitos");
            System.out.println("4 - Consultar pedidos feitos");
            System.out.println("5 - Encerrar o programa");
            int escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {
                case 1:
                    cadastrarLanche(listaLanches,sc);
                    break;
                case 2:
                    registrarPedido(listaLanches, sc, listaPedidos);
                    break;
                case 3:
                    consultarQuantidadePedidos();
                    break;
                case 4:
                    mostrarPedidos(listaPedidos);
                    break;
                case 5:
                    controle = false;
                    break;
            }

        } while (controle);

    }

    private static void mostrarPedidos(List<Pedidos> listaPedidos) {
        System.out.println("===========Lista de pedidos===========");
        for (Pedidos pedido : listaPedidos) {
            System.out.println(pedido.getLanche().getNome() + " - " + pedido.getLanche().getPreco());
            System.out.println();
        }
        System.out.println("===========Lista de pedidos===========");
    }

    private static void consultarQuantidadePedidos() {
        System.out.println("Quantidade de pedidos: " + Pedidos.NUMERO_PEDIDOS);
    }

    private static void registrarPedido(List<Lanche> listaLanches, Scanner sc, List<Pedidos> listaPedidos) {
        int contador = 1;
        Pedidos pedido = new Pedidos();
        for(Lanche l : listaLanches) {
            System.out.println(contador + " - " + l.getNome());
            contador++;
        }
        int escolha = sc.nextInt();
        sc.nextLine();
        pedido.setLanche(listaLanches.get(escolha -1));
        listaPedidos.add(pedido);
    }

    private static void cadastrarLanche(List<Lanche> listaLanches, Scanner sc) {
        Lanche lanche = new Lanche();
        System.out.println("Digite o lanche que deseja cadastrar: ");
        lanche.setNome(sc.nextLine());
        System.out.println("Digite o preço do lanche: ");
        lanche.setPreco(sc.nextDouble());
        sc.nextLine();
        listaLanches.add(lanche);
    }
}