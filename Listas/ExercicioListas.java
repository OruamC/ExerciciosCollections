package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioListas {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Roberto");

        System.out.println(nomes);

        String primeiraPosicao = nomes.get(1);

        System.out.println(primeiraPosicao);

        String quartaPosicao = nomes.get(4);

        System.out.println(quartaPosicao);

        nomes.remove("João");

        System.out.println(nomes);

        int quantidadePosicoes = nomes.size();

        System.out.println(quantidadePosicoes);

        boolean temJuliano = nomes.contains("Juliano");

        System.out.println(temJuliano);

        List<String> outrosNomes = new ArrayList<>();

        outrosNomes.add("Ismael");
        outrosNomes.add("Rodrigo");

        nomes.addAll(outrosNomes);

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

    }
}
