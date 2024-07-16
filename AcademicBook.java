public class AcademicBook extends Book{
    private String subject;

    @Override
    public String getMediaType() {
        return "Academic book";
    }

    public AcademicBook(String subject, String author, double price, int in_stock_units) {
        super(author, price, in_stock_units);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + " subject: " + subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
