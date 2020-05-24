package Queues;

import com.sun.source.tree.CatchTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> filaNomes = new LinkedList<>();

        filaNomes.add("Juliana");
        filaNomes.add("Pedro");
        filaNomes.add("Carlos");
        filaNomes.add("Larissa");
        filaNomes.add("João");

        for (String nomes: filaNomes){
            System.out.println("--->" + nomes);
        }

        //filaNomes.clear();

        try {
            String primeiroNomeFilaSemRemover = filaNomes.element();
            System.out.println(primeiroNomeFilaSemRemover);
        } catch (Exception e) {
            System.err.println("Fila encontra-se vazia!");
        }

        System.out.println(filaNomes);

        String removendoEsteElemento = filaNomes.poll();

        System.out.println(removendoEsteElemento);

        Iterator<String> iteratorFilaNomes = filaNomes.iterator();

        while (iteratorFilaNomes.hasNext()){
            System.out.println("---->" + iteratorFilaNomes.next());
        }

        filaNomes.add("Daniel");

        System.out.println(filaNomes);
        System.out.println(filaNomes.size());
        System.out.println(filaNomes.isEmpty());
        System.out.println(filaNomes.contains("Carlos"));
    }
}
