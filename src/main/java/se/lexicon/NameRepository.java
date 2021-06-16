package se.lexicon;
import java.util.Arrays;

/**
 * Name Repository
 *
 */

 public class NameRepository {
    //Field variable - Variable in Class
   private static String[] names = {"Simon Elbrink", "Mehrdad Javan", "Abbe Mohamud"};

   public static void main(String[] args) {

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        System.out.println();

        findAll();
        System.out.println("Copy to new string and print out\n");

        getSize();
        System.out.println("It said 3 hopefully!\n");

        find("Simon Elbrink");
        System.out.println("Simon Elbrink found\n");

        update("Simon Elbrink","Simon Elbjork");
        System.out.println("Simon's name updated \n");


        findByFirstName("Simon");
        System.out.println("found by first Name\n");

        findByLastName("Javan");
        System.out.println("found by last name\n");


        add("Abbe Dero");
        System.out.println("Abbe Dero was added\n");

        clear();
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

    }

    //Returns number of elements in the array
    public static int getSize() {

        int size = names.length;
        System.out.println(size);

        return size;
    }

    //should completely empty the array
    public static void clear(){
         names = new String[0];
      //  for (int i = 0; i < names.length; i++)
        //    names[i] = null;
        //  Arrays.fill(names, null); can be used also
    }

    //Returns all names in a new array
    public static String[] findAll(){

        String[] newNames = Arrays.copyOf(names,names.length);
        System.out.println("Arrays.toString(newNames) = " + Arrays.toString(newNames));

        return newNames;
    }

    //Returns name if found and null if not found.
    public static String find(final String fullName)
    {
        for(String name : names) {
            if(name.equalsIgnoreCase(fullName)) {
                System.out.println((fullName));
                return name;
            }
        }
        return "null";

    }

    //Searches the array trying to find all names that has passed in first name.
    //Returns a String array containing all matches.

    public static String[] findByFirstName(final String firstName ){

        for (String name : names) {
            if (name.startsWith(firstName)) {
                System.out.println(name);
            }


        }return names;

    }

    //Searches the array trying to find all names that has passed in last name.
    //Returns a String array containing all matches.

    public static String[] findByLastName(final String lastName ){

        for (String name : names) {
            if (name.endsWith(lastName)) {
                System.out.println(name);
            }


        }return names;

    }

    //Should add a new name to the array.
    //Returns true when name was added and false when the array contains the name.

    public static boolean add(final String fullName){

        // No duplicates allowed
        for (String name:names) {
            if (name.equalsIgnoreCase(fullName)) {
                return false;
            }
        }

        // Add behavior

        //Expanding Array
        String[] expandedArray = Arrays.copyOf(names, names.length + 1);

        System.out.println("Arrays.toString(expandedArray) = " + Arrays.toString(expandedArray));

        //Added Element to The Array
        expandedArray[expandedArray.length -1] = fullName;

        //Replacing Array with new expandedArray
        names = expandedArray;

        System.out.println("Arrays.toString(songTitle) = " + Arrays.toString(names));

        return true;
    }

    //finds a name and replace it with new fullName
    public static boolean update(final String original, final String updatedName){

        for (String name : names) {
            if (name.equalsIgnoreCase(original)) {
                System.out.println(name.replace(original,updatedName));
                return true;

            }else{
                return false;
            }
        }
        return true;

    }
}

