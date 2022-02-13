
import java.io.PrintWriter;

public class printWriter {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        String st = "How to print a line";
        pw.println("This is " + st);
    }
}


