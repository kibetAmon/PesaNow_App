import org.junit.jupiter.api.Test;
import transactionService.TransactionService;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TransactionServiceTest {
    TransactionService transactionService = new TransactionService();

    @Test
    public void testTransactionCount() {
        assertEquals(1, transactionService.findAllByAccountNumber(28282828).size());
    }
}
