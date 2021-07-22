package mc.nauka.filewordcounter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class wordCounter {

    public static void main(String[] args) throws IOException {
        String line;
        int count = 0;
        String word = "Java";

        FileReader file = new FileReader("C:\\Programowanie Java\\ProgrammingExercises\\src\\mc\\nauka\\filewordcounter\\java.txt");
        BufferedReader br = new BufferedReader(file);
        while((line = br.readLine()) != null){
            String words[] = line.split(" ");
            for (int i=0; i<words.length; i++)
                if (words[i].equals(word))
                    count++;
        }

        System.out.println("Number of words presented in given files " + count);
        br.close();

    }



}
/**
 FileReader fileReader = new FileReader("C:\\Programowanie Java\\ProgrammingExercises\\src\\mc\\nauka\\filewordcounter\\java.txt");
 int data = fileReader.read();
 while(data != -1){
 System.out.print((char)data);
 data = fileReader.read();


 System.out.println(wordCounter());
 String string = "java java to java mój język java programowania java java to zorientowany obiektowo język programowania";
 String[] words = string.split(" ");
 String word = "java";
 int occurrences = 0;
 for (int i=0; i<words.length; i++)
 if (words[i].equals(word))
 occurrences++;
 System.out.println(occurrences);



 }**/