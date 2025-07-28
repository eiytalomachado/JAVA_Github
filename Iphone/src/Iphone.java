public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Música selecionada: " + nomeMusica);
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música... ");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada!");
    }
   
    // Implementação dos métodos da interface AparelhoTelefonico*//
    @Override
    public void ligar(String numero) {
    System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }
    
    @Override
    public void iniciarCorreio() {   
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternert
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarPagina(String url) {       
        System.out.println("Adicionando página: " + url);
    }

    @Override   
    public void atualizarPagina(String url) {   
        System.out.println("Atualizando página... " + url);
    }

}