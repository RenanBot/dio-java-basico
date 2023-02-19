import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStremAPI {

    public static void main(String[] args) {
        List<Integer> numerosAleatorios = 
            new ArrayList<Integer>();
            numerosAleatorios.add(1);
            numerosAleatorios.add(0);
            numerosAleatorios.add(4);
            numerosAleatorios.add(1);  
            numerosAleatorios.add(2);
            numerosAleatorios.add(3);
            numerosAleatorios.add(9);
            numerosAleatorios.add(9);
            numerosAleatorios.add(6);
            numerosAleatorios.add(5);

        System.out.println("Imprima todos os elementos dessa Lista: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
        numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);

            /*System.out.println("Tranforme essa Lista de String em uma lista de inteiros: ");

        numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList())
        .forEach(System.out::println);*/


        System.out.println("Pegue os numeros pares e maiores do que 2 e coloque em uma lista: ");

        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
        .filter(i ->(i %2 == 0 && i > 2))
        .collect(Collectors.toList());
         System.out.println(ListParesMaioresQue2);


         System.out.println("Mostre a média dos números: ");
         numerosAleatorios.stream()
         .average()
         .ifPresent(System.out::println);



        }       

}
