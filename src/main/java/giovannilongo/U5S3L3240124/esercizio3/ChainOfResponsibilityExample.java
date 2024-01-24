package giovannilongo.U5S3L3240124.esercizio3;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {

        Officer generale = new Generale();
        Officer colonnello = new Colonnello(generale);
        Officer maggiore = new Maggiore(colonnello);
        Officer capitano = new Capitano(maggiore);
        Officer tenente = new Tenente(capitano);


        tenente.handleRequest(1500);
        System.out.println("------");
        tenente.handleRequest(3000);
        System.out.println("------");
        tenente.handleRequest(4500);
        System.out.println("------");
        tenente.handleRequest(6000);
    }
}
