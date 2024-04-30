import java.util.ArrayList;
import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String text = "my name is raahim and i is live in bahria town.";
        ArrayList<String>sentences = new ArrayList<>();

        String text1[] = text.split(" ");
        for (String s: text1)
            sentences.add(s);

        for (String s: text1)
            System.out.println(s);


        String text2[] = text.split("\\.");
        for (String s: text2)
            sentences.add(s);

        System.out.println();
        HashSet<String>unique = new HashSet<>();
        unique.addAll(sentences);
        for (String s: unique)
        System.out.println(s);


        //unique character check
        ArrayList<Character>uniqueC = new ArrayList<>();
        char uniqueChar[]=text.toCharArray();
        for (char c: uniqueChar)
            uniqueC.add(c);

        HashSet<Character>uChar = new HashSet<Character>();
        uChar.addAll(uniqueC);


        System.out.println("Total Words: ");
        System.out.println(text1.length);

        System.out.println("Total sentences: ");
        System.out.println(text2.length);

        System.out.println("Unique words: ");
        System.out.println(unique.size());

        System.out.println("Unique characters: ");
        System.out.println(uChar.size());



        ArrayList<wordCount> wordFreq = new ArrayList<>();

        //ArrayList<String>sentences = new ArrayList<>();

        String text3[] = text.split(" ");
        System.out.println(text1.length);
        for (String temp: text1){
          if (wordFreq.contains(new wordCount(temp,0))){
             int index =  wordFreq.indexOf(new wordCount(temp,0));
             wordFreq.get(index).setCount(wordFreq.get(index).getCount()+1);
          }
           else{
               wordFreq.add(new wordCount(temp,1));
          }
        }


    }

}