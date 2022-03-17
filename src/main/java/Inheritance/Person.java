package Inheritance;


//Person atributes
/*name:String*/
/*lastname:String
age:int

+person(name,lastname,age)
+getName():String
+getLastname():String
+getAge():int*/

//Mum class (super class)

public class Person {
    private String Name;
    private String LastName;
    private int Age;

    public Person (String Name, String LastName, int Age) {
        this.Name = Name;
        this.LastName = LastName;
        this.Age = Age;

    }

    public String getName() {

        return Name;
    }

    public String getLastName(){

        return LastName;
    }

    public int getAge(){
        return Age;
    }

}
