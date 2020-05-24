package Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        for (Integer exibicao: numeros){
            System.out.println("----> " + exibicao);
        }

        numeros.remove(3);

        numeros.add(23);

        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());

        Iterator<Integer> iteracaoNumeros = numeros.iterator();

        while (iteracaoNumeros.hasNext()){
            System.out.println("------> " + iteracaoNumeros.next() + " <------");
        }
    }
}
