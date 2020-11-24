package commands;

import receivers.AparelhoSom;

public class LigarAparelhoSomCDCommand implements Command{
    
    private AparelhoSom som;

    public LigarAparelhoSomCDCommand(AparelhoSom som) {
        this.som = som;
    }
    
    @Override
    public void executar() {
        som.ligar();
        som.setVolume(20);
        som.setCD();
    }

    @Override
    public void desfazer() {
        som.desligar();
    }
    
    @Override
    public String toString() {
        return "Comando para Ligar o Aparelho de Som com CD";
    }
}