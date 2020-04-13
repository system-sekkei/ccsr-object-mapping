package example.domain.type;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 種をまいた日
 */
public class DateOfSeed {
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate value;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M月d日");
    public String when() {
        return value.format(formatter);
    }
    @Override
    public String toString() {
        return value.toString();
    }
}
