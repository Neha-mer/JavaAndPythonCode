package JavaCoding;

class Movie {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getN() {
        return name;
    }
    public double getR() {
        return rating;
    }
    public int getY() {
        return year;
    }
}