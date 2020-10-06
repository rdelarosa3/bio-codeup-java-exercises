public class Person {

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
    private String name;

    public Person(String personName){
        this.name = personName;
    }

    public String getName(){
    //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
    //TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.println("Hi my name is " + this.name);
    }
}
