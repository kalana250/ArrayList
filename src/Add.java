import java.util.ArrayList;


public class Add {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        // add element - add();
        al.add("Umesha");
        al.add("Lahiru");
        al.add("Ometh");
        al.add("Chathurika");

        System.out.println("Names :- " + al);


        //access or search element - get();
        String s = al.get(3); //get(index);

        System.out.println("Index 3 Name is :- " + s);

        //change or update element - set();
        al.set(2,"Punchi Malith"); //set(index, value);

        System.out.println("Modified Names :- " + al);

        //remove or delete element - remove();
        String s1 = al.remove(2);

        System.out.println("Updated Array :- " + al);
        System.out.println("Removed Name is :- " + s1);
    }
}
