import java.util.Scanner;
import java.io.*;

class Lines {
  public static void main(String[] args) throws Exception {

    File f_in = new File("test.txt");
    StringBuffer sb = new StringBuffer();
    Scanner sc = new Scanner(f_in);
    int i = 1;

        while (sc.hasNext()) {
        sb.append("/* " + i + " */ " + sc.nextLine() + "\n");
        i++;
        }
    sc.close();
    String result = sb.toString();

        try {
            PrintWriter output = new PrintWriter("output.txt");
            output.write(result);
            
            output.flush();
            output.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
   
    }
}