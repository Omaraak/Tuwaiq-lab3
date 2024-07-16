import java.util.ArrayList;

public class Music extends Media{
    private String artist;


    public Music(String title, String artist, double price) {
        super(title, price);
        this.artist = artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void listen(User user){
        user.add_to_purchase(this);
    }

    public ArrayList<Music> generatePlayList(ArrayList<Music> musicCatalog){
        ArrayList<Music> result = new ArrayList<>();
        for (Music i: musicCatalog){
            if(i.artist.equals(this.artist))
                result.add(i);
        }
        return result;
    }

    @Override
    public String getMediaType() {
        return (this.getPrice() >= 10)? "Premium" : "Music";
    }

    @Override
    public String toString() {
        return super.toString() + "artist: " + artist;
    }
}
