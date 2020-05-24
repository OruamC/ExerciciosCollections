package Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

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
