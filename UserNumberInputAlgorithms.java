import java.util.ArrayList;
import java.util.Scanner;

public class UserNumberInputAlgorithms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Enter Numbers (enter -1 to stop) :- ");

        while (true){

            int number = scanner.nextInt();

            if (number == -1){

                break;

            }

            arrayList.add(number);

        }

        // Displaying the entered numbers
        System.out.println("Entered Numbers:");
        for(int number : arrayList){
            System.out.println(number);
        }

        // Removing odd numbers
        arrayList = removeOddNumbers(arrayList);

        // Displaying the ArrayList after removing odd numbers
        System.out.println("ArrayList after removing odd numbers:");
        for (int num : arrayList) {
            System.out.println(num);
        }

        //search
        System.out.println("Enter a Number to search :- ");

        int searchNumber = scanner.nextInt();

        if (arrayList.contains(searchNumber)){

            System.out.println(searchNumber + " is in the Array List!");

        }else{

            System.out.println(searchNumber + " is not in the Array List!");
        }

        //remove
        System.out.println("Enter a number to remove :- ");

        int removeNumber = scanner.nextInt();

        if (remove(arrayList, removeNumber)) {

            System.out.println(removeNumber + " has been removed from the Array List!");

        } else {

            System.out.println(removeNumber + " is not in the Array List!");
        }

        // Displaying the ArrayList after removal
        System.out.println("Numbers after removal: " );
        for(int num2 : arrayList){
            System.out.println(num2);
        }

        // Calculate total and average
        int total = 0;

        for (int num : arrayList) {
            total += num;
        }

        double average = arrayList.isEmpty() ? 0 : (double) total / arrayList.size();

        System.out.println("Total of remaining numbers: " + total);
        System.out.println("Average of remaining numbers: " + average);
        System.out.println("Have A Good Day!");

        scanner.close();

    }

    public static ArrayList<Integer> removeOddNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public static boolean remove(ArrayList<Integer> numbers, int removeNumber) {
        int index = numbers.indexOf(removeNumber);
        if (index != -1) {
            numbers.remove(index);
            return true;
        }
        return false;
    }
}
