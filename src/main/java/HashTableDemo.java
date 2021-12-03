import java.util.HashMap;

/***
*Hashmap has very important and useful methods that gives us opportunities to do many things like passing an element
* in to an object , removing an element, replacing an element, clear all the elements, get a particular element,
* get the size of the elements of the object and these, two very useful methods : containsKey and containsValue
*
* HashMap Methods To Focus on:
* 1. put()
* 2. remove()
* 3. replace()
* 4. clear()
* 5. containsKey()
* 6. containsValue()
* 7. get()
* 8. size()
**********************************************************************************************************************/

public class HashTableDemo {
    public static void main ( String[] args) {

        /* Demonstration on how to use put() method in Hashmap */
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Variable Declaration");
        hashMap.put(2, "Variable Initialization");
        hashMap.put(3, "Method Declaration");
        hashMap.put(4, "Method Definition");
        hashMap.put(5, "Method Invocation");

        System.out.println("Programming process : " + hashMap);
        System.out.println();

        /* Demonstration on how to use containKey() method in Hashmap */
        System.out.println("Programming process : " + hashMap.containsKey(1));
        System.out.println();

        /* Demonstration on how to use get() method in Hashmap */
        System.out.println("Programming process : " + hashMap.get(1));
        System.out.println();

        /* Demonstration on how to use containValue() method in Hashmap */
        System.out.println("Programming process : " + hashMap.containsValue("Variable Initialization"));
        System.out.println();

        /* Demonstration on how to use remove() method in Hashmap */
        System.out.println("Programming process : " + hashMap.remove(2,"Variable Initialization"));
        System.out.println("Programming process index 2, has been removed:  " + hashMap);
        System.out.println("The elements of the object remains only:" +" "+ hashMap.size()+ " "+"Elements");
        System.out.println();

        /* Demonstration on how to use replace() method in Hashmap.To Replace the index 1, element with new element */
        System.out.println("Replacing index 1: " + hashMap.replace(1,"Variable Declaration", "Variable Initialization"));
        System.out.println("Programming process after replace method has been implemented : " + hashMap);
        System.out.println();

        /* Demonstration on how to use clear() method in Hashmap */
        hashMap.clear();
        System.out.println("The object is now empty because of clear() implementation: " + hashMap.isEmpty());
        System.out.println(hashMap);
    }


}
