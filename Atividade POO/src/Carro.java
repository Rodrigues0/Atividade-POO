    public class Carro {
        String marca;
        String modelo;
        int ano;

        void exibir(){
            System.out.println("Marca: " + marca + " | Modelo: " + modelo + "| Ano: " + ano);
        }

        int idadeCarro(){
            return 2026 - ano;
        }

    }
