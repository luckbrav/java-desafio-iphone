import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    private List<String> musicas;

    public ReprodutorMusical() {
        this.musicas = new ArrayList<>();
    }

    public void selecionarMusica(String nomeDaMusica) {
        musicas.add(nomeDaMusica);
    }

    public void removerMusica(String nomeDaMusica){
        List<String> musicaParaRemover = new ArrayList<>();

        for (String m : musicas) {
            if(m.equalsIgnoreCase(nomeDaMusica)){
                musicaParaRemover.add(nomeDaMusica);
            }
        }

        musicas.removeAll(musicaParaRemover);
    }

    public void tocar(String nomeDaMusica) {
        for (String m : musicas) {
            if (m.equals(nomeDaMusica)) {
                System.out.println("A música " + nomeDaMusica + " está tocando!");
            }
        }

        
    }

    public void pausar() {
        System.out.println("A música está pausada!");
    }

}
