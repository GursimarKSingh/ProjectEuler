public class LargestPrimeFactor {


    /**
     * @param args
     */
    public static void main (String[] args){

        StdOut.print("Please enter a number that is postive: ");

        int num = StdIn.readInt();

        int largestPrime = 0;

        for( int i = 1; i <= num; i++){

            boolean tf = false;

            if(num % i == 0){
                tf = isPrime(i);
                if(tf){
                    if(i != num){
                        largestPrime = i;
                    }
                }
            }

        }

        if(largestPrime == 0){
            StdOut.print("there is no largest prime");
        }else{
            StdOut.print(largestPrime);
        }
    }

    public static boolean isPrime(int num){
        
        if(num == 1 || num == 0){
            return false;
        }


        for(int i = 2; i <= num; i++){

            if(num % i == 0){

                if( i == 1 || i == num){
                    continue;
                }else{
                    return false;
                }
            }

        }
        return true;

    }
}
