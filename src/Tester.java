/*Javadoc
        Create a class called WordGames that has two methods:
        addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
        getFullName method that takes two parameters as input called name and surname and returns their concatenation
        create a class called Tester that has the main method where you:
        create a new WordGames object
        print in console the result of the addHelloWord method invocation
        print in console the result of the getFullName method invocation
        add Javadoc comments to:
        the 2 classes with a short description and the author
        the 3 methods with a short description, the parameters and the return*/

import java.util.Scanner;

/**
 * Tests methods of wordGame class
 * @author: Sara Coppola
 */
public class Tester {

    /**
     * The main method in the Tester class
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        WordGames wordGame = new WordGames();

        System.out.println(wordGame.addHelloWord(scanner.nextLine()));
        System.out.println(wordGame.getFullName(scanner.nextLine(), scanner.nextLine()));

    }
}