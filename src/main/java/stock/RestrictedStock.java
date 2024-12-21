package stock;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class RestrictedStock extends Stock {
    @Column
    private int vestingPeriod;

    public int getVestingPeriod() {
        return vestingPeriod;
    }

    public void setVestingPeriod(int vestingPeriod) {
        this.vestingPeriod = vestingPeriod;
    }
}
