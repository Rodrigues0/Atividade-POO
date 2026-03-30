    class Carro {
        private String marca;
        private String modelo;
        private int ano;

        static int totalCarro = 0;

        final int ANO_PRIMEIRO_CARRO = 1886;


        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            setAno(ano);
            totalCarro ++;
        }

       public Carro(){
            this.marca = "Desconhecido";
            this.modelo = "Desconhecido";
            this.ano = 0;
            totalCarro ++;
       }


        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
            if(ano >= ANO_PRIMEIRO_CARRO){
                this.ano = ano;
            }
            else{
                System.out.println("Carro invalido, pois o primeiro carro foi inventado em: " + ANO_PRIMEIRO_CARRO);
            }
        }

        void exibir(){
            System.out.println("Marca: " + marca + " | Modelo: " + modelo + "| Ano: " + ano);
        }

        int idadeCarro(){
            return 2026 - ano;
        }




    }
