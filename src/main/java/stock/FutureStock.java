package stock;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;
@Entity
public class FutureStock extends Stock{
    @Column
    private Date epirationDate;

    public Date getEpirationDate() {
        return epirationDate;
    }

    public void setEpirationDate(Date epirationDate) {
        this.epirationDate = epirationDate;
    }
}
