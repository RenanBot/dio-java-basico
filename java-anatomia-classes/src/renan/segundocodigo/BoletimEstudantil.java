package renan.segundocodigo;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if(mediaFinal ==6)
            System.out.println("Prova de Minerva");
        else
            System.out.println("Aprovado!");
    }
    
}
