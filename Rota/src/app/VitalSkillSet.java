package app;

import java.util.HashSet;
import java.util.Set;
import static app.Skill.*;



public class VitalSkillSet extends HashSet<Skill> {

   private Set<Skill> vitalSkills = Set.of(PROGRAMMING, MANAGEMENT, RECEPTION);

   public boolean isComplete() {
      for (Skill skill:vitalSkills) {
         if (!contains(skill)) {
            return false;
         }
      }
      return true;
   }
}
