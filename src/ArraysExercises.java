import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        for(int i : numbers){
            System.out.println(i);
        }
        Person[] people = new Person[3];
        System.out.println(Arrays.toString(people));
        people[0] = new Person("Robert");
        people[1] = new Person("Pedro");
        people[2] = new Person("Juan");
        System.out.println(Arrays.toString(people));
        for (Person i : people) {
            System.out.println(i.getName());
        }
        Person personToAdd = new Person("James");
        Person[] peopleAddOne = addPerson(people,personToAdd);
        System.out.println(Arrays.toString(peopleAddOne));
        for (Person i : peopleAddOne) {
            System.out.println(i.getName());
        }
    }

    public static Person[] addPerson(Person[] arr, Person person){
        Person[] arr2 = Arrays.copyOf(arr, (arr.length + 1));
        arr2[arr.length] = person;
        return arr2;
    }
}
