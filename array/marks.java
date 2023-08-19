import java.util.*;
class marks{
    public static void total(int marks[]){  // created a function for total of marks 
         int total = + marks[0]+ marks[1] + marks[2];
      System.out.println("total is :- " + total);
    }
     public static void percentage(int marks[]){  // created a function for percentage 
         int total = + ((marks[0]+ marks[1] + marks[2])/3);
      System.out.println("percentage is :- " + total + "%");
    }
    public static void main(String[] args) {
        int marks[] = new int[5];
       Scanner sc = new Scanner(System.in);  //input of marks from student/teacher
       System.out.println("enter your cs marks"); 
       marks[0] = sc.nextInt();
       System.out.println("enter your wt marks");
       marks[1] = sc.nextInt();
       System.out.println("enter your dbms marks");
      marks[2] = sc.nextInt();

      System.out.println("cs marks :" + marks[0]);
      System.out.println("wt marks :" + marks[1]);
      System.out.println("Dbms marks :" + marks[2]);
      total(marks);  // calling function of total
      percentage(marks); //calling funcation percentage 
     
    }
}