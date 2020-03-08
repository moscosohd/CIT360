package ApplicationControllerPattern;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {

    public ApplicationTest() {

    }

    @BeforeClass

    public static void setUpClass() {

    }

    @AfterClass

    public static void tearDownClass() {

    }

package ApplicationControllerPattern;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Application {

        public static void main(String[] args){

            ApplicationControllerPattern dispatcher = new ApplicationControllerPattern();

            String sub = "sub";

            Integer num1 = -5;

            Integer num2 = 5;

            String command;

            Scanner in = new Scanner(System.in);

            System.out.println("What's the first number you'd like to calculate? ");

            num1 = Integer.parseInt(in.nextLine());

            System.out.println(“select operator (-): ");

            command = in.nextLine();

            if command.equals("-")){

            } else {

                System.out.println("You MUST enter a valid calulation operator."

                        + "\nRestart and try again with -");

                return;

            }

            System.out.println(“enter a second number ");

                    num2 = Integer.parseInt(in.nextLine());

            if (num2 == 0 && command.equals("/")){

                System.out.println("Error! Does not compute! Cannot divide by 0. Please restart and try again.");

                return;

            } else{

                System.out.print(num1 + " " + command + " " + num2 + " = ");

                dispatcher.handleCommand(command,num1,num2);

            }

        }

    }

    @Test

    public void testMain() {

        System.out.println("main");

        String[] args = null;

        Application.main(args);



        fail("The test case is a prototype.");

    }

}
