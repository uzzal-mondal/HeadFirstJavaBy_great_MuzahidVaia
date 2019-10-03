package HeadFirstjava.BasicHeadJava;

import java.util.Scanner;

public class IfElseStudentInfo_4 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Student name info : ");
        String stdName = sc.nextLine();
        System.out.println("Student point info : ");
        double d = sc.nextDouble();
        System.out.println("Student roll info : ");
        int roll = sc.nextInt();


        /*double d = 4.94;
        int roll = 1;
        String stdName = "Uzzal";*/

        if ((d<5.00) && (roll<=1) && (stdName.equals("Uzzal"))){

            System.out.println("This is Examinne History:- "+"Point:  "+d+", " +"Roll: "+" "+roll+", "+"Student Name: "+stdName);
        }else{


            System.out.println(" please Input the Student Data : ");
        }
    }
}
