package stock;

import jakarta.persistence.*;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private int stockId;
    @Column
    private String comName;
    @Column
    private String tickerSymbol;


    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
}
