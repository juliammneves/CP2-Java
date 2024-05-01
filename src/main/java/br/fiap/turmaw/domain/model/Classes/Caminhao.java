package main.java.br.fiap.turmaw.domain.model.Classes;

public class Caminhao extends Veiculo{
    private int carga;
    public Caminhao(String marca, String modelo, int ano, int velocidadeAtual) {
        super(marca, modelo, ano, velocidadeAtual);
        super.setVelocidadeMaxima(100);
    }
    
    public void adicionarCarga(int carga){
        if(this.carga <= 1000 && this.carga + carga <= 1000){
            this.carga += carga;
            System.out.println("Carga adicionada. Carga atual: " + this.carga);
        } else if (carga < 0) {
            System.out.println("Valor inválido. Não é possivel adicionar uma carga menor que zero.");
        } else if (this.carga == 1000){
            System.out.println("Carga máxima atingida. Impossivel adicionar mais.");
        } else if (carga > 1000) {
            System.out.println("Valor inválido. Não é possivel adicionar uma carga mais pesada que 1 tonelada.");
        } else if (this.carga + carga > 1000) {
            System.out.printf("Adicionar %d kg fará com que a carga atual exceda a carga máxima.\n", carga);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void descarregar(int carga){
        if (this.carga > 0 && this.carga - carga >= 0){
            this.carga -= carga;
            System.out.println("Carga descarregada. Carga atual: " + this.carga);
        } else if (this.carga == 0) {
            System.out.println("Impossivel descarregar. Carga atual: 0");
        } else {
            System.out.println("Valor inválido.");
        }
    }

}
