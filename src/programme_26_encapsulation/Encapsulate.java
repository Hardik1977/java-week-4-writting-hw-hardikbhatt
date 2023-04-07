package programme_26_encapsulation;

public class Encapsulate {
    //private variable declared these can only be accessed by public method of class

    private String name;
    private int rollNo;
    private int age;

    //get method for name to acdess private variable name

    public String getName() {
        return name;
    }

    //set method for name to access private variable name
    public void setName(String Name) {
        this.name = name;
    }

    //get mothod for rollNo to access rpivate variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    //set method for age to access private variable age
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    //get method for age to access private variable age
    public int getAge() {
        return age;
    }

    //set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }
}
