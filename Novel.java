public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, String isbn, double price, int in_stock_units, String genre) {
        super(title, author, isbn, price, in_stock_units);
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        return "Novel";
    }

    @Override
    public String toString() {
        return super.toString() + " genre: " + genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
