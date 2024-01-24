package giovannilongo.U5S3L3240124.esercizio3;

class Tenente implements Officer {
    private Officer superior;
    private double stipendio = 1000;

    public Tenente(Officer superior) {
        this.superior = superior;
    }

    @Override
    public void handleRequest(double amount) {
        if (amount <= stipendio) {
            System.out.println("Il Tenente gestisce la richiesta.");
        } else {
            superior.handleRequest(amount);
        }
    }
}
