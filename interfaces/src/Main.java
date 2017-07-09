import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tracxn-lp-175 on 8/7/17.
 */
public class Main {

    public static void main(String[] args) {
        Player maverick = new Player("maverick27","M4A1", 12,29);
        System.out.println(maverick.getHitPoints());
        System.out.println(maverick.getName());
        saveObject(maverick);
//        loadObject(maverick);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        Boolean quit = false;
        while(!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();;
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }

}
