package main.java.br.fiap.turmaw.domain.model;

import main.java.br.fiap.turmaw.domain.model.Classes.Caminhao;
import main.java.br.fiap.turmaw.domain.model.Classes.Carro;
import main.java.br.fiap.turmaw.domain.model.Classes.Moto;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------------------");
        Carro carro = new Carro("Toyota", "Corolla", 2020, 0, false);
        carro.acelerar(50);
        carro.reduzirVelocidade(25);
        carro.ligar();
        carro.ligarArCondicionado();
        carro.obterStatus();

        System.out.println("\n------------------");

        Moto moto = new Moto("Honda", "CBR600RR", 2022, 0);
        moto.empinar();
        moto.acelerar(30);
        moto.empinar();

        System.out.println("\n------------------");

        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 0);
        caminhao.adicionarCarga(500);
         caminhao.adicionarCarga(900);
        caminhao.descarregar(250);


    }
}