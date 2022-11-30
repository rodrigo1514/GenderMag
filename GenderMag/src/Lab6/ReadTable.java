package Lab6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadTable {
    public static void main(String[] args)
        throws IOException
    {
        List<String> listOfStrings
            = new ArrayList<String>();
       
        // load the data from file
        listOfStrings
            = Files.readAllLines(Paths.get("movies.txt"));
       
        // convert arraylist to array
        String[] array
            = listOfStrings.toArray(new String[0]);
       
        // print each line of string in array
        for (String eachString : array) {
            System.out.println(eachString);
        }
    }
}
