package main.java.br.fiap.turmaw.domain.model.Classes;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano, int velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    // Getter
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    // Setter
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar (int incremento) {
        if (this.velocidadeAtual >= this.velocidadeMaxima) {
            System.out.println("Impossivel acelerar. Velocidade máxima atingida.");
        } else if (this.velocidadeAtual + incremento > this.velocidadeMaxima){
            System.out.printf("Impossivel acelerar. Acelerar %d ultrapassaria a velocidade máxima.\n", incremento);
        } else {
            this.velocidadeAtual += incremento;
            System.out.printf("Velocidade atual: %d\n", this.velocidadeAtual);
        }
    }

    public void reduzirVelocidade(int decremento){
        if (this.velocidadeAtual <= 0){
            System.out.println("Não é possivel reduzir mais a velocidade. O veiculo está parado.");
        } else if (this.velocidadeAtual - decremento < 0){
            System.out.printf("Impossivel reduzir. Reduzir %d tornaria a velocidade atual menor que zero.\n", decremento);
        } else {
            this.velocidadeAtual -= decremento;
            System.out.printf("Velocidade atual: %d\n", this.velocidadeAtual);
        }
    }

    public void obterStatus(){
        System.out.printf("Veiculo: %s %s (%d)\n", marca, modelo, ano);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
    }
}
