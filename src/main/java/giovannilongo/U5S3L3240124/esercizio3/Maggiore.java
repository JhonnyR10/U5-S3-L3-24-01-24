package giovannilongo.U5S3L3240124.esercizio3;

class Maggiore implements Officer {
    private Officer superior;
    private double stipendio = 3000;

    public Maggiore(Officer superior) {
        this.superior = superior;
    }

    @Override
    public void handleRequest(double amount) {
        if (amount <= stipendio) {
            System.out.println("Il Maggiore gestisce la richiesta.");
        } else {
            superior.handleRequest(amount);
        }
    }
}
