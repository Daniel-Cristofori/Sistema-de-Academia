
package atividade3.uc07;

public class SugestaoExercicio {
    
    private Corrida exercicioCorrida;
    private Musculacao exercicioMusculacao;
    private Modelo fabricaModelo;
    
    public SugestaoExercicio(Modelo fabrica)
    {
        fabricaModelo = fabrica;
    }
    
    public Corrida getCorrida() {
        return exercicioCorrida;
    }

    public Musculacao getMusculacao() {
        return exercicioMusculacao;
    }
    
    public void gerar()
    {
        exercicioCorrida = fabricaModelo.getCorrida();
        exercicioMusculacao = fabricaModelo.getmMusculacao();
    }
  }         