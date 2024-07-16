import java.util.ArrayList;

public class User {
    private String user_name,email;
    private ArrayList<Media> purchased_media = new ArrayList<>();
    private ArrayList<Media> shopping_cart = new ArrayList<>();

    public User(String email, String user_name) {
        this.email = email;
        this.user_name = user_name;
    }

    public void add_to_cart(Media media){
        shopping_cart.add(media);
    }

    public void remove_from_cart(Media media){
        shopping_cart.remove(media);
    }

    public void add_to_purchase(Media media){
        purchased_media.add(media);
    }

    public void checkout(){
        for(Media i: shopping_cart){
            if (i instanceof Book)
                ((Book) i).setIn_stock_units(((Book) i).getIn_stock_units() - 1);
        }
    }

    public String getUser_name() {
        return user_name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Media> getPurchased_media() {
        return purchased_media;
    }
    public ArrayList<Media> getShopping_cart() {
        return shopping_cart;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", purchased_media=" + purchased_media +
                ", shopping_cart=" + shopping_cart +
                '}';
    }
}
