
package atividade3.uc07;

class FabricaResistencia implements Modelo {

    @Override
    public Corrida getCorrida() {
        
       return  new CorridaComResistencia();
    }

    @Override
    public Musculacao getmMusculacao() {
        
        return  new Abdominal();
    }
}
