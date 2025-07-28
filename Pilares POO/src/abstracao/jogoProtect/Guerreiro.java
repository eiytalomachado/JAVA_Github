package abstracao.jogoProtect;

public class Guerreiro extends Personagem {
    public void atacar() {
        int valorDado6Faces = rolarDado();
        System.out.printf("Guerreiro atacando com dado de 6 faces: %d%n", valorDado6Faces);
        if(valorDado6Faces == 6) {
            System.out.println("Ataque Crítico! Dano máximo!");
        } else if(valorDado6Faces > 3) {
            System.out.println("Ataque bem-sucedido! Dano normal.");
        } else if (valorDado6Faces <= 3) {
            System.out.println("Ataque falhou! Tente novamente.");
        }
    }


    
}
