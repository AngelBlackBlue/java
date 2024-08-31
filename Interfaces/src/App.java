public class App {
    public static void main(String[] args) throws Exception {
        
        Delfin delfin = new Delfin("Adolfina");
        Pulpo pulpo = new Pulpo("Gonzolez", 8);

        delfin.nadar();
        pulpo.nadar();

        delfin.comunicarse();
        pulpo.comunicarse();

        delfin.alimentar();
        pulpo.alimentar();





    }
}
