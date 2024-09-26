package core.careerit.day11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingDataFromFile {
    public static void main(String[] args) throws IOException {

      /*  Scanner sc = new Scanner(ReadingDataFromFile.class.getResourceAsStream("/names.txt"));
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str.toUpperCase());
        } */

       File file = new File(ReadingDataFromFile.class.getResource("/names.txt").getFile());
       List<String> list = Files.readAllLines(file.toPath());
       for (String name:list){
           System.out.println(name.toUpperCase());
       }

    }
}
