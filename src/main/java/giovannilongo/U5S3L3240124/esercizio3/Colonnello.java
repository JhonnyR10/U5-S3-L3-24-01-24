package giovannilongo.U5S3L3240124.esercizio3;

class Colonnello implements Officer {
    private Officer superior;
    private double stipendio = 4000;

    public Colonnello(Officer superior) {
        this.superior = superior;
    }

    @Override
    public void handleRequest(double amount) {
        if (amount <= stipendio) {
            System.out.println("Il Colonnello gestisce la richiesta.");
        } else {
            superior.handleRequest(amount);
        }
    }
}
