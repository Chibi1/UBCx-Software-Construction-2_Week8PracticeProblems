package model;

public abstract class Book {
    private String title;
    private double price;
    private Box box;

    private static final double FLAT_RATE_SHIPPING = 2.00;
//    private static final String MIN_BOX_SIZE;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        this.box = null; // book starts off unpackaged
    }

    public abstract Box packageBook(Box b);

    public String getTitle() {
        return title;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    // EFFECTS: Returns the flat rate for shipping a standard sized book
//    public double calculateShipping() {
//        return FLAT_RATE_SHIPPING;
//    }
    public abstract double calculateShipping();

    // EFFECTS: returns the minimum required size of box for packaging this book
    public abstract String getMinBoxSize();
}
