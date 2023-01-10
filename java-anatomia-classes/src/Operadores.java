
public class Operadores {
    public static void main(String[] args) {
        /*String nomeCompleto = "LINGUAGEM" + "Java";
        System.out.println(nomeCompleto);

        boolean variavel = true;
        variavel = !variavel;

        System.out.println(variavel);

        Operador Ternário

        int a , b;
        a = 5; 
        b = 6;

        String resultado = a==b ?"Verdadeiro" : "Falso";

        System.out.println(resultado);*/

        //Para comparar Objetos usa o equals

        String nomeUm = "Renan";
        String nomeDois = new String("Renan");
        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2){
            System.out.println("AS duas condições são verdadeiras");
        }

    }
    
}
