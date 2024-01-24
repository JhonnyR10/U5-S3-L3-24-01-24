package giovannilongo.U5S3L3240124.esercizio3;

class Capitano implements Officer {
    private Officer superior;
    private double stipendio = 2000;

    public Capitano(Officer superior) {
        this.superior = superior;
    }

    @Override
    public void handleRequest(double amount) {
        if (amount <= stipendio) {
            System.out.println("Il Capitano gestisce la richiesta.");
        } else {
            superior.handleRequest(amount);
        }
    }
}
