import java.util.Arrays;

public class ArraysExercises {
public static Person[] addPerson(Person[] people, Person newPerson) {
    Person[] output = Arrays.copyOf(people, people.length + 1);
    output[output.length - 1] = newPerson;
    return output;
}
    public static void main(String[] args){
        Person[] people = new Person[3];
        people[0] = new Person("Justin");
        people[1] = new Person("Javier");
        people[2] = new Person("Laura");

        for (Person person : people){
            System.out.println(person.getName());
        }
    }
}
