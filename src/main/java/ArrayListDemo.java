/*
 * ArrayList has some very useful methods and that is what I want to explain here, to demonstrate how use these methods
 * in building useful program.
 * Hint: I will be writing these codes by following clean code principles.
 * Author: Ajao Hazzan
 * These methods are : add(), remove(), set(), sort(), clear()
 *
 * Task 1: Write a program that will display these following names of students in a class : Alex, Abraham, Anthony, Brown, Bobby, Clement,
 * Clifford, Clark, David, Dolly and Donald.
 * Task 2: Assume that Anthony and Clark are no longer in the class use remove method to remove their names.
 * Task 3: Assume that Alex is the class captain use set method to get only his name displayed.
 * Task 4: Use sort method to re-arrange the student names.
 * Task 5: Use clear method to remove all their name.
 ***/



import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main ( String[] args){
    ArrayList<String> arrayList = new ArrayList<String>();
    /*
    *Task 1: Write a program that will display these following names of students in a class : Alex, Abraham, Anthony,
    *Brown, Bobby, Clement,Clifford, Clark, David, Dolly and Donald.
    *Adding students' names into the "arrayList" that represents the object created.
    ***/
        arrayList.add("Alex ");
        arrayList.add("Abraham ");
        arrayList.add("Anthony");
        arrayList.add("Brown");
        arrayList.add("Bobby");
        arrayList.add("Clement");
        arrayList.add("Clifford");
        arrayList.add("Clark");
        arrayList.add("David");
        arrayList.add("Dolly");
        arrayList.add("Donald");
    /*
    *Note that we can also add index, this is extremely useful for prioritization, sorting and setting sequential
    *orders. This will be demonstrated in Task 4.
    ****/

        System.out.println("The names of the students are :" + arrayList + arrayList.size());

        System.out.println();

        /*
         *Task 2: Assume that Anthony and Clark are no longer in the class use remove method to remove their names.
         **/

        arrayList.remove("Anthony");
        arrayList.remove("Clark");

        System.out.println("These are current names of the students,after two people " +
                "were removed from the class :" + arrayList + arrayList.size());

        System.out.println();
        /*
         * Task 3: Assume that Alex is the class captain use set method to get only his name displayed.
         **/

        arrayList.set(0, "Alex ");
        arrayList.set(1,"Abraham ");
        arrayList.set(2,"Brown");
        arrayList.set(3,"Bobby");
        arrayList.set(4,"Clement");
        arrayList.set(5,"Clifford");
        arrayList.set(6,"David");
        arrayList.set(7,"Dolly");
        arrayList.set(8,"Donald");

        System.out.println("The class captain is:" + arrayList.get(0));

        System.out.println();
        /*
         * Task 4: Use sort method to re-arrange the student names.
         **/

        arrayList.set(1, "Alex ");
        arrayList.set(0,"Abraham ");
        arrayList.set(6,"Brown");
        arrayList.set(3,"Bobby");
        arrayList.set(4,"Clement");
        arrayList.set(5,"Clifford");
        arrayList.set(7,"David");
        arrayList.set(8,"Dolly");
        arrayList.set(2,"Donald");

        Collections.sort(arrayList);

        System.out.println("The names of the student after sorting:" + arrayList);

        System.out.println();

        /*
         * Task 5: Use clear method to remove all their names.
         **/

        arrayList.clear();

        System.out.println("Now all the names has been removed!. Is that true ?: " + " " + arrayList.isEmpty());
        System.out.println("Now we have empty arrayList" + arrayList);
    }



}
