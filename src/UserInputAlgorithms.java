import java.util.ArrayList;
import java.util.Scanner;

public class UserInputAlgorithms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println("Enetr Names :- ");

        while (true){

            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")){

                break;

            }

            arrayList.add(name);

        }

        for(String name : arrayList){

            System.out.println("Entered Name :- " + name);

        }

        System.out.println("Enter a name to search :- ");

        String searchName = scanner.nextLine();

        if (arrayList.contains(searchName)){

            System.out.println(searchName + " is in the Array List!");

        }else{

            System.out.println(searchName + " is not in the Array List!");
        }

        System.out.println("Enter a name to remove :- ");

        String removeName = scanner.nextLine();

        if(arrayList.remove(removeName)){

            System.out.println(removeName + " has been removed from the Array List!");

        }else{

            System.out.println(removeName + " is not in the Array List!");

        }

        System.out.println("Names after removal :- ");
        for(String name : arrayList){

            System.out.println(name);

        }

        scanner.close();

    }
}
