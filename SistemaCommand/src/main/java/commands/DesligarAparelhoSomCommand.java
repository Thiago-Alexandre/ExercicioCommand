package commands;

import receivers.AparelhoSom;

public class DesligarAparelhoSomCommand implements Command{
    
    private final AparelhoSom som;

    public DesligarAparelhoSomCommand(AparelhoSom som) {
        this.som = som;
    }

    @Override
    public void executar() {
        som.desligar();
    }

    @Override
    public void desfazer() {
        som.ligar();
    }
    
    @Override
    public String toString() {
        return "Comando para Desligar o Aparelho de Som";
    }
}