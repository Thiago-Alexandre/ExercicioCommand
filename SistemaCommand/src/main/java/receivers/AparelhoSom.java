package receivers;

public class AparelhoSom {
    
    private Integer volume;
    private String reproduzindoAgora;
    private Boolean ligado;
    
    public AparelhoSom(){
        volume = 10;
        reproduzindoAgora = "Nada está sendo reproduzido neste momento!";
        ligado = false;
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligar(){
        ligado = false;
    }
    
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        if (volume > 100) {
           this.volume = 100; 
        } else if(volume < 0){
            this.volume = 0;
        } else{
            this.volume = volume;
        }
    }

    public void setCD() {
        reproduzindoAgora = "CD";
    }

    public void setDVD() {
        reproduzindoAgora = "DVD";
    }

    public void setRadio() {
        reproduzindoAgora = "Rádio";
    }

    @Override
    public String toString() {
        String aparelhoSom = "Aparelho de Som está desligado!";
        if (ligado) {
            aparelhoSom = "Aparelho de Som está ligado!";
            aparelhoSom += "\n";
            aparelhoSom += "Está reproduzindo agora: " + reproduzindoAgora;
            aparelhoSom += "\n";
            aparelhoSom += "O volume está em: " + volume;
        }
        return aparelhoSom;
    }
}