package main;

import commands.*;
import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {
    
    private final List<Command> comandosON = new ArrayList();
    private final List<Command> comandosOFF = new ArrayList();
    private Command ultimoComando;
    private final Integer slots;
    
    public ControleRemoto(Integer slots){
        
        this.slots = slots;
        ultimoComando = new NoCommand();
        for (int i = 0; i < this.slots; i++) {
            comandosON.add(new NoCommand());
            comandosOFF.add(new NoCommand());
        }
    }
    
    public void definirComando(Integer slot, Command on, Command off){
        
        if (slot >= 0 && slot < slots) {
            comandosON.set(slot, on);
            comandosOFF.set(slot, off);    
        }
    }
    
    public void botaoOnPressionado(Integer slot){
        comandosON.get(slot).executar();
        ultimoComando = comandosON.get(slot);
    }
    
    public void botaoOffPressionado(Integer slot){
        comandosOFF.get(slot).executar();
        ultimoComando = comandosOFF.get(slot);
    }
    
    public void botaoDesfazerPressionado(){
        ultimoComando.desfazer();
        ultimoComando = new NoCommand();
    }

    @Override
    public String toString() {
        String controleRemoto = "Controle Remoto:";
        controleRemoto += "\n";
        for (int i = 0; i < slots; i++) {
            controleRemoto += "[Slot " + i + "]: ";
            controleRemoto += comandosON.get(i).toString();
            controleRemoto += "     ";
            controleRemoto += comandosOFF.get(i).toString();
            controleRemoto += "\n";
        }
        controleRemoto += "Último Comando: " + ultimoComando.toString();
        return controleRemoto;
    }
}