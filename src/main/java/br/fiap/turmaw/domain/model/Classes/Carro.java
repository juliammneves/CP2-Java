package main.java.br.fiap.turmaw.domain.model.Classes;

public class Carro extends Veiculo{
    private boolean ligado;
    private boolean ArCondicionado;

    public Carro(String marca, String modelo, int ano, int velocidadeAtual, boolean ligado) {
        super(marca, modelo, ano, velocidadeAtual);
        super.setVelocidadeMaxima(180);
        this.ligado = ligado;
    }

    public void ligar(){
        if(this.ligado == false) {
            this.ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }
    public void desligar(){
        if(this.ligado == true) {
            this.ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void ligarArCondicionado(){
        if(this.ligado == true) {
            this.ArCondicionado = true;
            System.out.println("Ar Condicionado ligado.");
        } else {
            System.out.println("Não é possivel ligar o ar condicionado com o carro desligado.");
        }
    }
    public void desligarArCondicionado(){
        if(this.ArCondicionado == true) {
            this.ArCondicionado = false;
            System.out.println("Ar Condicionado desligado.");
        } else {
            System.out.println("O ar condicionado já está desligado.");
        }
    }


}
