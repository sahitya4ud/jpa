package creditcardtransaction;

import java.util.Date;

public class ListOfTransactionsBillPeriod {
    private Date fromDate;
    private Date toDate;

    public ListOfTransactionsBillPeriod(){

    }

    public ListOfTransactionsBillPeriod(Date fromDate,Date toDate){

        if(fromDate.after(toDate)){

        }
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
