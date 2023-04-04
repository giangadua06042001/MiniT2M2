package book;

public class FictionBook extends  Books{
    private String category;

    public FictionBook() {
    }

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String category() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return super.toString()
                +category;
    }
}
