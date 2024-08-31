import interfaces.Comunicable;
import interfaces.Alimentable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable {

    // Super constructor
    public Delfin(String nombre) {
        super(nombre);
    }

    @Override // sobre escribe el metodo nadar
    void nadar(){
        System.out.println(nombre + " está nadando en velicidad con su cola y saltando sobre el agua");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite sonidos y chasquidos");
    }

    @Override
    public void alimentar() {
        System.out.println("Ledimos de comer galletas" + nombre);
    }



}
