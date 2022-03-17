package Inheritance;

/*-name:String
-lastname:String
-age: int
-codestudent:int
-Finalnote:float

+estudent(name,lastname,age,codestudent,finalnote)
+getName():String
+getLastname():String
+getAge(): int
+showdata():void*/

//daughter class(sub class)

import javax.management.NotificationEmitter;

public class Student extends Person{
    private int codeStudent;
    private float finalNote;

    public Student(String Name, String LastName , int Age, int codeStudent, float FinalNote) {
        super (Name, LastName, Age);
        this.codeStudent = codeStudent;
        this.finalNote = FinalNote;

    }
    public void Viewdata(){
        System.out.println("Name: "+getName() + "LastName: "+getLastName()+  "Age: "+getAge() +"codeStudent:"+codeStudent +"FinalNote:"+ "FinalNote");

    }

}
