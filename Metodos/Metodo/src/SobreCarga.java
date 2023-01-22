public class SobreCarga {

    public static void main(String[] args) {
        
        //Quadrilatero
        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área quadrado: "  + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d, 5d);
        System.out.println("Área do retangulo " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do Trapézio: " + areaTrapezio);

        Quadrilatero.area(5f, 5f);
    }
    
}
