package commands;

import receivers.VentiladorTeto;

public class LigarMaximoVentiladorTetoCommand implements Command{
    
    private final VentiladorTeto ventilador;

    public LigarMaximoVentiladorTetoCommand(VentiladorTeto ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void executar() {
        ventilador.velocidadeAlta();
    }

    @Override
    public void desfazer() {
        ventilador.desligar();
    }
    
    @Override
    public String toString() {
        return "Comando para Ligar o Ventilador de Teto do(a) " + ventilador.getAmbiente() + " na velocidade máxima";
    }
}