import com.sun.jdi.PrimitiveValue;

//Definitions
//#1: Variables
    //are containers for storing data values. In Java, there are different types of variables
//#2: Statically Types Language
    //when we do assign values to variables in Java we need to declare what type of data we are storing in those variables or what type of data those variables are referring too
//#3: Dynamically Types Languages
    //in these languages you don't have to specify what kind of data is going into them(a language like javascript is a dynamically typed language)
//#4: Constant Variables
    //Constant in Java is an entity that cannot be changed once assigned. Constance have to be all capitalized and if the name of the constance is more than one word you separate then with underscores. EX: FIRST_NAME
public class Person {

    //Some data types are white and others are orange. . The orange colored data types are primitives.
    //WHITE DATA TYPES:
        // The white colored data types indicates that they are classes
        // the variables that hold class data types are actually called reference to objects. Classes give birth to objects
    //ANATOMY OF A FIELD
        //the first but in the field is the data type
        //the last bit is the name so that you can reference the data

    //Names of variables have to be camel cased. For Ex myNameIsMike
    private String firstName = "Jerry";


    //ANATOMY OF A CONSTANT VARIABLE  (#4)
        //first comes the access modifier
        //then comes the final key word which means unchangeable.
        //Then comes the variable type
        //then the name of variable
        //lastly assigning it a data
    private final double PHONE_NUMBER = 12345466;
    private int age;
    private long id;
    private char middleInitial = 'f';
    private byte myByte;
    //So this field creates an instance of a class. due to the 'new' keyword being in field next to the Dog() it create an instance of Dog
    //ANATOMY OF CREATING A CLASS DATA TYPE
        //first comes the access modifier
        //the next bit is calling on the classes blueprint
        //then the name of the variable
        //after the equals we are creating an instance of Dog. When the code sees Dog() with the parenthesis its telling java to take the blueprint from Dog and go build be an actual Dog. When the Dog is build then java returns an address or a specific code (this code refers to where your object lives in your computer) and saves it to the variables name. That specific key refers back to the Dog that was build.
    private Dog dog = new Dog();

    private Cat cat;


}


