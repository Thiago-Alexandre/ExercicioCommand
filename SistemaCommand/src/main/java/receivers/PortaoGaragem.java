package receivers;

public class PortaoGaragem {
    
    private Boolean aberto;

    public PortaoGaragem() {
        aberto = false;
    }
    
    public void abrir(){
        aberto = true;
    }
    
    public void fechar(){
        aberto = false;
    }

    @Override
    public String toString() {
        if (aberto) {
            return "Portão da Garagem está aberto!";
        } else{
            return "Portão da Garagem está fechado!";
        }
    }
}