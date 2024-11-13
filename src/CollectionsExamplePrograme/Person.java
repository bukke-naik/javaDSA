package CollectionsExamplePrograme;

public class Person {
    String firstName ;
    int age ;
    String LastName;

    Person(String firstName,String lastName,int age){
        this.age = age;
        this.firstName =firstName;
        this.LastName=lastName;
    }

    @Override
    public String toString() {
        return firstName +LastName+ " (" + age + " years old)";
    }
}



