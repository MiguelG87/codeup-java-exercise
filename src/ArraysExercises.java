public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);//array does not print out. Need for loop to go through all items and print
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Joe");
        people[2] = new Person("Jane");
        for (int i = 0; i < people.length; i++){
            System.out.println(people[i]);
        }
    }
    public static Person[] addPerson(Person[] people, Person personToAdd){
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        newPeople[newPeople.length - 1] = personToAdd;
        return newPeople;
    }
}
