package example.domain.type;

import java.util.UUID;

/**
 * 識別番号
 */
public class Identity {

    String format;

    public Identity(String format) {
        this.format = format;
    }

    public String generate() {
        String source = UUID.randomUUID().toString().toUpperCase();
        Object[] elements = source.substring(4,28).split("-");
        // UUID文字列を使って、4文字の16数表記を5つ生成
        return String.format(format, elements);
    }
}