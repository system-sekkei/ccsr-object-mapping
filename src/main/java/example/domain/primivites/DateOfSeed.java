package example.domain.primivites;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * 種をまいた日
 */
public class DateOfSeed {
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate value;

    @Override
    public String toString() {
        return value.toString();
    }
}
