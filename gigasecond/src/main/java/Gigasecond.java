import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

class Gigasecond {
    LocalDateTime moment;
    public static final Duration GIGA_SECOND=Duration.ofSeconds(1_000_000_000);
    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        this.moment=moment.plus(GIGA_SECOND);
    }

    LocalDateTime getDateTime() {
        return moment;
    }

}
