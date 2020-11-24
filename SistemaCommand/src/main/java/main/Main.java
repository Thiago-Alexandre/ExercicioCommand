package main;

import commands.*;
import receivers.*;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("******************************");
        System.out.println("Iniciando o Sistema Command com base no problema do Controle Remoto...");
        ControleRemoto controle = new ControleRemoto(7);
        Luz luzSalaJantar = new Luz("Sala de jantar");
        Luz luzCozinha = new Luz("Cozinha");
        PortaoGaragem portao = new PortaoGaragem();
        AparelhoSom som = new AparelhoSom();
        VentiladorTeto ventiladorQuarto = new VentiladorTeto("Quarto");
        VentiladorTeto ventiladorSalaEstar = new VentiladorTeto("Sala Estar");
        
        System.out.println("******************************");
        System.out.println("Mostrando o estado atual da Casa...");
        System.out.println("------------------------------");
        System.out.println(luzSalaJantar);
        System.out.println("------------------------------");
        System.out.println(luzCozinha);
        System.out.println("------------------------------");
        System.out.println(portao);
        System.out.println("------------------------------");
        System.out.println(som);
        System.out.println("------------------------------");
        System.out.println(ventiladorQuarto);
        System.out.println("------------------------------");
        System.out.println(ventiladorSalaEstar);
        System.out.println("------------------------------");
        
        System.out.println("******************************");
        System.out.println("Definindo os Comandos...");
        controle.definirComando(0, new LigarLuzCommand(luzSalaJantar), new DesligarLuzCommand(luzSalaJantar));
        controle.definirComando(1, new LigarLuzCommand(luzCozinha), new DesligarLuzCommand(luzCozinha));
        controle.definirComando(2, new AbrirPortaoGaragemCommand(portao), new FecharPortaoGaragemCommand(portao));
        controle.definirComando(3, new LigarAparelhoSomCDCommand(som), new DesligarAparelhoSomCommand(som));
        controle.definirComando(4, new LigarMaximoVentiladorTetoCommand(ventiladorQuarto), new DesligarVentiladorTetoCommand(ventiladorQuarto));
        controle.definirComando(5, new LigarMaximoVentiladorTetoCommand(ventiladorSalaEstar), new DesligarVentiladorTetoCommand(ventiladorSalaEstar));
        
        System.out.println("******************************");
        System.out.println("Mostrando o Controle Remoto...");
        System.out.println("------------------------------");
        System.out.println(controle);
        System.out.println("------------------------------");
        
        System.out.println("******************************");
        System.out.println("Executando ações...");
        System.out.println("------------------------------");
        System.out.println("Ligando todas as luzes...");
        controle.botaoOnPressionado(0);
        System.out.println(luzSalaJantar);
        controle.botaoOnPressionado(1);
        System.out.println(luzCozinha);
        System.out.println("------------------------------");
        System.out.println("Abrindo o portão...");
        controle.botaoOnPressionado(2);
        System.out.println(portao);
        System.out.println("------------------------------");
        System.out.println("Ligando o Som com CD...");
        controle.botaoOnPressionado(3);
        System.out.println(som);
        System.out.println("------------------------------");
        System.out.println("Ligando os ventiladores...");
        controle.botaoOnPressionado(4);
        System.out.println(ventiladorQuarto);
        controle.botaoOnPressionado(5);
        System.out.println(ventiladorSalaEstar);
        System.out.println("------------------------------");
        System.out.println("Fechando o portão...");
        controle.botaoOffPressionado(2);
        System.out.println(portao);
        System.out.println("------------------------------");
        System.out.println("Apagando todas as luzes...");
        controle.botaoOffPressionado(0);
        System.out.println(luzSalaJantar);
        controle.botaoOffPressionado(1);
        System.out.println(luzCozinha);
        System.out.println("------------------------------");
        System.out.println("Desfazendo a última ação...");
        controle.botaoDesfazerPressionado();
        System.out.println("------------------------------");
        System.out.println("Desligando os ventiladores...");
        controle.botaoOffPressionado(4);
        System.out.println(ventiladorQuarto);
        controle.botaoOffPressionado(5);
        System.out.println(ventiladorSalaEstar);
        System.out.println("------------------------------");
        System.out.println("Desfazendo a última ação...");
        controle.botaoDesfazerPressionado();
        System.out.println("------------------------------");
        System.out.println("Desligando o Som...");
        controle.botaoOffPressionado(3);
        System.out.println(som);
        System.out.println("------------------------------");
        System.out.println("Desfazendo a última ação...");
        controle.botaoDesfazerPressionado();
        System.out.println("------------------------------");
        
        
        System.out.println("******************************");
        System.out.println("Mostrando o estado final da Casa...");
        System.out.println("------------------------------");
        System.out.println(luzSalaJantar);
        System.out.println("------------------------------");
        System.out.println(luzCozinha);
        System.out.println("------------------------------");
        System.out.println(portao);
        System.out.println("------------------------------");
        System.out.println(som);
        System.out.println("------------------------------");
        System.out.println(ventiladorQuarto);
        System.out.println("------------------------------");
        System.out.println(ventiladorSalaEstar);
        System.out.println("------------------------------");
        System.out.println("******************************");
    }
}