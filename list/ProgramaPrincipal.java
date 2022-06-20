package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // instanciar um list de pessoas

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        // adicionar objetos na lista

        pessoas.add(new Pessoa("João", 25, 78, 1.78));
        pessoas.add(new Pessoa("Pedro", 40, 120, 1.73));
        pessoas.add(new Pessoa("Francieli", 33, 65, 1.68));
        pessoas.add(new Pessoa("Diogo", 15, 54, 1.63));
        pessoas.add(new Pessoa("Natasha", 23, 53, 1.56));

        // foreach + print
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        //ordenação 

        System.out.println("\n -------------- Ordenação ---------------\n");

        Collections.sort(pessoas);

        // foreach + print
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        // criar nova pessoa

        Pessoa p = new Pessoa("Gustavo", 38, 80.5, 1.76);
        p.getTelefones().put("residencial", "41 99999-8888");
        p.getTelefones().put("comercial", "41-88888-9999");
        p.getTelefones().put("celular", "41-88999-7777");

        System.out.printf("Telefone Celular: %s", p.getTelefones().get("celular"));
    }
}
