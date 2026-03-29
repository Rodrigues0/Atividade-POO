//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exercicio 01

        Carro carro1 = new Carro();
        carro1.marca = "Renault";
        carro1.modelo = "Duster";
        carro1.ano = 2023;
        System.out.println("Marca: " + carro1.marca + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano);

        Carro carro2 = new Carro();
        carro2.marca = "Ferrari";
        carro2.modelo = "Spider";
        carro2.ano = 2026;
        System.out.println("Marca: " + carro2.marca + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano);

        //-----------------------------------------------------------------------

        //Exercicio 02

        Carro carro3 = new Carro();
        carro3.marca = "Lamborghini";
        carro3.modelo = "Urus";
        carro3.ano = 2020;

        carro3.exibir(); // devolve o valor

        System.out.println("O 3º carro adicionado tem " + carro3.idadeCarro() + " anos de fabricado");
        //devolve uma ação
        //-----------------------------------------------------------------------

        //Exercicio 03
    }


}