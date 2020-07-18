package api.gson;

public interface SerializableRequest {

    boolean validate();

    default boolean notNullAndNotEmpty(final String... strings) {
        for (final String string : strings) {
            if (string == null || string.isEmpty()) return false;
        }
        return true;
    }
}
