import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Whitespace {

//    private void checkFile(String filename) {
//        // open file named filename
//        try {
//            File myObj = new File(filename);
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(countBoth(data));
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//
//        }
//    }

    public static void main(String[] args) throws IOException {
        Whitespace wspc = new Whitespace();

//        wspc.checkFile("testdata1.txt");
        // attempting to copy method for pulling file from ParenSymmetry failed

        // for each file "testdata{1,2,3}.txt
        // read in all the text and
        // send it to countBoth

        wspc.countBoth("a b c d e"); // should print 4, 5

    }

    private void countBoth(String testdata) {
        int whitespaces = 0;
        int nonwhitespaces = 0;

        for (int i = 0; i < testdata.length(); i++) {
            if (testdata.charAt(i) == ' ' || testdata.charAt(i) == '\t' || testdata.charAt(i) == '\n' || testdata.charAt(i) == '\r') {
                whitespaces++;
            }
            else nonwhitespaces++;
        }

        System.out.println (whitespaces + ", " + nonwhitespaces);


        // count the number of whitepace chars and non-whitspace chars.
        // need to use a FOR loop.
        // print the results simply on a line #whitespaces, #ofnonwhitespacechars for each file.

    }


    // what you CANNOT do is use `Character.isWhitespace()`
    // you have to "write your own" by checking the char against what you think is whitespace
    // you should also USE a FOR loop to step thru each char in the String.
//    private void cannotDoThis(String input) {
//        long wspc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> Character.isWhitespace(c)).count();
//        long nwpsc = input.chars()
//                .mapToObj(a -> (char) a)
//                .filter(c -> !Character.isWhitespace(new Character(c))).count();
//
//        System.out.printf("%d, %d\n", wspc, nwpsc);
//    }
}
