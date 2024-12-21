package stock;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class OptionalStock extends Stock{
    @Column
    private String optionType;
    @Column
    private double strikePrice;

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(double strikePrice) {
        this.strikePrice = strikePrice;
    }
}
