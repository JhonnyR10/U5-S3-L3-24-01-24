package giovannilongo.U5S3L3240124.esercizio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return calculateAge(info.getDataDiNascita());
    }

    private int calculateAge(Date birthdate) {
        if (birthdate == null) {

            return 0;
        }
        LocalDate birthdateLocalDate = birthdate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate now = LocalDate.now();
        return Period.between(birthdateLocalDate, now).getYears();
    }
}
