package HeadFirstjava.BasicHeadJava;

public class ForAndWhile_2 {

    public static void main(String args[]){

        int l = 15;
        while (l>12){
            System.out.println("While loop: "+l);
            l = l-1;
        }

        System.out.println("\n");


        for (int i=0; i<=5; i=i+1){

            System.out.println(" i is now "+i);
        }

        /*This is for output  Loops for and while


                    While loop: 15
                    While loop: 14
                    While loop: 13


                     i is now 0
                     i is now 1
                     i is now 2
                     i is now 3
                     i is now 4
                     i is now 5

          */

    }
}
