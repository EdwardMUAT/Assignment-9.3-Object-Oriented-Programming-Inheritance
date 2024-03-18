/*
The Person class should have a first name, last name, and title public properties.
The Person class should have a public talk method.
The Person class should have a public eat method.
The Person class should have a public sleep method.
The Person class should have a private property location.
The Person class should have public methods to get and set the private property location. */


//This eperson class should have a public talk method
// We could but WILL NOT be making an object of this class.
// We will be making objects of the child classes.
public class Person{
    // This is a private orioerty that can only be accessed buy thid class
    public Person(String location,String name){
        m_location = location;
        m_name = name;
    }

    // This is a private orioerty that can only be accessed buy thid class
    private String m_location;
    //add a name for the person
    private String m_name;

//Create a public method yo get the location of the person
    public String getLocation() {
        return m_location;
    }

// Create a public methid to set the location of the person
    public void setLocation( String location){
        m_location = location;
    }

//Create a public method to  display the location of the person
    public void displaylocation(){
        System.out.println(m_name + " is at: " + m_location);
    }

    //The Person class should have a public talk method.
    public void talk(String words) {
        System.out.println(m_name + " says: " + words);
    }
    //The Person class should have a public eat method.
    public void eat(String food){
        System.out.println(m_name + " eats: " + food);
        // TODO: Increase the persons health if they eat.
    }
    //The Person class should have a public sleep method.
    public void sleep(){
        System.out.println(m_name + " is sleeping.");
        // TODO: Increase the persons health if they sleep.
    }

}