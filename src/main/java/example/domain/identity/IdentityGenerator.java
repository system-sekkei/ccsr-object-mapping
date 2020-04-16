package example.domain.identity;

import java.util.UUID;

public class IdentityGenerator {
    public static String generate(String format) {
        String source = UUID.randomUUID().toString().toUpperCase();
        Object[] elements = source.substring(4,28).split("-");
        // UUID文字列を使って、4文字の16数表記を5つ生成
        return String.format(format, elements);
    }
}