package Person;
//import Person.Person;
public class main {
    public static void main(String[] args){
        Person Person1 = new Person("Deeban",13,"Student" );
        Person Person2 = new Person("Barbie",22, "Actress");
        Person Person3 = new Person("Thomas Shelby",34,"Gangster");

        System.out.println(Person3.name +" "+ Person3.occupation+" "+ Person3.age);
        System.out.println(Person3.get_name());
        System.out.println(Person3.get_occupation());
        System.out.println(Person3.get_age());

        Person3.set_name("Goofy");
        Person3.set_occupation("DevOps");
        Person3.set_age(Person3.age+1);

        System.out.println(Person3.get_name());
        System.out.println(Person3.get_occupation());
        System.out.println(Person3.get_age());

        System.out.println("He has "+Person3.eyes+" eyes");


    }
}
