package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listacarros = new ArrayList<>();
        listacarros.add(new Carro("Fiat"));
        listacarros.add(new Carro("Ford"));
        listacarros.add(new Carro("Chevrolet"));
        listacarros.add(new Carro("Volkswagen"));

        System.out.println(listacarros.contains(new Carro("Ford")));
        for (int i = 0; i < listacarros.size(); i++)
            System.out.println("marca: " + listacarros.get(i).getMarca() + " - Hashcode: " + listacarros.get(i).hashCode() );
        System.out.println("Carro: " + listacarros.get(1).getMarca() + " é igual a " + listacarros.get(2).getMarca() + "?");
        System.out.println(listacarros.get(1).equals(listacarros.get(2)));

    }
}
