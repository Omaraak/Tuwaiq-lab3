public class Review {
    private String user_name, comment;
    private double rating;

    public Review(){

    }

    public Review(String user_name, String comment, double rating) {
        this.user_name = user_name;
        this.comment = comment;
        this.rating = rating;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getComment() {
        return comment;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Review: " +
                "user name: '" + user_name + '\'' +
                ", comment: '" + comment + '\'' +
                ", rating: " + rating;
    }
}
