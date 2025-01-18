package info.picocli;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "Impact Tech Inc.", description = "Printing the company name")

public class PrintImpact implements Runnable {
    public static void main(String[] args) {
        new CommandLine(new PrintImpact()).execute(args);
    }

    @Override
    public void run() {
        System.out.println("Impact Tech Inc.");
    }
}