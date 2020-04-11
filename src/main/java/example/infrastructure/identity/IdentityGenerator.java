package example.infrastructure.identity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class IdentityGenerator {
    public static String generate(String format) {
        String source = UUID.randomUUID().toString().toUpperCase();
        String[] elements = source.split("-");

        return String.format(format, elements);
    }
}
