package Persewaan; //nama folder tempat penyimpanan

//subclass
public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public CD() {
        super();
        artist = "Salman";
        totalSong = 50;
        label = "Sony Music";
    }

    public CD(int number, String name, int quantity, double price, String artist, int totalSong, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.totalSong = totalSong;
        this.label = label;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Artist : " + artist);
        System.out.println("Total Song : " + totalSong);
        System.out.println("Label : " + label);
    }
}
