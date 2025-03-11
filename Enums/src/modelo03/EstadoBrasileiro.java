package modelo03;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São paulo", 35 ),
    RIO_JANERO ("RJ", "Rio de janeiro",33),
    PIAUI ("PI", "Piauí", 22),
    MARANHAO("MA", "Maranhão", 21),
    CEARA ("CE", "Ceará", 23);

    private String sigla;
    private String nomecompleto;
    private int Ibge;

     EstadoBrasileiro(String sigla, String nomecompleto, int Ibge){
        this.sigla = sigla;
        this.nomecompleto = nomecompleto;
        this.Ibge = Ibge;
    }

    public int getibge(){
        return Ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public String getNomeMaiusculo(){
        return nomecompleto.toUpperCase(); 
    }
}