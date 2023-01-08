package renan.primeirocodigo;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {

        String primeiroNome = "Renan";
        String segundoNome = "Botelho";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
        

    }
    public static String nomeCompleto( String primeiroNome, String segundoNome){
        return " Resuldado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}