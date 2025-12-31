
package atividade3.uc07;

import java.util.Scanner;

public class AcademiaApp {

    public static void main(String[] args) {
       
          Scanner entrada = new Scanner(System.in);
          System.out.println("Informe 1 para exercícios de resistência ou 2 para exercícios de velocidade");
          byte opcao = entrada.nextByte();
          
          Modelo modelo = null;
          switch (opcao) {
            case 1 -> modelo = new FabricaResistencia();
            case 2 -> modelo = new FabricaVelocidade(); 
          }
          
          SugestaoExercicio sugestao = new SugestaoExercicio(modelo);
          sugestao.gerar();
          
          System.out.println("Musculação: " + sugestao.getMusculacao().toString());
          System.out.println("Corrida: " + sugestao.getCorrida().toString());
    }
  }