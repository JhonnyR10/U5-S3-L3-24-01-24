package giovannilongo.U5S3L3240124.esercizio2;

class Pagina implements Component {
    private int numeroPagine;

    public Pagina(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public int getNumeroPagine() {
        return numeroPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa pagina con " + numeroPagine + " pagine");
    }
}