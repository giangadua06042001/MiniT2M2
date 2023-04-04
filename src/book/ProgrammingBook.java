package book;

public class ProgrammingBook extends  Books{
    private String language;
    private int framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language,int framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework=framework;
    }

    public int framework() {
        return framework;
    }

    public void setFramework(int framework) {
        this.framework = framework;
    }

    public String language() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString()
                +language
                +framework;
    }
}
