import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Logger {

    File IncomeLog = new File("C:\\Users\\Student\\workspace\\UpdatedCP\\Suggestions.txt");
    boolean append = IncomeLog.exists();
    Scanner scan = new Scanner(System.in);

    DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
    String dateTime = LocalDateTime.now().format(formatTime);

    public void log(String userInput) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(IncomeLog, append))) {
            writer.println(dateTime + " " + userInput);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public void suggestionMenu(){
        System.out.println("Have a suggestion for a drink? Please enter your suggestion below:");
        System.out.println();
        String userIdea = scan.nextLine();
        log(userIdea);
        System.out.println("Thank you for your suggestion!");
        System.out.println();
    }
}