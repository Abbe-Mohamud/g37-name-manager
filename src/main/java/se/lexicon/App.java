package se.lexicon;

import java.util.Arrays;

/**
 * Name Repository
 *
 */
public class App {

    private static String[] names = {"Simon Elbrink", "Mehrdad Javan", "Abbe Mohamud"};

    public static void main(String[] args) {



        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        System.out.println();

        NameRepository.findAll();
        System.out.println("Copy to new string and print out\n");

        NameRepository.getSize();
        System.out.println("It said 3 hopefully!\n");

        NameRepository.find("Simon Elbrink");
        System.out.println("Simon Elbrink found\n");

        NameRepository.update("Simon Elbrink","Simon Elbjork");
        System.out.println("Simon's name updated \n");


        NameRepository.findByFirstName("Simon");
        System.out.println("found by first Name\n");

        NameRepository.findByLastName("Javan");
        System.out.println("found by last name\n");


        NameRepository.add("Abbe Dero");
        System.out.println("Abbe Dero was added\n");

        NameRepository.clear();
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

    }
}
