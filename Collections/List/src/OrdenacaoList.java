import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) throws Exception {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("Ordem de inserção!");
        System.out.println(meusGatos);

        System.out.println("Ordem de Aleatória!");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Idade");
        Collections.sort(meusGatos, new ComparetorIdade());
        //meusGatos.sort(new ComparetorIdade());

        System.out.println(meusGatos);

        System.out.println("Ordem por cor");

        //Collections.sort(meusGatos, new ComparetorCor());
        meusGatos.sort(new ComparetorCor());

        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCor(){
        return cor;
    }

    @Override
    public String toString() {
        return " [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
}

class ComparetorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
    
}

class ComparetorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
    
}
