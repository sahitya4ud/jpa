package atmwithspringioc;

public class CashDispenser {

    private String dispenserId;

    public CashDispenser(String dispenserId) {
        this.dispenserId = dispenserId;
    }

    @Override
    public String toString() {
        return "CashDispenser{" +
                "dispenserId='" + dispenserId + '\'' +
                '}';
    }
}
