public class EvenFibonacciNumbers {

    public static void main ( String[] args){

        int fibnumber1 = 1;
        int fibnumber2 =1;

        StdOut.println("The purpose of this code is to add the sum of all the even number of fibonnaci numbers");

        int sum = fibnumber1 + fibnumber2;


        while( sum < 100){
            
            int old = fibnumber1;
            fibnumber1 = fibnumber2;
            fibnumber2 = old + fibnumber2;
            

            if(fibnumber2 % 2 == 0){
                if(fibnumber2 != 2){
                    sum += fibnumber2;
                }
                                
            }
        }

        StdOut.println(sum);

    }

}
