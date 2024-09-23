public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");

        carro.exibirVelocidadeAtual();
        carro.acelerar(50);  // Acelera o carro em 50 km/h
        carro.frear(20);     // Freia o carro em 20 km/h
        carro.exibirVelocidadeAtual();
    }
}
