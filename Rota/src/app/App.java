package app;

import java.util.ArrayList;
import java.util.List;

public class App {

   private static String[][] peopleSkills = {
           { "Oliver", "programming", "electronics" },
           { "Jake", "reception", "engineering" },
           { "Amelia", "programming", "reception", "electronics", "management" },
           { "Noah", "management", "electronics" },
           { "James", "programming", "management", "electronics" },
           { "Margaret", "engineering", "electronics", "programming", "reception" },
           { "Emma", "programming"},
           { "Jack", "engineering", "electronics", "programming" },
           { "Mary", "engineering", "electronics" },
   };

   public static void main(String[] args) {

      Rota rota = new Rota();
      rota.add(loadData());

      //rota.nextWeek();

      System.out.println(rota);
   }

   private static List<Person> loadData() {
      List<Person> people = new ArrayList<>();

      for (String[] row : peopleSkills) {
         String name = row[0];

         Person person = new Person(name);

         for (int i = 1; i < row.length; i++) {
            if (name.equals("Margaret")) {
               person.setOnHoliday(true);
            }
            String skill = row[i];

            person.addSkill(Skill.valueOf(skill.toUpperCase()));
         }

         people.add(person);
      }

      return people;
   }
}
