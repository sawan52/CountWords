import java.io.File;
import java.util.Scanner;

public class CountWord {

    public static void main(String[] args) throws Exception {

        File file = new File("Coursera Financial Aid for Android.txt");
        Scanner scanner = new Scanner(file);

        int countWords = 0;
        while (scanner.hasNextLine()){

            // take each line from the file
            String line = scanner.nextLine();

            // and split it to get the number of words present in a single line and add the number of words of each line...
            countWords = countWords + line.split("").length;

        }

        // print the total number of words present the file...
        System.out.println("The file contains " + countWords + " words");
    }
}
