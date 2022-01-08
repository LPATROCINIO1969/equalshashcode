package one.digitalinnovation.queue;

import one.digitalinnovation.Carro;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> filaCarro = new LinkedList<>();

        // acrescentando carros a fila
        System.out.println("Acrescentando carros a fila");
        filaCarro.add(new Carro("Fiat"));
        filaCarro.add(new Carro("Ford"));
        filaCarro.add(new Carro("Volkswagen"));
        filaCarro.add(new Carro("Tesla"));

        // imprimindo a fila de carros
        System.out.println("FILA: " + filaCarro);

        // Verifica se a fila está vazia
        System.out.println("A fila está vazia? " + filaCarro.isEmpty());


        // Mostra o primeiro carro da fila
        System.out.println("Primeiro carro da fila: " + filaCarro.peek());

        // imprimindo a fila de carros
        System.out.println("FILA: " + filaCarro);

        // Removendo o primeiro carro da fila
        System.out.println("Carro removido: " + filaCarro.poll());

        // imprimindo a fila de carros
        System.out.println("FILA: " + filaCarro);



    }
}
