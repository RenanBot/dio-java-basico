import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        
        /*
         * Carros e seus respectivos consumos, faça:
         * modelo = gol - consumo = 14,4km/l
         * modelo = uno - consumo = 15,6km/l
         * modelo = mobi - consumo = 16,1km/l
         * modelo = hb20 - consumo = 14,5km/l
         * modelo = kwid - consumo = 15,6km/l
         */

         System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);

        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //Exiba o terceiro valor adicinado, não tem como mostrar.

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();

        System.out.println(modelos);

        System.out.println("exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();

        System.out.println(consumos);

        System.out.println("Exiba seu modelo mais economico e seu consumo: ");

        Collections.max(carrosPopulares.values());

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modelosMaisEficiente = "";

        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modelosMaisEficiente = entry.getKey();     
                System.out.println("Modelo mais eficiente " + modelosMaisEficiente + " - " + consumoMaisEficiente);
            }
        }   

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        } 

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a media dos consumos: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6km/l ");

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove(); 
        }

        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os modelos na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            
        }};

        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o conjunto criado.");
        carrosPopulares.clear();

        System.out.println("Confira de o conjunto está vazio: " + carrosPopulares.isEmpty());

    }
   
}
