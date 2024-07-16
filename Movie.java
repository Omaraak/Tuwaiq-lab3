import java.util.ArrayList;

public class Movie extends Media{
    private int duration;

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public Movie(String title, String author, double price, int duration) {
        super(title, author, price);
        this.duration = duration;
    }

    public void watch(User user){
        user.add_to_purchase(this);
    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie i: movieCatalog){
            if(i.getAuthor().equals(this.getAuthor()))
                result.add(i);
        }
        return result;
    }

    @Override
    public String getMediaType() {
        return (this.duration >= 120)? "Loong movie" : "Movie";
    }

    @Override
    public String toString() {
        return super.toString() + "duration: " + duration;
    }
}
