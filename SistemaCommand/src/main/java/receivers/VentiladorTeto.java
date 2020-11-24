package receivers;

public class VentiladorTeto {
    
    private Velocidade velocidade;
    private final String ambiente;
    
    public VentiladorTeto(String ambiente){
        this.ambiente = ambiente;
        velocidade = Velocidade.DESLIGADO;
    }
    
    public void velocidadeBaixa(){
        velocidade = Velocidade.MINIMO;
    }
    
    public void velocidadeMedia(){
        velocidade = Velocidade.MEDIO;
    }
    
    public void velocidadeAlta(){
        velocidade = Velocidade.MAXIMO;
    }
    
    public void desligar(){
        velocidade = Velocidade.DESLIGADO;
    }
    
    public String getAmbiente(){
        return ambiente;
    }

    @Override
    public String toString() {
        switch (velocidade){
            case MAXIMO: return "Ventilador de Teto do(a) " + ambiente + " está ligado na velocidade máxima!";
            case MEDIO: return "Ventilador de Teto do(a) " + ambiente + " está ligado na velocidade média!";
            case MINIMO: return "Ventilador de Teto do(a) " + ambiente + " está ligado na velocidade mínima!";
            default: return "Ventilador de Teto do(a) " + ambiente + " está desligado!";
        }
    }
}