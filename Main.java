import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Review class
        System.out.println("Review class\n");
        Review review1 = new Review();
        Review review2 = new Review("Omar", "so good",9);

        //setter getter
        System.out.println("setter and getter\n");

        //before
        System.out.println("before:\n" + "user name: " + review1.getUser_name() + " comment: " + review1.getComment() + " rating: " + review1.getRating() + "\n");

        //set new values
        review1.setUser_name("Sam");
        review1.setComment("Good");
        review1.setRating(10);

        //after
        System.out.println("after:\n" + "user name: " + review1.getUser_name() + " comment: " + review1.getComment() + " rating: " + review1.getRating());

        System.out.println("\n-----------------------------------");

        //User class -----------------------------------------------------------------------------------------
        System.out.println("User class\n");
        User user1 = new User("sam@gmail.com","Sam");
        User user2 = new User("omar@gmail.com", "Omar");
        User user3 = new User("ana@gmail.com", "ana");

        //to string
        System.out.println("to string");
        System.out.println(user1.toString());

        //add to cart func
        System.out.println("\nadd to cart func");

        Media media1 = new Media("How to be poor","Sam LH","120102103",25);
        Media media2 = new Media("How to be good","Ana MQ","101010101",10);
        Media media3 = new Media("How to be bad","Dad MA","303030303",25);
        ArrayList<Media> mediaArr = new ArrayList<>();
        mediaArr.add(media1);
        mediaArr.add(media2);
        mediaArr.add(media3);

        System.out.println(user1.getShopping_cart());
        user1.add_to_cart(media1);
        System.out.println(user1.getShopping_cart());

        //remove from cart
        System.out.println("\nremove from cart func");
        System.out.println(user1.getShopping_cart());
        user1.remove_from_cart(media1);
        System.out.println(user1.getShopping_cart());

        //checkout
        System.out.println("\ncheckout func");
        Book book3 = new Book("How to be poor","Ana M","120102103",25,10);
        System.out.println("in stock units: "+book3.getIn_stock_units());
        user1.add_to_cart(book3);
        user1.checkout();
        System.out.println("in stock units: "+book3.getIn_stock_units());

        System.out.println("\n-----------------------------------");

        //Book class -----------------------------------------------------------------------------------------
        System.out.println("Book class\n");
        Book book1 = new Book("How to be poor","Ana M","120102103",25,10);
        Book book2 = new Book("How to be rich","Omar K","SA101010",20,50);

        //type of media
        System.out.println("The type of media is: " + book1.getMediaType());

        //add reviews
        System.out.println("\nadd func");
        System.out.println(book1.getReviews());
        book1.add_review(review1);
        book1.add_review(review2);
        System.out.println(book1.getReviews());

        //get average ratting func
        System.out.println("\nget average ratting func");
        System.out.println(book1.get_average_ratting());

        //to string
        System.out.println("\nto string");
        System.out.println("Book 1 " + book1.toString());

        //purchase func
        System.out.println("\npurchase func");
        System.out.println("user 3 Purchased media"+user3.getPurchased_media());
        book1.purchase(user3);
        System.out.println("user 3 Purchased media"+user3.getPurchased_media());

        //isBestseller func
        System.out.println("\nisBestseller func");
        System.out.println("is book 1 a bestseller? "+book1.isBestseller());
        System.out.println("is book 2 a bestseller? "+book2.isBestseller());

        //restock func
        System.out.println("\nrestock func");
        System.out.println("book 1 stock is: "+book1.getIn_stock_units());
        book1.restock(10);
        System.out.println("book 1 stock is: "+book1.getIn_stock_units());

        System.out.println("\n-----------------------------------");

        //Novel class -----------------------------------------------------------------------------------------
        System.out.println("Novel class\n");
        Novel novel1 = new Novel("Game of throws","Gorg RR Martin","j1020383",50,100,"fantasy");
        Novel novel2 = new Novel("Game of throws","Gorg RR Martin","j1020383",50,100,"fantasy");

        System.out.println("The type of media is: " + novel1.getMediaType());
        System.out.println("Novel 2 " + novel2.toString());

        System.out.println("\n-----------------------------------");

        //AcademicBook class
        System.out.println("AcademicBook class\n");
        AcademicBook academicBook1 = new AcademicBook("The relationship between sugar and overweight","Omar KH",12,10);
        AcademicBook academicBook2 = new AcademicBook("The relationship between music and happens","Omar KH",13,15);

        System.out.println("The type of media is: " + academicBook1.getMediaType());
        System.out.println("Academic Book 2 " + academicBook2.toString());

        System.out.println("\n-----------------------------------");


        //Store class
        System.out.println("Store class\n");
        Store store = new Store();
        //store add user and display users
        System.out.println("store add user and display users");
        System.out.println("store users before ");
        System.out.println(store.displayUsers());
        store.addUser(user1);
        System.out.println("store users after ");
        System.out.println(store.displayUsers());

        //add media and display medias
        System.out.println("add media and display medias");
        System.out.println("\nstore medias ");
        System.out.println(store.displayMedias());
        store.addMedia(media1);
        System.out.println(store.displayMedias());

        System.out.println("\n-----------------------------------");

        //Music class -----------------------------------------------------------------------------------------
        System.out.println("Music class\n");
        Music music1 = new Music("Light a Fire","Mick Flannery",12);
        Music music2 = new Music("Hold Your Own","Mick Flannery",1);
        Music music3 = new Music("Light a fire","Kae Tempest",5);

        //The type of media : Premium
        System.out.println("The type of media is: " + music1.getMediaType());

        //The type of media : Music
        System.out.println("The type of media is: " + music2.getMediaType());

        //listen func
        System.out.println("\nlisten func");

        System.out.println("before:\n" + user1.getPurchased_media());

        music1.listen(user1);

        System.out.println("after:\n" + user1.getPurchased_media());

        //generatePlayList
        System.out.println("\ngeneratePlayList");

        ArrayList<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add(music1);
        musicCatalog.add(music2);
        musicCatalog.add(music3);

        System.out.println(music1.generatePlayList(musicCatalog));

        //to string
        System.out.println("\nto string");
        System.out.println(music1.toString());

        System.out.println("\n-----------------------------------");

        //Movie class -----------------------------------------------------------------------------------------
        System.out.println("Movie class\n");
        Movie movie1 = new Movie("Poor Things","Sam",10,150);
        Movie movie2 = new Movie("The Lobster","Flats",10,100);
        Movie movie3 = new Movie("The Menu","Flats",10,140);

        //The type of media : Loong movie
        System.out.println("The type of media is: " + movie1.getMediaType());

        //The type of media : Movie
        System.out.println("The type of media is: " + movie2.getMediaType());

        //watch func
        System.out.println("\nwatch func");

        System.out.println("before:\n" + user2.getPurchased_media());

        movie1.watch(user2);

        System.out.println("after:\n" + user2.getPurchased_media());

        //recommend Similar Movies
        System.out.println("\nrecommend Similar Movies");

        ArrayList<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie1);
        movieCatalog.add(movie2);
        movieCatalog.add(movie3);

        System.out.println(movie2.recommendSimilarMovies(movieCatalog));

        //to string
        System.out.println("\nto string");
        System.out.println(movie1.toString());
    }
}