package commands;

import receivers.Luz;

public class LigarLuzCommand implements Command{

    private final Luz luz;
    
    public LigarLuzCommand(Luz luz){
        this.luz = luz;
    }
    
    @Override
    public void executar() {
        luz.ligar();
    }

    @Override
    public void desfazer() {
        luz.desligar();
    }
    
    @Override
    public String toString() {
        return "Comando para Ligar a Luz do(a) " + luz.getAmbiente();
    }
}