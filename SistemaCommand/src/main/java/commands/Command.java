package commands;

public interface Command {
    
    public void executar();
    
    public void desfazer();
}