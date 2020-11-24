package commands;

import receivers.PortaoGaragem;

public class FecharPortaoGaragemCommand implements Command{
    
    private final PortaoGaragem portao;

    public FecharPortaoGaragemCommand(PortaoGaragem portao) {
        this.portao = portao;
    }

    @Override
    public void executar() {
        portao.fechar();
    }

    @Override
    public void desfazer() {
        portao.abrir();
    }
    
    @Override
    public String toString() {
        return "Comando para Fechar o Portão da Garagem";
    }
}