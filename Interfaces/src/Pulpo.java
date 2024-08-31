import interfaces.Comunicable;
import interfaces.Alimentable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable{

    int cantTentaculos;

    // Super constructor
    public Pulpo(String nombre, int cantTentaculos) {
        super(nombre);
        this.cantTentaculos = cantTentaculos;
    }

    @Override // sobre escribe el metodo nadar
    void nadar() {
        System.out.println(nombre + " está nadando con sus ocho tentaculos");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " saluda con sus " + cantTentaculos + " tentaculos");
    }

    @Override
    public void alimentar() {
        System.out.println("Estamos alimentando con peces a " + nombre);
    }





}
