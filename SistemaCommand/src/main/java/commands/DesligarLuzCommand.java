package commands;

import receivers.Luz;

public class DesligarLuzCommand implements Command{
    
    private final Luz luz;

    public DesligarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.desligar();
    }

    @Override
    public void desfazer() {
        luz.ligar();
    }
    
    @Override
    public String toString() {
        return "Comando para Desligar a Luz do(a) " + luz.getAmbiente();
    }
}