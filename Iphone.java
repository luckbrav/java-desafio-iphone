public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical player = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        Navegador safari = new Navegador();

        player.selecionarMusica("Musica 1");
        player.selecionarMusica("Musica 2");
        player.selecionarMusica("Musica 3");
        player.selecionarMusica("Musica 4");

        player.tocar("Musica 3");
        player.pausar();

        telefone.ligar("11981801256");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        safari.adicionarNovaAba("Google");
        safari.adicionarNovaAba("Facebook");
        safari.adicionarNovaAba("Instagram");

        safari.exibirPagina("Instagram");

        safari.atualizarPagina();
    }
}