import java.util.Objects;

class Person {
   String name;
   int age;

   Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public boolean equals(Object p) {
      if (this == p) {
         return true;
      } else if (p != null && p.getClass() == this.getClass()) {
         Person person = (Person)p;
         return person.age == this.age && Objects.equals(this.name, person.name);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.name, this.age});
   }
}
