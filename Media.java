public class Media {
    private String title, author, isbn;
    private double price;

    public Media(){}

    public Media(String title, String author, String isbn, double price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public Media(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Media(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getMediaType(){
        return "Media";
    }

    @Override
    public String toString() {
        return "title: " + title + " author: " + author + " isbn: " + isbn + " price" + price + " ";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
