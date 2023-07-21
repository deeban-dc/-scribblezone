package Person;

public  class Person {
     String name;
     int age;
     String occupation;

     static int eyes = 2;

     public  Person(String name, int age, String occupation){
         this.name = name;
         this.age = age;
         this.occupation = occupation;
     }

     String get_name() {
         return name;
     }

     int get_age(){
         return age;
     }

     String get_occupation(){
         return occupation;
     }

     void set_name(String newname){
         name = newname;
     }

     void set_age(int newage){
         age = newage;
     }

     void set_occupation(String newoccupation){
         occupation = newoccupation;
     }
}




