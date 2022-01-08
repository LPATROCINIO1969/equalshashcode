package one.digitalinnovation.stack;

import one.digitalinnovation.Carro;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        // verifica se a pilha está vazia
        System.out.println("A pilha está vazia? " + stackCarros.empty());

        // Acrescenta elementos a pilha
        System.out.println("Acrescentando elementos na pilha");
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Fiat"));
        stackCarros.push(new Carro("Volkswagen"));
        stackCarros.push(new Carro("GM"));
        stackCarros.push(new Carro("Hyundai"));

        System.out.println(stackCarros);

        // verifica se a pilha está vazia
        System.out.println("A pilha está vazia? " + stackCarros.empty());

        System.out.println("Retirando elemento da pilha");
        System.out.println("Elemento retirado: " + stackCarros.pop());
        System.out.println("Nova pilha de carros:");
        System.out.println(stackCarros);


    }
}
