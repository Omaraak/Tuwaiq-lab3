import java.util.ArrayList;

public class Store {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Media> medias = new ArrayList<>();

    public  Store(){
    }
    public Store(ArrayList<User> users, ArrayList<Media> medias) {
        this.users = users;
        this.medias = medias;
    }

    public void addUser(User user){
        users.add(user);
    }
    public ArrayList<User> displayUsers(){
        return users;
    }
    public void addMedia(Media media){
        medias.add(media);
    }
    public ArrayList<Media> displayMedias(){
        return medias;
    }
    public Book searchBook(String title){
        Book result = new Book();
        for(Media i: medias){
            if(i instanceof Book && i.getTitle().equals(title))
                result = (Book) i;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Store{" +
                "users=" + users +
                ", medias=" + medias +
                '}';
    }
}
