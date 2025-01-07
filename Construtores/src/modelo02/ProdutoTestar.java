package modelo02;

public class ProdutoTestar {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Caneta preta");
        p1.setMarca("Bic");
        p1.setValor(22.2f);

        Produto p2 = new Produto("Caneta vermelha", "farbe");
        Produto p3 = new Produto("Borracha", "mercuer", 150.0f);

        // Exibindo informações
        //System.out.println("Produto 1: " + p1.getNome() + ", " + p1.getMarca() + ", " + p1.getValor());
        //System.out.println("Produto 2: " + p2.getNome() + ", " + p2.getMarca());
        // System.out.println("Produto 3: " + p3.getNome() + ", " + p3.getMarca() + ", " + p3.getValor());
    }
}
