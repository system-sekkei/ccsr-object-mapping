package example.domain.model.kit.specification;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 種をまいた日
 */
public class DateOfSeed {
    @NotNull(message = "必須")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate value;

    private DateOfSeed(LocalDate value) {
        this.value = value;
    }

    public DateOfSeed() {}

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M月d日");
    public String when() {
        return value.format(formatter);
    }
    @Override
    public String toString() {
        return value.toString();
    }

    public static DateOfSeed today() {
        return new DateOfSeed(LocalDate.now());
    }
}
