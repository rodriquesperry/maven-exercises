import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        String userInput;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Something: ");
            userInput = scanner.nextLine();
            if (!StringUtils.isNumeric(userInput)) {
                System.out.println(userInput + " is not a number");
                System.out.println(StringUtils.swapCase(userInput));
                System.out.println(StringUtils.reverse(userInput));
            } else {
                System.out.println("Please enter something other than a number.");
            }
        } while (StringUtils.isNumeric(userInput));
    }


}
