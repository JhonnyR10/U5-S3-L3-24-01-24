package giovannilongo.U5S3L3240124.esercizio2;

import java.util.ArrayList;
import java.util.List;

class Sezione implements Component {
    private List<Component> elements = new ArrayList<>();

    @Override
    public int getNumeroPagine() {
        int totalPagine = 0;
        for (Component element : elements) {
            totalPagine += element.getNumeroPagine();
        }
        return totalPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa sezione con " + getNumeroPagine() + " pagine");
        for (Component element : elements) {
            element.stampa();
        }
    }

    public void addComponent(Component component) {
        elements.add(component);
    }
}
