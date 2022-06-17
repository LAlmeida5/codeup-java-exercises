import java.util.Arrays;

public class ArraysExercises {
    static Person[] people = new Person []
            {new Person("Derek"), new Person("Dalton"), new Person("Dwayne")};

    public static Person[] addPerson(Person[] arr , Person newPerson) {
        Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = newPerson;
        return newArr;
    }

    public static void main(String[] args) {
        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person[] addedPerson = addPerson(people, new Person("Jacob"));

        for (Person  person : addedPerson) {
            System.out.println(person.getName());
        }
    }
}
