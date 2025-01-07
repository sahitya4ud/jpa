package creditcardsmartemisystem;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillService {

    public List<Transaction> generateCardBill(CreditCard creditCard, Date fromDate, Date toDate) {
        if (creditCard == null || fromDate == null || toDate == null) {
           throw new IllegalArgumentException("Invalid card");

        }
        return creditCard.getTransactions().stream()

                .filter(t -> {
                    if(t.getTransactionDate() == null) {
                        System.out.println("skipping transaction with null date:"+t);
                        return false;

                    }
                    return !t.getTransactionDate().before(fromDate)  &&
                            !t.getTransactionDate().after(toDate);
                })
                .collect(Collectors.toList());




//                .filter(t ->  !t.getTransactionDate().before(fromDate) && !t.getTransactionDate().after(toDate))
//                .collect(Collectors.toList());

    }

}
