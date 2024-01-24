package giovannilongo.U5S3L3240124.esercizio3;

class Generale implements Officer {
    private double stipendio = 5000;

    @Override
    public void handleRequest(double amount) {
        if (amount <= stipendio) {
            System.out.println("Il Generale gestisce la richiesta.");
        } else {
            System.out.println("Nessun ufficiale può gestire questa richiesta.");
        }
    }
}
