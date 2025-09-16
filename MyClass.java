public class MyClass{
    private String fname;
    private String lname;
    private int age;

    MyClass(String f, String l, int a){
        fname = f;
        lname = l;
        age = a;
    }

    MyClass(MyClass other){
        this.fname = other.fname;
        this.lname = other.lname;
        this.age = other.age;
    }

}