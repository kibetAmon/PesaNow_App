package transactionService;
/*----------IMPORTS AND PACKAGES-----*/
import org.springframework.stereotype.Service;
import transaction.Transaction;
import java.util.Date;
import java.util.List;

/*Annotating the service class for readability*/
@Service
public class TransactionService {

    /*-Method that returns the list of transactions-*/
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber){
        return List.of(Transaction
                .builder()
                .type("Credit")
                .date(new Date())
                .accountNumber(accountNumber)
                .currency("KSH")
                .amount(500.45)
                .merchantName("Equity")
                .merchantLogo("")
                .build()
        );
    }
}
