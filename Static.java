
public class Static{
    public static void main(String args[]){
       Student s1 = new Student();
       s1.schoolName = "JNV";

       Student s2 = new Student();
       System.out.println(s2.schoolName);

       Student s3 = new Student();
       s3.schoolName = "JMV";
       System.out.println(s3.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}