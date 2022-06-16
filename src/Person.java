public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public String getName(){
    //TODO: return the person's name
        return this.name = name;
    }
    public void setName(String name){
    //TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.printf("Hello, my name is %s and I like turtles!\n", this.name);
    }

    public static void main(String[] args) {
        Person jake = new Person("Jake from State Farm");
        System.out.println(jake.getName());
        jake.setName("Derek");
        System.out.println(jake.getName());
        jake.sayHello();
        Person miguelito = jake;
        System.out.println(miguelito.getName());
    }


}
