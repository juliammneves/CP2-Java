package main.java.br.fiap.turmaw.domain.model.Classes;

public class Moto extends Veiculo{

    public Moto(String marca, String modelo, int ano, int velocidadeAtual) {
        super(marca, modelo, ano, velocidadeAtual);
        super.setVelocidadeMaxima(120);
    }

    public void empinar(){
        if (20 < getVelocidadeAtual() && getVelocidadeAtual() < 50){
            System.out.println("Empinando moto...");
        } else if (getVelocidadeAtual() < 20 ) {
            System.out.println("Velocidade insuficiente para empinar a moto.");
        } else {
            System.out.println("Velocidade alta demais para empinar a moto.");
        }
    }

}
