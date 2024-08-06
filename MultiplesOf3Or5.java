
public class MultiplesOf3Or5 {

public static void main( String[]args ){

    StdOut.println("if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 2,5,6, and 9. The sum of all these numbers is 23" );

    System.out.println("enter a number from 10 - 1000");
    
    int input = StdIn.readInt();
    while(input < 10 || input > 1000){
        StdOut.println("please enter a number between 10 - 1000");
        input = StdIn.readInt();
        

    }
    
    int sum = 0;

    for(int i = input -1; i > 0; i--){
        if(i % 3 == 0 || i %5 ==0 ){
            sum += i;
        }

    }

    StdOut.println("Total sum of all natural numbers under " + input +": " + sum);


}

}
