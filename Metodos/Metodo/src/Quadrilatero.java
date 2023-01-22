public class Quadrilatero {

    public static double area(double lado){

        // aqui se fosse void System.out.println("A Área do quadrado: " + lado * lado);
         return lado * lado;
    }
    public static double area(double lado1, double lado2){

        // aqui se fosse void System.out.println("A Área do retângulo: " + lado1 * lado2);
        return lado1 * lado2;
    }
    public static double area(double baseMaior, double baseMenor, double altura){

        // aqui se fosse void System.out.println("A Área do Trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static void area(float diagonal1, float diagonal2){

        System.out.println("A Área do losango: " + (diagonal1 * diagonal2)/2);  
    }
}
