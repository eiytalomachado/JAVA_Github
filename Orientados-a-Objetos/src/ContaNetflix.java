public class ContaNetflix {
    private String idiomaPreferencial;
    private String resulucaoTela;

    public void entrar(){
        buscarReferenciaDoUsuario();
        intentificarResulução();
    }

   private void buscarReferenciaDoUsuario(){
        idiomaPreferencial = "PT-BR";

    }

    private void intentificarResulução(){
        resulucaoTela = "Full HD";
        
    }

    public void assistirFilme(String nomeFilme){
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("carregando o filme na resulução " + resulucaoTela );
        carregarAudioFilme();
    }

    private void carregarAudioFilme(){
        if (idiomaPreferencial ==  "PT-BR" || idiomaPreferencial == "EN-US") {
            System.out.println("carregando o audio em " + idiomaPreferencial);
        } else {
            System.out.println("carregando o aúdio em ZH-CN ");
        }
        
    }

}
