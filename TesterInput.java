package Persewaan;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan Nama CD: ");
        String name = in.nextLine();
        System.out.println("Inputkan Artist: ");
        String artist = in.nextLine();
        System.out.println("Inputkan Label: ");
        String label = in.nextLine();
        int number = in.nextInt();
        int quantity = in.nextInt();
        int totalSong = in.nextInt();
        double price = in.nextDouble();

        CD cd1 = new CD(number, name, quantity, price, artist, totalSong, label);
        cd1.print();
    }
}
