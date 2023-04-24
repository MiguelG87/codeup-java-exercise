public class Person {
    private String name;
    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
        System.out.println(name);
//TODO: print a message to the console using the person's name
    }
    public Person(String name){
        this.name = name;
    }
    public static void main(String[] args){
//        Person person1 = new Person("Miguel");
//        Person person2 = new Person("Miguel");
//        System.out.println(person1.getName().equals(person2.getName()));//true
//        System.out.println(person1 == person2);//false
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);//true
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());//John
        System.out.println(person2.getName());//John
        person2.setName("Jane");
        System.out.println(person1.getName());//Jane
        System.out.println(person2.getName());//Jane

    }
}
