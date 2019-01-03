package converter;

public class Converter {

    private final long id;
    private final String content;

    public Converter(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
