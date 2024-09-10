package Persewaan; //nama folder tempat penyimpanan
//subclass
public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public CD() {
        number = 10;
        name = "CD Selamat Siang";
        quantity = 100;
        price = 20000.0;
        artist = "Salman";
        totalSong = 50;
        label = "Sony Music";
    }
}
