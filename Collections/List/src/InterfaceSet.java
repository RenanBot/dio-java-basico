import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterfaceSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5.0: "); não da para pesquisar por posição dentro do SET
        //Adicione na lista a nota 8 na posição 4, também não é possível com o Set
        
        //"Substiuta a nota 5.0 pela nota 6.0, não é possível.

        System.out.println("Confira se a nota 5.0 está no conjunto " + notas.contains(5d));

        //Exiba a terceira nota adicionada, não é possível pois não tem o metodo get para passar o indice.

        System.out.println("Exibe a menor nota: " + Collections.min(notas));

        System.out.println("Exibe a maior nota: " + Collections.max(notas));

        
        Iterator<Double> iterator = notas.iterator();
        
        Double soma = 0.0;
        
        while (iterator.hasNext()){
            Double next = iterator.next();
            
            soma += next;
        }
        
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");

        notas.remove(0.0);
        System.out.println(notas);

        //Remova a nota na posição 0, não tem como por que não tenho indice.

        System.out.println("Remova as notas menores do que 7 e exiba na lista: ");

        Iterator<Double> iterator2 = notas.iterator();

        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7 ){
                iterator2.remove();
            }
        }

        System.out.println(notas);


        Set<Double> notas2 = new LinkedHashSet<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6d);

        System.out.println(notas2);

        System.out.println("Exiba todas as notas na odem crescente: ");

        Set<Double> notas3 = new TreeSet<>(notas2);

        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");

        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());


    }
}
