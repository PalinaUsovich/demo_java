package Practise;

public class Student {
    private String name;
    private String education;
    private int age;
    private int studentID;
    private String computerType;

   public Student (String name,String education,int age, int studentID,String computerType){
       this.name=name;
       this.education=education;
       this.age=age;
       this.studentID=studentID;
       this.computerType=computerType;
   }
   public void punctuality(){
        System.out.println("Student is always on time ");
   }
    public void attendance(int classesAttended){
        System.out.println("good student");
    }

    public void attendance(){
       System.out.println("Student is never on time ");
   }
   public void proactive(){
       System.out.println("Student is always prepared ");
   }
   public String getName(){
       return name;
    }

}