public class LargestPalindromeProduct {


    public static void main (String[] args){

        int largestnum = 0;


        for (int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){

                int product = i* j;
                String str = Integer.toString(product);

                if(isPalindrome(str) && product > largestnum){
                    largestnum = product;
                }

            }
        }

        StdOut.print(largestnum);
    }

    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){

            if(str.charAt(i)== str.charAt(str.length()-1-i)){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }


}
