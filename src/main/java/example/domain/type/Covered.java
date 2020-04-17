package example.domain.type;

/**
 * カバー有無
 */
public enum Covered {
    有,
    無;

    public boolean isCovered() {
        return this == 無;
    }
}
