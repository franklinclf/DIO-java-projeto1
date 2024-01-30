public class iPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    
    public static void main(String[] args) throws Exception {
        iPhone iPhone = new iPhone();
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma nova página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para um número...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando uma música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música...");
    }
}
