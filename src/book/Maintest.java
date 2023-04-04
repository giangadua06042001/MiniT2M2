package book;

public class Maintest {
    public static void main(String[] args) {
        Books[] books = new Books[10];
        books[0] = new ProgrammingBook(1, "ddd", 220, "tom", "trung quoc", 340);
        books[1] = new ProgrammingBook(2, "ddd", 220, "tom", "trung quoc", 340);
        books[2] = new ProgrammingBook(3, "ddd", 220, "tom", "trung quoc", 340);
        books[3] = new ProgrammingBook(4, "ddd", 220, "tom", "trung quoc", 340);
        books[4] = new ProgrammingBook(5, "ddd", 20, "tom", "trung quoc", 340);
        books[5] = new FictionBook(6, "00", 300, "hon", "viễn tưởng 1");
        books[6] = new FictionBook(6, "00", 300, "hon", "viễn tưởng 1");
        books[7] = new FictionBook(6, "00", 300, "hon", "viễn tưởng 1");
        books[8] = new FictionBook(6, "00", 300, "hon", "tom");
        books[9] = new FictionBook(6, "00", 300, "hon", "tom");
        double total = 0;
        double sum = 0;
        double count = 0;


        for (Books book : books) {
            total += book.price();
            if (book instanceof FictionBook) {
                if (((FictionBook) book).category() == "viễn tưởng 1") {
                    sum++;

                }
            }
            if (book.price() < 100) {
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(total);
        System.out.println(count);
    }
    

}
