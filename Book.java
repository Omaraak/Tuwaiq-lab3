import java.util.ArrayList;

public class Book extends Media{
    private int in_stock_units;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Book(){}

    public Book(String title, String author, String isbn, double price, int in_stock_units){
        super(title, author, isbn, price);
        this.in_stock_units = in_stock_units;
    }

    public Book(String author, double price, int inStockUnits) {
        super(author,price);
        this.in_stock_units = inStockUnits;
    }

    public void add_review(Review review) {
        reviews.add(review);
    }

    public double get_average_ratting(){
        double avg=0, counter=0;

        for(Review i: reviews) {
            avg += i.getRating();
            counter++;
        }
        if(counter > 0)
            avg/=counter;

        return avg;
    }

    public void purchase(User user){
        if(in_stock_units > 0) {
            user.add_to_purchase(this);
            in_stock_units -= 1;
        }
    }

    public boolean isBestseller() {
        return get_average_ratting() >= 4.5;
    }

    public void restock(int num){
        in_stock_units+=num;
        System.out.println("successful restock");
    }

    @Override
    public String getMediaType() {
        return (isBestseller()) ? "Bestselling book" : "Book";
    }

    @Override
    public String toString() {
        return super.toString() + "in stock units" + in_stock_units + " reviews: " + reviews;
    }

    public int getIn_stock_units() {
        return in_stock_units;
    }

    public void setIn_stock_units(int in_stock_units) {
        this.in_stock_units = in_stock_units;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }
}
