import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Meetup {

    private int month;
    private int year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public LocalDate day(DayOfWeek day, MeetupSchedule schedule) {
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate meetupDate;
        switch (schedule) {
        case FIRST:
            meetupDate = date.with(TemporalAdjusters.firstInMonth(day));
            break;
        case SECOND:
            meetupDate = date.with(TemporalAdjusters.dayOfWeekInMonth(2, day));
            break;
        case THIRD:
            meetupDate = date.with(TemporalAdjusters.dayOfWeekInMonth(3, day));
            break;
        case FOURTH:
            meetupDate = date.with(TemporalAdjusters.dayOfWeekInMonth(4, day));
            break;
        case LAST:
            meetupDate = date.with(TemporalAdjusters.lastInMonth(day));
            break;
        default: {
            LocalDate tempDate = date.with(TemporalAdjusters.firstInMonth(day));
            while (!(tempDate.getDayOfMonth() >= 13 && tempDate.getDayOfMonth() <= 19)) {
                tempDate = tempDate.plusDays(7);
            }
            meetupDate = tempDate;
        }

        }
        return meetupDate;

    }
}