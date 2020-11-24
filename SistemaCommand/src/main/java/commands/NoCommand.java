package commands;

public class NoCommand implements Command{

    @Override
    public void executar() {}

    @Override
    public void desfazer() {}
    
    @Override
    public String toString() {
        return "Comando Indefinido";
    }
}