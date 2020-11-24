package commands;

import receivers.PortaoGaragem;

public class AbrirPortaoGaragemCommand implements Command{

    private final PortaoGaragem portao;

    public AbrirPortaoGaragemCommand(PortaoGaragem portao) {
        this.portao = portao;
    }
    
    @Override
    public void executar() {
        portao.abrir();
    }

    @Override
    public void desfazer() {
        portao.fechar();
    }

    @Override
    public String toString() {
        return "Comando para Abrir o Portão da Garagem";
    }
}