import java.util.*;

class Calculator{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 2 no. :- ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.print("Enter 1 for addition :- \nEnter 2 for subtraction :- \nEnter 3 for multiplication :- \nEnter 4 for division :- ");
    int c=sc.nextInt();
    switch (c){
    case 1:
      System.out.print(a+b);
      break;
    case 2:
      System.out.print(a-b);
      break;
    case 3:
      System.out.print(a*b);
      break;
    case 4:
      System.out.print(a/b);
      break;
    default:
      System.out.print("Invalid Input");
      break;
    }
  }
}