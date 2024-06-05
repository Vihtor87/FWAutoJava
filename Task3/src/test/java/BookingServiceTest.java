import com.max.BookingService;
import com.max.CantBookException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;


public class BookingServiceTest {
    @Test
    void bookTest() throws CantBookException {
        BookingService bookingServiceMok = Mockito.mock(BookingService.class);
        LocalDateTime localDateTime = LocalDateTime.of(2024, 2, 29, 17, 8);
        bookingServiceMok.book("1", localDateTime, localDateTime);
    }
}
