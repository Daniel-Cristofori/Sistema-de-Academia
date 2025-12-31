
package atividade3.uc07;

public class FabricaVelocidade implements Modelo {

    @Override
    public Corrida getCorrida() {
        
        return new PernasAlternadas();
        
    }

    @Override
    public Musculacao getmMusculacao() {
        
        return  new LevantamentoPneu();
                
    } 
}
