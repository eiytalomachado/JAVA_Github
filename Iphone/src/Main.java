public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.selecionarMusica("happydance");
        iphone.tocarMusica(); 
        iphone.pausarMusica();
          
        System.out.println("-----------------");

        iphone.ligar("123456789");
        iphone.atender();   
        iphone.iniciarCorreio();
        
        System.out.println("-----------------");

        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarPagina("https://www.example.com");
        iphone.atualizarPagina("https://www.example.com");

        
    }
}
