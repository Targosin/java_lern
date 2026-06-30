class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Дата выхода: " + year + " г.");
    }

}

public class  BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Дракула", "Брэм Стокер", 2024);
        Book book2 = new Book("Вьюрки", "Дарья Бобылёва", 2020);

        System.out.println("Книга первая: ");
        book1.displayInfo();

        System.out.println("Книга вторая: ");
        book2.displayInfo();
    }
}