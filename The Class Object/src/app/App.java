package app;


import java.io.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {

   public static void main(String[] args) throws IOException {

      var words1984File = new File("E:/IntelliJ/java-project0/The Class Object/src/1984.txt");
      var wordsAnimalFarm = new File("E:/IntelliJ/java-project0/The Class Object/src/animalfarm.txt");

      var set1984 = loadWords(words1984File);
      var setAnimalFarm = loadWords(wordsAnimalFarm);

      System.out.println("Unique words is animalfarm: " + setAnimalFarm.size());
      System.out.println("Unique words is 1984: " + set1984.size());

      var setOnlyIn1984 = new TreeSet<String>(set1984);
      setOnlyIn1984.removeAll(setAnimalFarm);
      System.out.println("Only in 1984: " + setOnlyIn1984.size() + " words");

      var setOnlyInAnimalFarm = new TreeSet<String>(setAnimalFarm);
      setOnlyInAnimalFarm.removeAll(set1984);
      System.out.println("Only in Animal Farm: " + setOnlyInAnimalFarm.size() + " words");

      var setBoth = new TreeSet<String>(set1984);
      setBoth.retainAll(setAnimalFarm);
      System.out.println("In both: " + setBoth.size() + " words");


      displayWords(setOnlyIn1984);
/*                         HTML
      File f = new File("C:/Users/User/Desktop/test.html");
      BufferedWriter br = new BufferedWriter(new FileWriter(f));
      for (var word:set1984) {
         br.write("<div><p> " + word  + " </p></div>");
      }
*/
   }

   private static void displayWords(Set<String> words) {
      int index = 0;

      for (var word:words) {
         System.out.printf("%-15s", word);

         if (++index % 10 == 0) {
            System.out.println();
         }
      }
   }

   public static SortedSet<String> loadWords(File file) throws IOException {

      TreeSet<String> wordSet = new TreeSet<>();

      try(BufferedReader br = new BufferedReader(new FileReader(file))) {
         String line;

         while ((line = br.readLine()) != null) {
            String[] words = line.split("[^a-zA-Z]+");

            for (String word: words) {
               wordSet.add(word.toLowerCase());

            }
         }
      }

      return wordSet;
   }



}
