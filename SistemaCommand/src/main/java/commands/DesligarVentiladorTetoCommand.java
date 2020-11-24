package commands;

import receivers.VentiladorTeto;

public class DesligarVentiladorTetoCommand implements Command{
    
    private final VentiladorTeto ventilador;

    public DesligarVentiladorTetoCommand(VentiladorTeto ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void executar() {
        ventilador.desligar();
    }

    @Override
    public void desfazer() {
        ventilador.velocidadeAlta();
    }
    
    @Override
    public String toString() {
        return "Comando para Desligar o Ventilador de Teto do(a) " + ventilador.getAmbiente();
    }
}