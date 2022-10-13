import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //tablica ma z góry określoną wielkość i musi zawierać elementy tego samego typu
        int[] numbers = new int[4];
        numbers[0] = 2;
        numbers[1] = 7;
        numbers[2] = 9;
        numbers[3] = 5;

        System.out.println(numbers[0]); //wyświetlanie elementu tablicy
        System.out.println(numbers); //wyświetla referencje tablicy
        //wyświetlanie tablicy możliwe jest przy pomocy pętli
        for (int num:numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        //tablica dwuwymiarowa, tablica wypełniona przy pomocy pętli
        int[][] num2d = new int[3][3];
        for (int i=0; i<num2d.length; i++) {
            for (int j = 0; j < num2d.length; j++) {
                num2d[i][j] = i + j;
                System.out.print(num2d[i][j] + "\t");
            }
            System.out.println();
        }

        String[] names = {"Karol", "Wojtek", "Andrzej"}; //tablica Stringów
        for (String nam: names) {
            System.out.println(nam);
        }

        ArrayList list = new ArrayList(); //elementy w liście mogą być różnych typów
        list.add("Pies");
        list.add(574);
        list.add(8.9);
        System.out.println(list); //lista może zostać wyświetlona bez użycia pętli
        System.out.println("rozmiar listy: "+list.size()); //rozmiar listy
        System.out.println("drugi element listy: "+list.get(1)); //pobieranie elementów z listy

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kraków");
        cities.add("Warszawa");
        cities.add("Poznań");
        System.out.println(cities); //lista wyświetlana jest w konsoli w nawiasach kwadratowych

        cities.remove(1); //usuwanie elementów z listy jest łatwiejsze w porównaniu do tablicy
        System.out.println(cities);
    }
}
