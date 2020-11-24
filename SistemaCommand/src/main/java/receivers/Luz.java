package receivers;

public class Luz {
    
    private Boolean ligado;
    private final String ambiente;
    
    public Luz(String ambiente){
        this.ambiente = ambiente;
        ligado = false;
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligar(){
        ligado = false;
    }
    
    public String getAmbiente(){
        return ambiente;
    }

    @Override
    public String toString() {
        if (ligado) {
            return "Luz ligada no(a) " + ambiente + " !";
        } else{
            return "Luz desligada no(a) " + ambiente + " !";
        }
    }
}