public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0.0; // Inicia com o carro parado
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Acelerar aumenta a velocidade
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadeAtual += incremento;
            System.out.println("Acelerando. Velocidade atual: " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("O incremento deve ser positivo.");
        }
    }

    // Frear diminui a velocidade
    public void frear(double decremento) {
        if (decremento > 0) {
            this.velocidadeAtual -= decremento;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0; // Velocidade não pode ser negativa
            }
            System.out.println("Freando. Velocidade atual: " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("O decremento deve ser positivo.");
        }
    }

    // Exibe a velocidade atual
    public void exibirVelocidadeAtual() {
        System.out.println("Velocidade atual: " + this.velocidadeAtual + " km/h.");
    }
}
