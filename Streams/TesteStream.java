package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream {

    public static void main(String[] args) {

        Estudante primeiroEstudante = new Estudante("João", 23);
        var segundoEstudante = new Estudante("Maria", 32);
        var terceiroEstudante = new Estudante("Bruno", 16);
        var quartoEstudante = new Estudante("Cristina", 18);
        Estudante quintoEstudante = new Estudante("Valdir", 17);

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(primeiroEstudante);
        estudantes.add(segundoEstudante);
        estudantes.add(terceiroEstudante);
        estudantes.add(quartoEstudante);
        estudantes.add(quintoEstudante);

        for (Estudante alunos : estudantes){
            System.out.println(alunos);
        }

        System.out.println("Contagem de estudantes cadastrados: " + estudantes.stream().count());

        System.out.println("Lista de estudantes com idade igual ou superior a 18 anos:\n" +
                estudantes.stream().filter(estudante -> estudante.getIdade() > 17).collect(Collectors.toList()));

        System.out.println("Lista de estudantes que possuem a letra B no nome:\n" +
                estudantes.stream().filter(estudante -> estudante.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));

        System.out.println("Existe algum nome que contenha a letra D? True or False\n" +
                estudantes.stream().anyMatch(estudante -> estudante.getNome().toLowerCase().contains("d")));

        System.out.println("Estudante com maior idade dentre os cadastrados:\n" +
                estudantes.stream().max(Comparator.comparingInt(Estudante::getIdade)));

        System.out.println("Estudante com menor idade dentre os cadastrados:\n" +
                estudantes.stream().min(Comparator.comparingInt(Estudante::getIdade)));
    }
}
