package giovannilongo.U5S3L3240124.esercizio2;

import java.util.List;

class Libro implements Component {
    private List<Author> autori;
    private double prezzo;
    private Sezione radice;

    public Libro(List<Author> autori, double prezzo) {
        this.autori = autori;
        this.prezzo = prezzo;
        this.radice = new Sezione();
    }

    @Override
    public int getNumeroPagine() {
        return radice.getNumeroPagine();
    }

    @Override
    public void stampa() {
        System.out.println("Stampa libro con " + getNumeroPagine() + " pagine");
        radice.stampa();
    }

    public void addComponent(Component component) {
        radice.addComponent(component);
    }
}
