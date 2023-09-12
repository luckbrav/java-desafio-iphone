import java.util.ArrayList;
import java.util.List;

public class Navegador {
    private List<String> abas;

    public Navegador() {
        abas = new ArrayList<>();
    }

    public void adicionarNovaAba(String nomeDaAba) {
        abas.add(nomeDaAba);
    }

    public void exibirPagina(String nomeDaPagina) {
        for (String pag : abas) {
            if(pag.equals(nomeDaPagina)){
                System.out.println("Exibindo a pagina " + pag);
                break;
            }
        }
    }

    public void atualizarPagina() {
        System.out.println("A pagina foi atualizada!");
    }
}
