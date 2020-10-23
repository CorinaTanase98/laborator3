package Ex2;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("no input file");
            System.exit(1);
        }
        try {
            File file = new File(args[0]);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Pattern email =
                        Pattern.compile("[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*", Pattern.CASE_INSENSITIVE);

                Matcher m = email.matcher(data);
                int count=0;
                while(m.find()) {
                        System.out.println(m.group(0));
                }
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

