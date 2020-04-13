package example.domain.identity;

import java.util.UUID;

public class IdentityGenerator {
    public static String generate(String format) {
        String source = UUID.randomUUID().toString().toUpperCase();
        Object[] elements = source.split("-");

        return String.format(format, elements);
    }
}
